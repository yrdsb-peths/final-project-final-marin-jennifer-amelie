import greenfoot.*;
/**
 * Toxin water. If Capybara touches, Capybara would die.
 */
public class Toxin extends Actor
{
    //set the sound.
    GreenfootSound b = new GreenfootSound("blop.mp3");
    
    //Toxin water animation.
    GreenfootImage[] toxin = new GreenfootImage[48];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Toxin(int width, int height) {
        for(int i = 0; i<toxin.length; i++){
           toxin[i] = new GreenfootImage("images/toxinAnimation2/frame_"+(i)+"_delay-0.01s.png");
           toxin[i].scale(width, height);
       }
       animationTimer.mark();
       setImage(toxin[0]);
    }
    
    int toxinIndex = 0;
    
    public void toxing() {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(toxin[toxinIndex]);
        toxinIndex = (toxinIndex + 1) % toxin.length;
    }
    
    public void act()
    {
        MainWorld world = (MainWorld) getWorld();

        toxing();
        
        //Game over if touches Capybara.
        if (isTouching(Capybara.class)) {
            world.setGameOver(true);
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            getWorld().addObject(new GameOverLabel(gameOverImage), getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            b.play();
            getWorld().addObject(new RestartButton(), getWorld().getWidth() / 2 - 100, getWorld().getHeight() / 2 + 80);
            getWorld().addObject(new MenuButton(), getWorld().getWidth() / 2 + 100, getWorld().getHeight() / 2 + 80);
        }
    }
}
