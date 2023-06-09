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
    
 
    private int targetDistance = 300;
    private boolean moveLeft = false;
    private boolean moveRight = false;
    private int currentX = 0;

    public void act() 
    {
        
        
       
 
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
        checkKeyPress();
        moveObject();
        eat();
    }

    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("left")) {
            moveLeft = true;
            moveRight = false;
        } else if (Greenfoot.isKeyDown("right")) {
            moveLeft = false;
            moveRight = true;
        }
    }
    
    private void moveObject() {
        if (moveLeft) {
            setLocation(getX() - targetDistance, getY());
            moveLeft = false;
        } else if (moveRight) {
            setLocation(getX() + targetDistance, getY());
            moveRight = false;
        }
    }
    
    public void moveRight()
    {
      
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

    

