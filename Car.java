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
    
 
    private int distance = 100;

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
      int newX = getX() + distance; // Calculate the new x-coordinate
            int y = getY(); // Keep the y-coordinate unchanged

            setLocation(newX, y);
    }
 
    public void moveLeft()
    {
        setLocation(getX()-3, getY());
 
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

    

