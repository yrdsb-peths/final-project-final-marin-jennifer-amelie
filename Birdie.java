import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Birdie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Birdie extends Actor
{
    GreenfootImage[] birdie = new GreenfootImage[14];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Birdie() {
        for(int i = 0; i<birdie.length; i++){
            birdie[i] = new GreenfootImage("images/birdie/frame_"+i+"_delay-0.04s.gif");
            birdie[i].scale(100, 100);
        }
        
        setImage(birdie[0]);
    }
    
    int birdieIndex = 0;
    
    public void birdie () {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(birdie[birdieIndex]);
        birdieIndex = (birdieIndex + 1) % birdie.length;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
