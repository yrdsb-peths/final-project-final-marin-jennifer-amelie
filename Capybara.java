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
    public void act()
    {
        GreenfootImage[] idleRight = new GreenfootImage[5];
        GreenfootImage[] idleLeft = new GreenfootImage[5];
        //direction of elephant
        String facing = "right";
    }
    
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
}
