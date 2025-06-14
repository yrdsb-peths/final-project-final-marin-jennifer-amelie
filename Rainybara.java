import greenfoot.*;
/**
 * Image Rainybara, It's raining.
 * Being used in Scene 3.
 * Here is the animetion for Rainybara.
 */
public class Rainybara extends Actor
{
    GreenfootImage[] rainybara = new GreenfootImage[8];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Rainybara() {
        for(int i = 0; i<rainybara.length; i++){

            rainybara[i] = new GreenfootImage("images/rainybara/frame_"+i+"_delay-0.1s.png");
            rainybara[i].scale(150, 150);
        }
        GreenfootImage rainybara = new GreenfootImage("images/rainybara/frame_7_delay-0.1s.png");
        rainybara.scale(100, 100);
        setImage(rainybara);
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
}
