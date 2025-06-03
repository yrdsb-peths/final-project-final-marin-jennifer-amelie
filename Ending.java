import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ending extends MainWorld
{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Bird bird = new Bird();
        addObject(bird, 525, 440);
        
        Capybara bara = new Capybara();
        addObject(bara, 50, 325);
        
        Log l = new Log("long");
        addObject(l, 320, 450);
    }
}