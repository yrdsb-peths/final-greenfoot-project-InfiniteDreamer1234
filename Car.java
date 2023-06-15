import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * Justin Dong 
 * June 2023 
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    GreenfootSound glassSound = new GreenfootSound("Glass.mp3");

    public void act() 
    {

        // How the user car will be moving 
        if(Greenfoot.isKeyDown("1"))
        {
            move1();
            
        }
        if(Greenfoot.isKeyDown("2"))
        {
            move2();
        }
        if (Greenfoot.isKeyDown("3"))
        {
            move3();
        }
        if (Greenfoot.isKeyDown("4"))
        {
            move4();
        }
        
        crash();
        
    }
 
    // Coordinates where the car will move 
    public void move1()
    {
        setLocation(125,350);
    }
 
    public void move2()
    {
        setLocation(250,350); 
    }
 
    public void move3()
    {
        setLocation(375,350);
    }
 
    public void move4()
    {
        setLocation(500,350);
    }
    
    
    
    public void crash()
    {
        // If it crashed into the blue car,
        // the game will be over 
        
        MyWorld world = (MyWorld) getWorld();
        
        if(isTouching(Speedy.class))
        {
            
           world.gameOver();
           Greenfoot.stop();
           world.restartAgain();
           glassSound.play();
           
        } 
    } 
    
   
} 

    

