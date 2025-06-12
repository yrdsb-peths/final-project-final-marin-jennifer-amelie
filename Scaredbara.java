import greenfoot.*;
/**
 * Image Scaredbara, Capybara got scared!
 * Being used in Scene 4.
 * Here is the animation for Scaredbara.
 */
public class Scaredbara extends Actor
{
    GreenfootImage[] scaredbara = new GreenfootImage[8];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scaredbara() {
        //for(int i = 0; i<scaredbara.length; i++){
          //  scaredbara[i] = new GreenfootImage("images/scaredbara/frame_"+i+"_delay-0.1s.gif");
            //scaredbara[i].scale(150, 150);
        //}
        GreenfootImage scaredbara = new GreenfootImage("images/scaredbara/frame_0_delay-0.1s.gif");
        scaredbara.scale(100, 100);
        setImage(scaredbara);
    }
    
    int scaredbaraIndex = 0;
    // narration
    //public void scaredbara () {
      //  if(animationTimer.millisElapsed() < 100){
        //    return;
        //}
        //animationTimer.mark();
        //setImage(scaredbara[scaredbaraIndex]);
        //scaredbaraIndex = (scaredbaraIndex + 1) % scaredbara.length;
    //}
}
