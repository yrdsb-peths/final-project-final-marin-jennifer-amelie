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
        super(600, 600, 1, false); 
        Bg bg = new Bg();
        addObject(bg, 300, 300);
        Tree easy = new Tree();
        if(Greenfoot.mouseClicked(easy)){
            MyWorld world1 = new MyWorld();
            Greenfoot.setWorld(world1);
        }
        addObject(easy, 100, 325);
        showText("1", 110, 440);
        Tree med = new Tree();
        addObject(med, 300, 325);
        showText("2", 310, 440);
        Tree hard = new Tree();
        addObject(hard, 500, 325);
        showText("3", 510, 440);
        Label label = new Label("Select a level", 60);
        addObject(label, 275, 100);
    }
}
