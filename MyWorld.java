import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
   public int score = 0;
    Label scorelabel;
    GreenfootImage road = new GreenfootImage("Road.jpg"); 
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Car car = new Car();
        addObject(car,350,350);
        
        scorelabel = new Label(0, 80);
        addObject(scorelabel, 50, 50);
        
        
        
       setUp();
        
    }
  
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 40);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void restartAgain()
    {
        Label restartAgainLabel = new Label("Press space to restart", 40);
        addObject(restartAgainLabel, 300, 300);
    }
       
       
    public void setUp()
    {
        Speedy speedy1 = new Speedy();
        Speedy speedy2 = new Speedy();
        Speedy speedy3 = new Speedy();
        Speedy speedy4 = new Speedy();

        
        

        addObject(speedy1, 100, 0);
        addObject(speedy2, 250, 0);
        addObject(speedy3, 400, 0);
        addObject(speedy4, 550, 0);

    }
    
      public void increaseScore()
    {
        score++;
        scorelabel.setValue(score);
    }

    
    
}
