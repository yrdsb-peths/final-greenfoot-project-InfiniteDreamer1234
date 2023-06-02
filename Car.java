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
 
    }

    public void moveRight()
    {
        setLocation(getX()+3, getY());
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
        if(isTouching(Speedy.class))
        {
            removeTouching(Speedy.class);
           
           
        } 
        
        
     eat();   
    } 
    
    
}
