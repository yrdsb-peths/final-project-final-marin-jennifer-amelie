import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(680, 520, 1, false);
        setBackground("images/gameBG.png");
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
        addObject(floor3, 570, 515);
    }
}
