import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kingbara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chillingbara extends Actor
{
    GreenfootImage[] chillingbara = new GreenfootImage[35];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Chillingbara() {
        for(int i = 0; i<chillingbara.length; i++){
            chillingbara[i] = new GreenfootImage("images/chillingbara/frame_"+i+"_delay-0.04s.gif");
            chillingbara[i].scale(200, 200);
        }
        
        setImage(chillingbara[0]);
    }
    
    int chillingbaraIndex = 0;
    // narration
    public void chillingbara () {
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(chillingbara[chillingbaraIndex]);
        chillingbaraIndex = (chillingbaraIndex + 1) % chillingbara.length;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
