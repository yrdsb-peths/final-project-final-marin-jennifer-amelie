import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends MainWorld
{

    /**
     * Constructor for objects of class Easy.
     * 
     */
    public Medium() { 
        super(680, 520, 1);
        setBackground("levels/easy.png");
        
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 485);
        
        // toxin
        Toxin toxin = new Toxin(80, 15);
        addObject(toxin, 195, 575);
        
        Toxin toxin2 = new Toxin(100, 15);
        addObject(toxin2, 550, 575);
        
        Toxin toxin3 = new Toxin(270, 15);
        addObject(toxin3, 395, 285);
        
        //adding platforms
        Log floor = new Log("med");
        addObject(floor, 10, 575);
        Log floor1 = new Log("med");
        addObject(floor1, 375, 575);
        Log floor3 = new Log("stump");
        addObject(floor3, 640, 540);
        
        Log fs = new Log("med");
        addObject(fs, 450, 425);
        Log fs1 = new Log("stump");
        addObject(fs1, 100, 350);
        Log fs2 = new Log("short");
        addObject(fs2, 175, 425);
        
        Log sd = new Log("short");
        addObject(sd, 220, 285);
        Log sd1 = new Log("short");
        addObject(sd1, 400, 260);
        Log sd2 = new Log("short");
        addObject(sd2, 575, 285);
        Log sd3 = new Log("stump");
        addObject(sd3, 725, 210);
        
        Log last = new Log("short");
        addObject(last, 570, 140);
        Log last1 = new Log("med");
        addObject(last1, 375, 140);
        Log last2 = new Log("short");
        addObject(last2, 100, 125);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 100, 90);
        
    }
}
