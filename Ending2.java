import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending2 extends MainWorld
{
    private Kingbara kingbara;

    Label label1 = new Label("Birdie", 30);
    Label label2 = new Label("Where are you?", 30);
    Label label3 = new Label("Birdie!! ", 30);
    Label label4 = new Label("Birdie...", 30);
    Label label5 = new Label("The end", 30);
    
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Ending2()
    {
        super(680, 520, 1);
        GreenfootImage mist = new GreenfootImage("images/mist.jpg");
        mist.scale(680, 520); 
        getBackground().drawImage(mist, 0, 0);
        
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
    }
    
    public void act() {
        kingbara.kingbara();
        
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
