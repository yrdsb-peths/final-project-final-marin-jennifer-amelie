import greenfoot.*;

public class MyWorld extends World {
    //changable for timer here
    int timer = 3000;
    public MyWorld() {
        super(680, 520, 1);
        setBackground("images/gameBG.png");
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);

        Toxin toxin = new Toxin(30, 30);
        addObject(toxin, 500, 510);
        
        Toxin toxin2 = new Toxin(40, 30);
        addObject(toxin2, 340, 510);
        

        //adding platforms
        Log floor1 = new Log("med");
        addObject(floor1, 150, 515);
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
        
        Log snd = new Log("med");
        addObject(snd, 450, 290);
        
        Log ths = new Log("med");
        addObject(ths, 150, 220);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 175);
        
        Log last = new Log("short");
        addObject(last, 200, 95);
        Log last1 = new Log("long");
        addObject(last1, 600, 130);
        setBackground("images/gameBG.png");

        //add timer 
        Timer t = new Timer();
        addObject(t, 342, 20);

        //add coins
        Coin coin = new Coin();
        addObject(coin, 358, 450);

        Coin coin1 = new Coin();
        addObject(coin1, 500, 450);
    }

    public void act(){
        //add number on timer
        timer--;
        showText(""+timer, 342, 20);
        if (timer <= 0){
            Greenfoot.stop();
        }
    }
}
