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
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
       
       
    public void setUp()
    {
        Speedy speedy1 = new Speedy();
        Speedy speedy2 = new Speedy();
        Speedy speedy3 = new Speedy();
        Speedy speedy4 = new Speedy();

        
        

        addObject(speedy1, 100, 100);
        addObject(speedy2, 200, 200);
        addObject(speedy3, 300, 300);
        addObject(speedy4, 400, 400);

    }
    
      public void increaseScore()
    {
        score++;
        scorelabel.setValue(score);
    }

    
    
}
