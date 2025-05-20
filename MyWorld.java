import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Capybara capybara = new Capybara();
        addObject(capybara, 300, 300);
    }
}
