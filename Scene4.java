import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene4 extends MainWorld
{
    private Scaredbara scaredbara;
    private Birdie birdie;
    
    private Boolean timeYet = false;
    
    Label label1 = new Label("A mysterious voice echoes in the air:", 30);
    Label label2 = new Label("\"King Capybara...\"", 30);
    Label label3 = new Label("\"Birdie is in my hands. All I demand is...", 30);
    Label label4 = new Label("The ancient royal jewleries in the ancient tree...", 30);
    Label label5 = new Label("If you can hand me all of the gold coins,", 30);
    Label label6 = new Label("I will release Birdie.\"", 30);
    Label label7 = new Label("Continue \u2192", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scene4()
    {
        super(680, 520, 1);
        GreenfootImage gardenBg = new GreenfootImage("images/garden2.png");
        gardenBg.scale(680, 520); 
        getBackground().drawImage(gardenBg, 0, 0);
        
        scaredbara = new Scaredbara();
        addObject(scaredbara, 400, 350); 
        
    }
    
    public void act() {
        scaredbara.scaredbara();
        
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
            addObject(label4, 330, 160);
        }
         if (animationTimer.millisElapsed() > 8000) {  
            addObject(label5, 330, 200);
        }
        if (animationTimer.millisElapsed() > 10000) {  
            addObject(label6, 330, 240);
        }
        if (animationTimer.millisElapsed() > 12000) {  
            addObject(label7, 550, 500);
            timeYet = true;
        }

        
        if (timeYet) {
            if(Greenfoot.isKeyDown("right")){
            Scene5 world = new Scene5();
            Greenfoot.setWorld(world);
            }
        }
    }
}
