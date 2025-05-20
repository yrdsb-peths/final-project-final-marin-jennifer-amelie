import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        setBackground("menuBG.png");
        Tree easy = new Tree();
        addObject(easy, 100, 225);
        showText("1", 110, 305);
        Tree med = new Tree();
        addObject(med, 300, 225);
        showText("2", 310, 305);
        Tree hard = new Tree();
        addObject(hard, 500, 225);
        showText("3", 510, 305);
        
    }
}
