import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Portal extends Actor
{
    public Portal(){
        GreenfootImage portal = new GreenfootImage("images/portal.png");
        portal.scale(50, 50);
        setImage(portal);
    }
    
    public void act()
    {
        MainWorld world = (MainWorld) getWorld();
        if (isTouching(Capybara.class)) {
            if(world.equals("Easy")){
                Medium med = new Medium();
                Greenfoot.setWorld(med);
            }
            if(world.equals("Medium")){
                Hard ha = new Hard();
                Greenfoot.setWorld(ha);
            }
            if(world.equals("Hard")){
                Ending world2 = new Ending();
                Greenfoot.setWorld(world2);
            }
        }
    }
}
