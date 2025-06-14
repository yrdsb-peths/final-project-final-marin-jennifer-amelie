import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is for animating the capybara sprite
 */

public class Capybara extends Actor
{
    // speed of descend
    public int vSpeed;
    // value of gravity
    public int gravity = 2;
    
    // to check if jump or not 
    public boolean jumping;
    
    // how high capybara can jump
    public int jumpStrength = 15;
    
    
    // initializing the arrays
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] walkRight = new GreenfootImage[5];
    GreenfootImage[] walkLeft = new GreenfootImage[5];
    GreenfootImage[] jumpRight = new GreenfootImage[5];
    GreenfootImage[] jumpLeft = new GreenfootImage[5];
    
    //direction of capybara
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    // number of coins being collected 
    public int coinsNum = 0;
    
    
    
    /**
     * constructor - code gets run first time instance created
     */
    
    public Capybara() {
        // idle animation
        for(int i = 0; i<idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/idle_capybara/idle00"+i+".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(50, 50);
        }
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/idle_capybara/idle00"+i+".png");
            idleLeft[i].scale(50, 50);
        }
        
        // walking animation
        for(int i = 0; i<walkRight.length; i++){
            walkRight[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkRight[i].mirrorHorizontally();
            walkRight[i].scale(50, 50);
        }
        for(int i = 0; i<walkLeft.length; i++){
            walkLeft[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkLeft[i].scale(50, 50);
        }
        
        // jumping animation
        for(int i = 0; i<jumpRight.length; i++){
            jumpRight[i] = new GreenfootImage("images/jump_capybara/jump00"+i+".png");
            jumpRight[i].mirrorHorizontally();
            jumpRight[i].scale(50, 50);
        }
        for(int i = 0; i<jumpLeft.length; i++){
            jumpLeft[i] = new GreenfootImage("images/jump_capybara/jump00"+i+".png");
            jumpLeft[i].scale(50, 50);
        }
        
        animationTimer.mark();
        setImage(idleRight[0]);
        setImage(walkRight[0]);
        setImage(jumpRight[0]);
    }
    int idleIndex = 0;
    int walkingIndex = 0;
    int jumpIndex = 0;
    
    // animate capybara
    public void idleCapybara(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[idleIndex]);
            idleIndex = (idleIndex + 1) % idleRight.length;  
        } else {
            setImage(idleLeft[idleIndex]);
            idleIndex = (idleIndex + 1) % idleLeft.length;
        }
        
    }
    // walking
    public void walkingCapybara(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(walkRight[walkingIndex]);
            walkingIndex = (walkingIndex + 1) % walkRight.length;  
        } else {
            setImage(walkLeft[walkingIndex]);
            walkingIndex = (walkingIndex + 1) % walkLeft.length;
        }
        
    }
    
    // jumping animation
    public void jumpCapybara(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(jumpRight[jumpIndex]);
            jumpIndex = (jumpIndex + 1) % jumpRight.length;  
        } else {
            setImage(jumpLeft[jumpIndex]);
            jumpIndex = (jumpIndex + 1) % jumpLeft.length;
        }
    }
    
    
    // jumping 
    public void jump() {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
    
    // run function
    public void act()
    {
        MainWorld world = (MainWorld) getWorld();
        GreenfootSound hop = new GreenfootSound("jump.mp3");
        hop.setVolume(50);
        if (world.isGameOver()) {
            return;
        }

        checkFall();
        if(Greenfoot.isKeyDown("left")){            
            move(-7);
            facing = "left";
            walkingCapybara();
        }
        if(Greenfoot.isKeyDown("right")){
            move(7);
            facing = "right";
            walkingCapybara();
        }
        if (Greenfoot.isKeyDown("up") && jumping == false) {
            if (facing.equals("left")) {
                facing = "left";
            }
            if (facing.equals("right")) {
                facing = "right";
            }
            jumpCapybara();
            jump();
            hop.play();
        }
            
        //collect coins 
        if(isTouching(Coin.class)){
            removeTouching(Coin.class);
            coinsNum++;
            world.incrementCoinCount(); // new method you'll create         
        }
            
        //going to the ending
        goToEnd();
            
        idleCapybara();
    }
    
    public void checkFall() {
        if (onGround() == true) {
            vSpeed = 0;
        } else {
            fall();
        }
    }
    
    public void fall() {
        setLocation(getX(), getY() + vSpeed);
        
        if(vSpeed <=12) {
            vSpeed = vSpeed + gravity;
            jumping = true;
        }
    }
    
    public boolean onGround() {
        int spriteHeight = getImage().getHeight();
        int lookForGround = spriteHeight/2;
        
        Actor ground = getOneObjectAtOffset(0, lookForGround, Log.class);
       
        if (ground == null) {
            jumping = true;
            return false;
        } else {
            moveToGround(ground);
            return true;
        }
    }
    
    public void moveToGround(Actor ground) {
        int groundHeight = ground.getImage().getHeight();
        int newY = ground.getY() - (groundHeight + getImage().getHeight())/2;
        
        setLocation(getX(), newY);
        jumping = false;
    }
    
    public void goToEnd(){
        if(isTouching(Portal.class)){
            if(coinsNum == 6){
                Ending end = new Ending();
                Greenfoot.setWorld(end);
            }
            else{
                Ending2 end2 = new Ending2();
                Greenfoot.setWorld(end2);
            }
        }
    }
}
