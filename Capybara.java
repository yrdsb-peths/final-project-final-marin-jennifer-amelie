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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    GreenfootImage[] walkRight = new GreenfootImage[5];
    GreenfootImage[] walkLeft = new GreenfootImage[5];
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
            idleRight[i].scale(120, 120);
        }
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/idle_capybara/idle00"+i+".png");
            idleLeft[i].scale(120, 120);
        }
        
        // walking animation
        for(int i = 0; i<walkRight.length; i++){
            walkRight[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkRight[i].mirrorHorizontally();
            walkRight[i].scale(120, 100);
        }
        for(int i = 0; i<walkLeft.length; i++){
            walkLeft[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            walkLeft[i].scale(120, 100);
        }
        animationTimer.mark();
        setImage(idleRight[0]);
        setImage(walkRight[0]);
    }
    int imageIndex = 0;
    
    // capybara animations
    //idle
    public void idleCapybara(){
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
    // walking
    public void walkingCapybara(){
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(walkRight[imageIndex]);
            imageIndex = (imageIndex + 1) % walkRight.length;  
        } else {
            setImage(walkLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % walkLeft.length;
        }
        
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
        idleCapybara();
    }
    
    
}
