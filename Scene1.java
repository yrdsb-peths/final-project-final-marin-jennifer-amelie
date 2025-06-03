import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene1 extends MainWorld
{
    private Kingbara kingbara;
    private Birdie birdie;

    Label label1 = new Label("A long time ago, in Solcieleux, a kingdom", 30);
    Label label2 = new Label("characterized by its striking beauty of the sky", 30);
    Label label3 = new Label("and nature, was ruled by two inseparable friends: ", 30);
    Label label4 = new Label("Capybara and Birdie.", 30);
    Label label5 = new Label("Continue \u2192", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Scene1()
    {
        super(680, 520, 1);
        GreenfootImage kingdomBg = new GreenfootImage("images/kingdom.png");
        kingdomBg.scale(680, 520); 
        getBackground().drawImage(kingdomBg, 0, 0);
        
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
        birdie = new Birdie();
        addObject(birdie, 200, 300);
    }
    
    public void act() {
        kingbara.kingbara();
        birdie.birdie();
        
        if (animationTimer.millisElapsed() > 500) {  // after 2 seconds
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 2000) {  // after 2 seconds
            addObject(label2, 335, 80);
        }
        if (animationTimer.millisElapsed() > 4000) {  
            addObject(label3, 358, 120);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label4, 358, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label5, 550, 500);
        }
    }
}
