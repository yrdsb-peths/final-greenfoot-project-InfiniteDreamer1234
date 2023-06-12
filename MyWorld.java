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
     boolean spawnedCar1 = false;
boolean spawnedCar2 = false;
boolean spawnedCar3 = false;
boolean spawnedCar4 = false;
    private int spawnDelay = 100;  // Time delay between car spawns (in frames)
    private int spawnCounter = 0; 
  public int score = 0;
    Label scorelabel;
    GreenfootImage road = new GreenfootImage("Road.jpg"); 
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Car car = new Car();
        addObject(car,350,350);
        
        scorelabel = new Label(0, 80);
        addObject(scorelabel, 50, 50);
        
        
        
         
        
    }
    
    public void act()
    {
         
        
        if (timer.millisElapsed() > 900 )
        {
            Label readyLabel = new Label("On your mark" , 35);
            addObject(readyLabel, 300, 100);
        }
        
        if (timer.millisElapsed() > 1800 )
        {
            Label readyLabel = new Label("Get set" , 35);
            addObject(readyLabel, 300, 175);
        }
        
         
        
          if (timer.millisElapsed() > 3600) 
          { 
            removeObjects(getObjects(Label.class));
    
    if (!spawnedCar1) {
        Speedy speedy1 = new Speedy();
        int lane1X = Greenfoot.getRandomNumber(150) + 100;
        addObject(speedy1, lane1X, 0);
        spawnedCar1 = true;
    }
    
    if (!spawnedCar2) {
        Speedy speedy2 = new Speedy();
        int lane2X = Greenfoot.getRandomNumber(150) + 250;
        addObject(speedy2, lane2X, 0);
        spawnedCar2 = true;
    }
    
    if (!spawnedCar3) {
        Speedy speedy3 = new Speedy();
        int lane3X = Greenfoot.getRandomNumber(150) + 400;
        addObject(speedy3, lane3X, 0);
        spawnedCar3 = true;
    }
    
    if (!spawnedCar4) {
        Speedy speedy4 = new Speedy();
        int lane4X = Greenfoot.getRandomNumber(150) + 550;
        addObject(speedy4, lane4X, 0);
        spawnedCar4 = true;
    }
    
    scorelabel = new Label(0, 80);
    addObject(scorelabel, 50, 50);

          }
        
        
    }
    
   
    
   
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 35);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void restartAgain()
    {
        Label restartAgainLabel = new Label("Press space to restart", 35);
        addObject(restartAgainLabel, 300, 300);
    }
       
    public void increaseScore()
    {
        score++;
        scorelabel.setValue(score);
    }

     public void mark()
    {
        lastMark = System.currentTimeMillis();
    }  

    
}
