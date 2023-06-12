import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    

    private int targetDistance = 80;
    private boolean moveLeft = false;
    private boolean moveRight = false;
    private int currentX = 0;
    

    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();

    public void act() 
    {

        
        if(Greenfoot.isKeyDown("right"))
        {
            moveRight();
            
        }
        if(Greenfoot.isKeyDown("left"))
        {
            moveLeft();
        }
        if (Greenfoot.isKeyDown("up"))
        {
            moveUp();
        }
        if (Greenfoot.isKeyDown("down"))
        {
            moveDown();
        }
        
        eat();
    }
 
  
    
    
    
   
    
   
    

    public void moveRight()
    {
        
        int currentX = getX(); // Get the current x-coordinate of the object
    int targetX = currentX + 1;
        
        if (targetX <= getWorld().getWidth()) {
        setLocation(550, getY()); // Set the new location
    }

        

      }
 
    public void moveLeft()
    {
  
        int currentX = getX(); // Get the current x-coordinate of the object
    int targetX = currentX - 100;
        
        if (targetX <= getWorld().getWidth()) 
        {
        setLocation(75, getY()); // Set the new location
    }
 
    }
 
    public void moveUp()
    {
        setLocation(getX(), getY()-2);
    }
 
    public void moveDown()
    {
        setLocation(getX(), getY()+2);
    }
    
    public void eat()

    
    {
        MyWorld world = (MyWorld) getWorld();
        if(isTouching(Speedy.class))
        {
            
           world.gameOver();
           Greenfoot.stop();
           world.restartAgain();
           
           
           
        } 
        
        


    } 
    

  
} 

    

