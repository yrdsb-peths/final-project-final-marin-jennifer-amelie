import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Tree easy;
    Tree med;
    Tree hard;
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
        //add easy tree
        easy = new Tree();
        addObject(easy, 100, 325);
        showText("1", 110, 440);
        //add med tree
        med = new Tree();
        addObject(med, 300, 325);
        showText("2", 310, 440);
        //add hard tree
        hard = new Tree();
        addObject(hard, 500, 325);
        showText("3", 510, 440);
        //add title
        Label label = new Label("Select a level", 60);
        addObject(label, 275, 100);
    }
    public void act(){
        if(Greenfoot.mouseClicked(med)){
            MyWorld world2 = new MyWorld();
            Greenfoot.setWorld(world2);
        }
    }
}
