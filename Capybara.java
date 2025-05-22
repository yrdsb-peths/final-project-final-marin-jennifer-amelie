import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Capybara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capybara extends Actor
{
    /**
     * Act - do whatever the Capybara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idleRight = new GreenfootImage[5];
    GreenfootImage[] idleLeft = new GreenfootImage[5];
    //direction of capybara
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * constructor - code gets run first time instance created
     */
    
    public Capybara() {
        for(int i = 0; i<idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(120, 100);
        }
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            idleLeft[i].scale(120, 100);
        }
        animationTimer.mark();
        setImage(idleRight[0]);
    }
    int imageIndex = 0;
    
    // animate capybara
    public void animateCapybara(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;  
        } else {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
        
    }
<<<<<<< Updated upstream
=======
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
    // jumping
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
    
    public void jump() {
        vSpeed = vSpeed - jumpStrength;
        jumping = true;
        fall();
    }
>>>>>>> Stashed changes
    
    public void act()
    {
        checkFall();
        if(Greenfoot.isKeyDown("left")){            
            move(-5);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
        }
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        animateCapybara();
=======
=======
>>>>>>> Stashed changes
        if (Greenfoot.isKeyDown("up") && jumping == false) {
            if (facing.equals("left")) {
                facing = "left";
            }
            if (facing.equals("right")) {
                facing = "right";
            }
            jump();
            // add a jumping sound
            jumpCapybara();
        }
        idleCapybara();
>>>>>>> Stashed changes
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
        
        Actor ground = getOneObjectAtOffset(0, lookForGround, Platform.class);
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
    
}
