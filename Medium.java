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
        
        //switch
        Switch s = new Switch();
        addObject(s, 570, 110);
        
        //adding platforms
        Log floor = new Log("med");
        addObject(floor, 10, 575);
        Log floor1 = new Log("med");
        addObject(floor1, 380, 575);
        Log floor2 = new Log("short");
        addObject(floor2, 670, 575);
        Log floor3 = new Log("stump");
        addObject(floor3, 760, 540);
        
        Log fs = new Log("med");
        addObject(fs, 420, 425);
        Log fs2 = new Log("short");
        addObject(fs2, 180, 425);
        Log fs1 = new Log("stump");
        addObject(fs1, 50, 350);
        
        Log sd = new Log("short");
        addObject(sd, 220, 290);
        Log sd1 = new Log("short");
        addObject(sd1, 400, 275);
        Log sd2 = new Log("short");
        addObject(sd2, 580, 290);
        Log sd3 = new Log("stump");
        addObject(sd3, 725, 225);
        
        Log last = new Log("short");
        addObject(last, 570, 140);
        Log last2 = new Log("short");
        addObject(last2, 100, 125);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 100, 90);
        
        // toxin
        Toxin toxin = new Toxin(90, 15);
        addObject(toxin, 190, 575);
        
        Toxin toxin2 = new Toxin(110, 15);
        addObject(toxin2, 575, 575);
        
        Toxin toxin3 = new Toxin(270, 10);
        addObject(toxin3, 400, 290);
    }
    
    public void act(){
        if(Log.getYes()){
            Log last1 = new Log("med");
            addObject(last1, 375, 140);
        }
    }
}
