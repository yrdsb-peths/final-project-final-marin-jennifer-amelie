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
        addObject(capybara, 60, 550);
        //adding platforms
        Log floor = new Log("short");
        addObject(floor, 80, 575);
        Log floor1 = new Log("med");
        addObject(floor1, 380, 575);
        Log floor2 = new Log("short");
        addObject(floor2, 670, 575);
        Log floor3 = new Log("stump");
        addObject(floor3, 740, 540);
        
        Log fs = new Log("long");
        addObject(fs, 350, 425);
        Log fs1 = new Log("stump");
        addObject(fs1, 0, 370);
        
        Log sd = new Log("short");
        addObject(sd, 180, 325);
    }
}
