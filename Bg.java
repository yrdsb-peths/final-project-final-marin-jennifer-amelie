import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
