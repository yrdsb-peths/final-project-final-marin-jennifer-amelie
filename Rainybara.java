import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingbara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rainybara extends Actor
{
    GreenfootImage[] rainybara = new GreenfootImage[8];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Rainybara() {
        for(int i = 0; i<rainybara.length; i++){
            rainybara[i] = new GreenfootImage("images/rainybara/frame_"+i+"_delay-0.1s.gif");
            rainybara[i].scale(150, 150);
        }
        
        setImage(rainybara[0]);
    }
    
    int rainybaraIndex = 0;
    // narration
    public void rainybara () {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(rainybara[rainybaraIndex]);
        rainybaraIndex = (rainybaraIndex + 1) % rainybara.length;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
