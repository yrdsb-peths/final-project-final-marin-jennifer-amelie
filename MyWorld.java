import greenfoot.*;

public class MyWorld extends World {
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    boolean time = true;
    int start = 0;
    
    public MyWorld() {
        super(680, 515, 1, false);
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);
        //adding platforms
        Log floor1 = new Log("long");
        addObject(floor1, 0, 515);
        Log floor2 = new Log("short");
        addObject(floor2, 430, 515);
        Log floor3 = new Log("short");
        addObject(floor3, 570, 515);
        Log floor4 = new Log("stump");
        addObject(floor4, 640, 500);
        
        Log first = new Log("short");
        addObject(first, 550, 400);
        Log first1 = new Log("short");
        addObject(first1, 375, 400);
        Log first2 = new Log("med");
        addObject(first2, 150, 370);
        
        Log snd = new Log("long");
        addObject(snd, 430, 290);
        
        Log ths = new Log("long");
        addObject(ths, 250, 220);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 175);
        
        Log last = new Log("short");
        addObject(last, 200, 95);
        Log last1 = new Log("long");
        addObject(last1, 600, 130);
        setBackground("images/gameBG.png");
        
        addObject(timeCount, 340, 20);
        timeCount.setValue(90);
    }
    
    public void act(){
        if (start == 1){
            if (tim.millisElapsed() > 1000){
                timeCount.add(-1);
                tim.mark();
            }
        }
        
        if (Greenfoot.isKeyDown("right")){
            start = 1;
            tim.mark();
        }
        setBackground("images/gameBG.png");
    }
}
