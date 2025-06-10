import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The menu background
 */
public class Bg extends Actor
{
    /**
     * Act - do whatever the Bg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage bg = new GreenfootImage("images/menuBG.png");
        bg.scale(600, 600);
        setImage(bg);
    }
}
