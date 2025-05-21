import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(680, 520, 1);
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);
        
        setBackground("images/gameBG.png");
    }
}
