import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingbara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scaredbara extends Actor
{
    GreenfootImage[] scaredbara = new GreenfootImage[8];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scaredbara() {
        for(int i = 0; i<scaredbara.length; i++){
            scaredbara[i] = new GreenfootImage("images/scaredbara/frame_"+i+"_delay-0.1s.gif");
            scaredbara[i].scale(150, 150);
        }
        
        setImage(scaredbara[0]);
    }
    
    int scaredbaraIndex = 0;
    // narration
    public void scaredbara () {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(scaredbara[scaredbaraIndex]);
        scaredbaraIndex = (scaredbaraIndex + 1) % scaredbara.length;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
