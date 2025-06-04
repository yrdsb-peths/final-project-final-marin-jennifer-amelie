import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ending extends MainWorld
{
    private Kingbara kingbara;
    private Birdie birdie;

    Label label1 = new Label("There you are Birdie!", 30);
    Label label2 = new Label("Welcome back!", 30);
    Label label3 = new Label("And this is the story, between", 30);
    Label label4 = new Label("Capybara and Birdie.", 30);
    Label label5 = new Label("The end :)", 30);
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Ending()
    {
        super(680, 520, 1);
        GreenfootImage kingdomBg = new GreenfootImage("images/kingdom.png");
        kingdomBg.scale(680, 520); 
        getBackground().drawImage(kingdomBg, 0, 0);
        
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
        birdie = new Birdie();
        addObject(birdie, 5, 250);
    }
    
    public void act() {
        kingbara.kingbara();
        birdie.birdie();
        
        if (animationTimer.millisElapsed() < 3000) { 
            birdie.move(1);
        }
        
        
        if (animationTimer.millisElapsed() > 500) { 
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 2000) { 
            addObject(label2, 335, 100);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label3, 358, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label4, 358, 220);
        }
        if (animationTimer.millisElapsed() > 11000) {  
            addObject(label5, 600, 500);
        }
    }
}