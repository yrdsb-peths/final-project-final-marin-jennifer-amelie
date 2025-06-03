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
                Medium world2 = new Medium();
                Greenfoot.setWorld(world2);
            }
            if(world.equals("Medium")){
                Hard world2 = new Hard();
                Greenfoot.setWorld(world2);
            }
            if(world.equals("Hard")){
                Ending world2 = new Ending();
                Greenfoot.setWorld(world2);
            }
        }
    }
}
