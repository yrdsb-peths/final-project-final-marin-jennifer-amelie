import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Platform() {
        GreenfootImage plank = new GreenfootImage("images/treetrucks/wood_plank.png");
        plank.scale(100, 20); 
        setImage(plank);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
