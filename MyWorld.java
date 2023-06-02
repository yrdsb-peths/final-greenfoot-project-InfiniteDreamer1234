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
        addObject(car,400,250);
        
        scorelabel = new Label(0, 80);
        addObject(scorelabel, 50, 50);
        
        
        createSpeedy1();
        
    }
    public void increaseScore()
    {
        score++;
        scorelabel.setValue(score);
    }
    
    public void createSpeedy1()
    {
        Speedy speed = new Speedy ();
        int x = Greenfoot.getRandomNumber(100);
        int y = Greenfoot.getRandomNumber(100);
        addObject(speed, x, y);
    }
    
    
}
