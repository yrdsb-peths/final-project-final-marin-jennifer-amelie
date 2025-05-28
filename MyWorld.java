import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(680, 515, 1);
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
        addObject(floor4, 640, 500);
        
        Log first = new Log("short");
        addObject(first, 550, 400);
        Log first1 = new Log("short");
        addObject(first1, 375, 400);
        Log first2 = new Log("med");
        addObject(first2, 150, 370);
        
        Log snd = new Log("med");
        addObject(snd, 450, 290);
        
        Log ths = new Log("short");
        addObject(ths, 250, 220);
        Log ths2 = new Log("short");
        addObject(ths2, 150, 220);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 175);
        
        Log last = new Log("short");
        addObject(last, 200, 95);
        Log last1 = new Log("long");

        addObject(last1, 600, 95);

        addObject(last1, 650, 95);
        setBackground("images/gameBG.png");
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 650, 50);
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
        //timer--;
        //showText(""+timer, 342, 20);
        //if (timer <= 0){
          //  Greenfoot.stop();
        }

    }
