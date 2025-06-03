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
            world.setGameOver(true);
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            getWorld().addObject(new GameOverLabel(gameOverImage), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            
            getWorld().addObject(new RestartButton(), getWorld().getWidth() / 2 - 100, getWorld().getHeight() / 2 + 80);
            getWorld().addObject(new MenuButton(), getWorld().getWidth() / 2 + 100, getWorld().getHeight() / 2 + 80);

        }
    }
}
