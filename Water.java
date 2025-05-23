import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    GreenfootImage[] waves = new GreenfootImage[63];
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Water() {
        for(int i = 1; i<waves.length; i++){
            waves[i] = new GreenfootImage("images/waterAnimation/waterAnimation"+i+".png");
            waves[i].scale(90, 75);
        }
        animationTimer.mark();
        setImage(waves[0]);
    }
    
    public void waving() {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[idleIndex]);
            idleIndex = (idleIndex + 1) % idleRight.length;  
        } else {
            setImage(idleLeft[idleIndex]);
            idleIndex = (idleIndex + 1) % idleLeft.length;
        }
    }
    public void act()
    {
        
    }
}
