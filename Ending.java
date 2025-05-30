import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ending extends World
{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        MrBigRender mr = new MrBigRender();
        addObject(mr, 480, 250);
        
        Bara bara = new Bara();
        addObject(bara, 100, 250);
    }
}
