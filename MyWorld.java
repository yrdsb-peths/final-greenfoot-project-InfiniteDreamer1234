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
   
    private int carSpawnDelay = 1000; // Adjust the delay value as needed
    private int carSpawnCounter = 0;
    boolean spawnedCar1 = false;
boolean spawnedCar2 = false;
boolean spawnedCar3 = false;
boolean spawnedCar4 = false;
    
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
        
        if (timer.millisElapsed() > 2700 )
        {
            Label goLabel = new Label("G0!" , 35);
            addObject(goLabel, 300, 250);
        }
        
        if (timer.millisElapsed() > 3600 )
        {
        removeObjects(getObjects(Label.class));

        if (carSpawnCounter == 0 && !spawnedCar1) {
            Speedy speedy1 = new Speedy();
            int lane1X = Greenfoot.getRandomNumber(150) + 50;
            addObject(speedy1, lane1X, 0);
            spawnedCar1 = true;
            carSpawnCounter++;
        }

        if (carSpawnCounter == 1 && !spawnedCar2) {
            Speedy speedy2 = new Speedy();
            int lane2X = Greenfoot.getRandomNumber(150) + 150;
            addObject(speedy2, lane2X, 0);
            spawnedCar2 = true;
            carSpawnCounter++;
        }

        if (carSpawnCounter == 2 && !spawnedCar3) {
            Speedy speedy3 = new Speedy();
            int lane3X = Greenfoot.getRandomNumber(150) + 300;
            addObject(speedy3, lane3X, 0);
            spawnedCar3 = true;
            carSpawnCounter++;
        }

        if (carSpawnCounter == 3 && !spawnedCar4) {
            Speedy speedy4 = new Speedy();
            int lane4X = Greenfoot.getRandomNumber(150) + 450;
            addObject(speedy4, lane4X, 0);
            spawnedCar4 = true;
            carSpawnCounter++;
        }

        scorelabel = new Label(0, 80);
        addObject(scorelabel, 50, 50);

        // Reset carSpawnCounter after all cars have been spawned
        if (carSpawnCounter > 3) {
            carSpawnCounter = 0;
        }
        
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
