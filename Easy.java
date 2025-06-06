import greenfoot.*;

public class Easy extends MainWorld {
    
    //changable for timer here
    int timer = 1000; //3170
    GreenfootSound bg;
    public Easy() {
        super(680, 520, 1);
        setBackground("images/gameBG.png");
        bg = new GreenfootSound("jungle.mp3");
        Capybara capybara = new Capybara();
        addObject(capybara, 60, 480);
        //switches
        Switch one = new Switch();
        addObject(one, 570, 115);
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
        
        Log ths = new Log("short");
        addObject(ths, 200, 220);
        Log ths1 = new Log("stump");
        addObject(ths1, 50, 175);
        
        Log last1 = new Log("med");
        addObject(last1, 375, 120);
        Log last2 = new Log("short");
        addObject(last2, 150, 125);
        
        //portal
        Portal portal = new Portal();
        addObject(portal, 450, 80);
        
        setBackground("images/gameBG.png");
        
        //toxin
        Toxin to = new Toxin(90, 15);
        addObject(to, 330, 510);
        Toxin to1 = new Toxin(60, 15);
        addObject(to1, 495, 510);
        //add timer 
        Timer t = new Timer();
        addObject(t, 342, 20);

        //add coins
        Coin coin = new Coin();
        addObject(coin, 330, 440);

        Coin coin1 = new Coin();
        addObject(coin1, 490, 440);
        
        Coin coin2 = new Coin();
        addObject(coin2, 410, 220);
        
        Coin coin3 = new Coin();
        addObject(coin3, 50, 60);
        
        Coin coin4 = new Coin();
        addObject(coin4, 300, 60);
        
        Coin coin5 = new Coin();
        addObject(coin5, 50, 300);
        
        //add the bird
        Bird bird = new Bird();
        addObject(bird, 585, 130);
        
    }

    public void act(){
        bg.setVolume(40);
        bg.play();
        
        //add number on timer
        if(timer / 105 > 0){
            if(gameOver) {
                return;
            }
            timer --;
        }
        showText(""+timer / 105, 342, 20);

        if (timer / 105 <= 0.99){
            setGameOver(true);
            gameOver = true;
            bg.stop();
            GreenfootImage gameOverImage = new GreenfootImage("Game Over", 60, Color.RED, Color.BLACK);
            addObject(new GameOverLabel(gameOverImage), getWidth() / 2, getHeight() / 2);
            
            addObject(new RestartButton(), getWidth() / 2 - 100, getHeight() / 2 + 80);
            addObject(new MenuButton(), getWidth() / 2 + 100, getHeight() / 2 + 80);
        }
        
    }
}
