import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    GreenfootImage[] waves = new GreenfootImage[48];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Water() {
        for(int i = 0; i<waves.length; i++){
           waves[i] = new GreenfootImage("images/waterAnimation/frame_"+(i)+"_delay-0.01s.png");
           waves[i].scale(50, 20);
       }
       animationTimer.mark();
       setImage(waves[0]);
    }
    
    int waveIndex = 0;
    
    public void waving() {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(waves[waveIndex]);
        waveIndex = (waveIndex + 1) % waves.length;
    }
    public void act()
    {
        waving();
    }
}
