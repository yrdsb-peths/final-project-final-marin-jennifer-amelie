import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ending2 extends MainWorld
{
    private Kingbara kingbara;

    Label label1 = new Label("Because you didn't collect enough of coins", 30);
    Label label2 = new Label("Birdie disappeared... forever...", 30);
    Label label3 = new Label("Birdie!! ", 30);
    Label label4 = new Label("Birdie...", 30);
    Label label5 = new Label("The end", 30);
    GreenfootSound bg;
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Ending2()
    {
        super(680, 520, 1);
        bg = new GreenfootSound("doom.mp3");
        GreenfootImage mist = new GreenfootImage("images/mist.jpg");
        mist.scale(680, 520); 
        getBackground().drawImage(mist, 0, 0);
        
        kingbara = new Kingbara();
        addObject(kingbara, 400, 550); 
        
    }
    
    public void act() {
        kingbara.kingbara();
        bg.setVolume(50);
        bg.play();
        if (animationTimer.millisElapsed() > 1000) {
            addObject(label1, 300, 40);
        }
        if (animationTimer.millisElapsed() > 4000) {
            addObject(label2, 370, 100);
        }
        if (animationTimer.millisElapsed() > 6000) {  
            addObject(label3, 430, 160);
        }
        if (animationTimer.millisElapsed() > 8000) {  
            addObject(label4, 450, 220);
        }
        if (animationTimer.millisElapsed() > 10000) {  
            addObject(label5, 620, 500);
        }
    }
}
