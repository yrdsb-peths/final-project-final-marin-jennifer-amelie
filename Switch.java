import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch extends Actor
{
    public Switch(){
        GreenfootImage Rswitch = new GreenfootImage("images/switch/Rswitch.png");
        Rswitch.scale(60,60);
        setImage(Rswitch);
    }
    /**
     * Act - do whatever the Switch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage Lswitch = new GreenfootImage("images/switch/Lswitch.png");
        GreenfootSound click = new GreenfootSound("switch.mp3");
        Lswitch.scale(60,60);
        if(isTouching(Capybara.class)&&Greenfoot.isKeyDown("E")){
            click.play();
            setImage(Lswitch);
            Log.setYes(true);
        }
    }
}
