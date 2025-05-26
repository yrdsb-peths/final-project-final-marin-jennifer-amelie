import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends World
{

    /**
     * Constructor for objects of class Easy.
     * 
     */
    public Easy()
    {    
        super(800, 600, 1);
        setBackground("levels/easy.png");
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 545);
        //adding platforms
        Log floor = new Log("short");
        addObject(floor, 80, 575);
        Log floor1 = new Log("medium");
        addObject(floor1, 700, 575);
        
    }
}
