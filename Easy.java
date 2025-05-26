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
        Log floor = new Log("med");
        addObject(floor, 10, 575);
        Log floor1 = new Log("med");
        addObject(floor1, 390, 575);
        Log floor2 = new Log("short");
        addObject(floor2, 670, 575);
        Log floor3 = new Log("stump");
        addObject(floor3, 760, 540);
        
        Log fs = new Log("long");
        addObject(fs, 350, 425);
        Log fs1 = new Log("stump");
        addObject(fs1, 50, 370);
        
        Log sd = new Log("short");
        addObject(sd, 220, 325);
        Log sd1 = new Log("short");
        addObject(sd1, 400, 300);
        Log sd2 = new Log("short");
        addObject(sd2, 610, 325);
        Log sd3 = new Log("stump");
        addObject(sd3, 725, 250);
        
        Log last = new Log("short");
        addObject(last, 570, 140);
        Log last1 = new Log("med");
        addObject(last1, 375, 140);
        Log last2 = new Log("short");
        addObject(last2, 100, 125);
    }
}
