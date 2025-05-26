import greenfoot.*;

public class MyWorld extends World {
    int number = 30;
    int start = 0;
    public MyWorld() {
        super(680, 520, 1);
        setBackground("images/gameBG.png");
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);

        Water waves = new Water();
        addObject(waves, 500, 490);

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
        addObject(snd, 440, 280);

        Log ths = new Log("long");
        addObject(ths, 250, 190);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 150);

        Log last = new Log("short");
        addObject(last, 200, 65);
        Log last1 = new Log("long");
        addObject(last1, 600, 100);
        setBackground("images/gameBG.png");

        //add timer
        Timer t = new Timer();
        addObject(t, 342, 20);
        
        //number of the timer
        Label n = new Label(number, 30);
        addObject(n, 342, 20);

        //add coins
        Coin coin = new Coin();
        addObject(coin, 358, 470);

        Coin coin1 = new Coin();
        addObject(coin1, 500, 470);
    }

    public void act(){
        if (Greenfoot.isKeyDown("up")){
            start = 1; 
        }
        
        if (start == 1){
                number--;
            }
        }
}
