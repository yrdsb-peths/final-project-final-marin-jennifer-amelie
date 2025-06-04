import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene2 extends MainWorld
{

    Label label1 = new Label("One day, when Capybara and Birdie are walking in their garden", 30);
    
    public Scene2()
    {
        super(680, 520, 1);
        GreenfootImage kingdomBg = new GreenfootImage("images/garden.png");
        kingdomBg.scale(680, 520); 
        getBackground().drawImage(kingdomBg, 0, 0);
    }
}
