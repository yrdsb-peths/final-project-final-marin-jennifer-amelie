import greenfoot.*;

public class MyWorld extends World {
    private boolean gameOver = false;
    
    //changable for timer here
    int timer = 3050;
    public MyWorld() {
        super(680, 520, 1);
        setBackground("images/gameBG.png");
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 475);

        Toxin toxin = new Toxin(60, 15);
        addObject(toxin, 495, 510);
        
        Toxin toxin2 = new Toxin(90, 15);
        addObject(toxin2, 330, 510);
        

        //adding platforms
        Log floor1 = new Log("med");
        addObject(floor1, 150, 515);
        Log floor2 = new Log("short");
        addObject(floor2, 420, 515);
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
        addObject(coin, 330, 450);

        Coin coin1 = new Coin();
        addObject(coin1, 500, 450);
        
        Coin coin2 = new Coin();
        addObject(coin2, 410, 230);
        
        Coin coin3 = new Coin();
        addObject(coin3, 30, 75);
        
        Coin coin4 = new Coin();
        addObject(coin4, 200, 50);
        
        Coin coin5 = new Coin();
        addObject(coin5, 50, 300);
        
        //add the bird
        Bird bird = new Bird();
        addObject(bird, 560, 115);
        
        //add the badGuy
        BadGuy b = new BadGuy();
        addObject(b, 600, 240);


    }
    
    public void setGameOver(boolean value) {
        gameOver = value;
    }
    
    public boolean isGameOver() {
        return gameOver;
    }

    public void act(){
        if (gameOver) {
            return;
        }
        
        //add number on timer
        timer--;
        showText(""+timer / 100, 342, 20);

        if (timer <= 0){
            Greenfoot.stop();
        }
        
        //Collecting Coins
        
    }
}
