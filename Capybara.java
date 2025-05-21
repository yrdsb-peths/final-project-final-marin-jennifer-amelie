import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Capybara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Capybara extends Actor
{
    public int vSpeed;
    public int gravity = 2;
    
    public boolean jumping;
    public int jumpStrength = 20;
    
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] walkRight = new GreenfootImage[5];
    GreenfootImage[] walkLeft = new GreenfootImage[5];
    GreenfootImage[] jumpRight = new GreenfootImage[5];
    GreenfootImage[] jumpLeft =  new GreenfootImage[5];
    
    //direction of capybara
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * constructor - code gets run first time instance created
     */
    
    public Capybara() {
        // idle animation
        for(int i = 0; i<idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/idle_capybara/idle00"+i+".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(80, 80);
        }
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/idle_capybara/idle00"+i+".png");
            idleLeft[i].scale(80, 80);
        }
        
        // walking animation
        for(int i = 0; i<walkRight.length; i++){
            walkRight[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkRight[i].mirrorHorizontally();
            walkRight[i].scale(80, 60);
        }
        for(int i = 0; i<walkLeft.length; i++){
            walkLeft[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkLeft[i].scale(80, 60);
        }
        
        // jumping animation
        for(int i = 0; i<jumpRight.length; i++){
            jumpRight[i] = new GreenfootImage("images/jump_capybara/jump00"+i+".png");
            jumpRight[i].mirrorHorizontally();
            jumpRight[i].scale(80, 60);
        }
        for(int i = 0; i<jumpLeft.length; i++){
            jumpLeft[i] = new GreenfootImage("images/jump_capybara/jump00"+i+".png");
            jumpLeft[i].scale(80, 60);
        }
        
        animationTimer.mark();
        setImage(idleRight[0]);
        setImage(walkRight[0]);
        setImage(jumpRight[0]);
    }
    int idleIndex = 0;
    int walkingIndex = 0;
    int jumpIndex = 0;
    
    // capybara animations
    //idle
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
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){            
            move(-5);
            facing = "left";
            walkingCapybara();
        }
        if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
            walkingCapybara();
        }
        if (Greenfoot.isKeyDown("up")) {
            if (facing.equals("left")) {
                facing = "left";
            }
            if (facing.equals("right")) {
                facing = "right";
            }
            setLocation(getX(), getY() - 5);
            jumpCapybara();
        }
        idleCapybara();
    }
    
    
}
