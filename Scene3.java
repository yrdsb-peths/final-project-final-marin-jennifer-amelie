import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays the scene 3 of the story.
 */

public class Scene3 extends MainWorld
{
    private Rainybara rainybara;
    private Birdie birdie;
    
    private Boolean timeYet = false;
    
    Label label1 = new Label("...", 60);
    Label label2 = new Label("Birdie...?", 30);
    Label label3 = new Label("Birdie where did you go...?", 30);
    Label label4 = new Label("Continue \u2192", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootSound th;
    public Scene3()
    {
        super(680, 520, 1);
        GreenfootImage gardenBg = new GreenfootImage("images/garden2.png");
        gardenBg.scale(680, 520); 
        getBackground().drawImage(gardenBg, 0, 0);
        th = new GreenfootSound("thunder.mp3");
        rainybara = new Rainybara();
        addObject(rainybara, 400, 250);
        th.play();
    }
    
    public void act() {
        rainybara.rainybara();
        if (animationTimer.millisElapsed() > 500) {  // after 2 seconds
            addObject(label1, 330, 40);
        }
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 330, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 330, 120);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 550, 500);
            timeYet = true;
        }
        
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene4 world = new Scene4();
            Greenfoot.setWorld(world);
            }
        }
    }
}
