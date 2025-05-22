import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(680, 515, 1);
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);
        //Log floor = new Log();
        //addObject(floor, 340, 510);
        //Log log = new Log();
        //addObject(log, 0, 0);
        setBackground("images/gameBG.png");
    }
}
