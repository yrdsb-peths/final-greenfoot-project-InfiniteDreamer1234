import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickIntro here.
 * 
 * Justin Dong 
 * June 2023 
 */
public class QuickIntro extends World
{
    private Label hiLabel;
    private Label welcomeLabel;
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for objects of class QuickIntro.
     * 
     */
    
    public QuickIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        //Spawns the veichle with a set speed 
        Vehicle vehicle = new Vehicle();
        vehicle.speed = 2;
        addObject(vehicle, 300,350);
        //Spawns the animated man  
        Man man = new Man();
        man.speed = 2;
        addObject(man, 50, 345);
        
        Label welcomeLabel = new Label("Welcome to rush hour!", 35);
        addObject(welcomeLabel, 300, 100);
        

        Label hiLabel = new Label("You're currently late for work,", 35);
        addObject(hiLabel, 300, 150);
        
        
          
    }
   
    public void act()
    {
        // Will lead the user to the actual world where the game is played 
        if(Greenfoot.isKeyDown("Enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        
        //Will lead the user to the tutorial 
         if(Greenfoot.isKeyDown("T"))
        {
            QuickTutorial gameWorld = new QuickTutorial();
            Greenfoot.setWorld(gameWorld);
        }
    

        //The text will appear and dissapear after a certain period of time 
         if (timer.millisElapsed() > 900 )
        {
           Label rushLabel = new Label("In order to not get fired", 35);
           addObject(rushLabel, 300, 200);
           Label dashLabel = new Label("You must dodge traffic and rush to work!", 35);
           addObject(dashLabel, 300, 250);
           
        }
        
        if (timer.millisElapsed() > 1500 )
        {
           Label finalLabel = new Label("Good luck!", 35);
           addObject(finalLabel, 300, 300);
           
        }
        
        if (timer.millisElapsed() > 3000 )
        {
           
           removeObjects(getObjects(Label.class));
           Label instructionsLabel = new Label("Press T to go to the instructions page", 35);
           addObject(instructionsLabel, 300, 100);
           Label gameLabel = new Label("Press enter to go play the game! ", 35);
           addObject(gameLabel, 300, 200);
        }
    }
    
     

    
}

