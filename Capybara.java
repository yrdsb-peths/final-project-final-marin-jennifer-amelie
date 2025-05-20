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
    
    /**
     * constructor - code gets run first time instance created
     */
    
    public Capybara() {
        for(int i = 0; i<idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            idleRight[i].scale(120, 100);
        }
        for(int i = 0; i<idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/walking_capybara/walking00"+i+".png");
            idleLeft[i].mirrorHorizontally();
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
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){            
            move(-5);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
        }
        animateCapybara();
    }
    
    
}
