import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingbara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kingbara extends Actor
{
    GreenfootImage[] kingbara = new GreenfootImage[33];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Kingbara() {
        for(int i = 0; i<kingbara.length; i++){
            kingbara[i] = new GreenfootImage("images/kingbara/frame_"+i+"_delay-0.12s.gif");
            kingbara[i].scale(400, 400);
        }
        
        setImage(kingbara[0]);
    }
    
    int kingbaraIndex = 0;
    // narration
    public void kingbara () {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(kingbara[kingbaraIndex]);
        kingbaraIndex = (kingbaraIndex + 1) % kingbara.length;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
