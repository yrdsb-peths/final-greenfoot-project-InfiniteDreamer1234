import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * Justin Dong 
 * June 2023 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private boolean isCarSpawning = false;
    private int spawningLane = -1; 
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
        addObject(car,375,350);
        
        scorelabel = new Label(0, 80);
        addObject(scorelabel, 50, 50);
    }
    
     public void act()
    {
        
        //Leads the user back to the title screen
        if (Greenfoot.isKeyDown("space")) {
            TitleScreen gameWorld = new TitleScreen();
            Greenfoot.setWorld(gameWorld);
        }
        
        //The text will dissapear and appear based on the time needed 
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
            Label goLabel = new Label("Go!" , 35);
            addObject(goLabel, 300, 250);
        }
        
        if (timer.millisElapsed() > 3600 )
        {
            removeObjects(getObjects(Label.class));
            scorelabel = new Label(0, 80);
            addObject(scorelabel, 50, 50);
        //Spawns a car 
        if (!isCarSpawning) 
         {
            createSpeedy();
        } else {
        if (getObjects(Speedy.class).isEmpty()) 
        {
            spawnCar();
            isCarSpawning = false;
            
        }
        //Created another car when the score is higher than 5 
        if (score >= 5) 
        {
            if (!isCarSpawning) 
            {
                createAdditionalSpeedy();
                spawnCar();
            }
        }
        
        if(score >=100)
        {
          
            
               removeObjects(getObjects(Car.class));
            
                Label congratsLabel = new Label("Congratulations! You made it" , 35);
                addObject(congratsLabel, 300,100);
           
                Label workLabel = new Label("to work! To return to the menu, press space," ,35);
                addObject(workLabel, 300, 175);
            
        }
        
        updateScoreLabel();
    }
        
        }
     
    }    
    public void createSpeedy() 
     {
        //decides which lane the car will spawn in 
         if (!isCarSpawning) {
        int num = Greenfoot.getRandomNumber(4);
        if (num == 1 && spawningLane != 1) {
            spawningLane = 1;
            isCarSpawning = true;
        } else if (num == 2 && spawningLane != 2) {
            spawningLane = 2;
            isCarSpawning = true;
        } else if (num == 3 && spawningLane != 3) {
            spawningLane = 3;
            isCarSpawning = true;
        } else if (num == 4 && spawningLane != 4) {
            spawningLane = 4;
            isCarSpawning = true;
        }
        }
    }
    
    
    private void spawnCar() 
    //Spawns the car according to its assigned lane  
    {
    Speedy speedy = new Speedy(score);
    if (spawningLane == 1) {
        addObject(speedy, 125, 50);
        
    } else if (spawningLane == 2) {
        addObject(speedy, 250, 50);
        
    } else if (spawningLane == 3) {
        addObject(speedy, 375, 50);
        
    } else if (spawningLane == 4) {
        addObject(speedy, 500, 50);
        
    }
    
}   
    private void createAdditionalSpeedy()
    {
    // Will spawn another blue car with each lane randomized 
    if (!isCarSpawning) {
        int num = Greenfoot.getRandomNumber(4) + 1;
        if (num == spawningLane) {
            num = (num % 4) + 1; // 
        }
        spawningLane = num;
        isCarSpawning = true;
        spawnCar();
    }
}

    private void createAdditionalSpeedy1()
    {
    // WIll spawn another blue car with each lane randomized 
    if (!isCarSpawning) {
        int num = Greenfoot.getRandomNumber(4) + 2;
        if (num == spawningLane) {
            num = (num % 4) + 2; // 
        }
        spawningLane = num;
        isCarSpawning = true;
        spawnCar();
    }
}

    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 35);
        addObject(gameOverLabel, 300, 200);
        
    }
    
    public void restartAgain()
    {
        Label restartAgainLabel = new Label("Press space to return to the menu", 35);
        addObject(restartAgainLabel, 300, 300);
    }
       
    public void increaseScore()
    {
        //Increases the score 
        score++;
    }
    
    private void updateScoreLabel() 
    {
        //Updates the total score 
        scorelabel.setValue(score);
    }
    
    
}
