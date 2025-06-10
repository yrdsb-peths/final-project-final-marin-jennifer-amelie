import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bird sprite that appears in the introductory scenes
 */
public class Birdie extends Actor
{
    // sprite has 14 images
    GreenfootImage[] birdie = new GreenfootImage[14];
    
    // animation timer
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Birdie() {
       // loops through the array
        for(int i = 0; i<birdie.length; i++){
            birdie[i] = new GreenfootImage("images/birdie/frame_"+i+"_delay-0.04s.gif");
            birdie[i].scale(100, 100);
        }
        
        // sets the default image
        setImage(birdie[0]);
    }
    
    int birdieIndex = 0;
    
    public void birdie () {
        // animates the bird
        if(animationTimer.millisElapsed() < 100){
            return;
        }
        animationTimer.mark();
        setImage(birdie[birdieIndex]);
        birdieIndex = (birdieIndex + 1) % birdie.length;
    }
}
