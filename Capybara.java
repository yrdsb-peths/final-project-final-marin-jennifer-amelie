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
        setImage(idleRight[0]);
    }
    int imaegIndex = 0;
    
    public void act()
    {
    }
    
    
}
