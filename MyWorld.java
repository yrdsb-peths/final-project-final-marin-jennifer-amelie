import greenfoot.*;

public class MyWorld extends World {
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    boolean time = true;
    int start = 0;
    
    public MyWorld() {
        super(680, 515, 1);
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);
        //Log floor = new Log();
        //addObject(floor, 340, 510);
        //Log log = new Log();
        //addObject(log, 0, 0);
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
    }
}
