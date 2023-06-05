import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuickIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuickIntro extends World
{
    private Label hiLabel;
    private Label welcomeLabel;
    /**
     * Constructor for objects of class QuickIntro.
     * 
     */
    
    public QuickIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        
        Label welcomeLabel = new Label("Welcome to rush hour!", 40);
        addObject(welcomeLabel, 300, 100);

        Label hiLabel = new Label("You're currently late for work,", 40);
        addObject(hiLabel, 300, 150);
        
        removeObject(hiLabel);
          
    }
   
    public void act()
    {
        
        if(Greenfoot.isKeyDown("Enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }

        if (Greenfoot.isKeyDown("Shift")) 
         {
            delete();
            Label rushLabel = new Label("In order to not annoy your boss,", 40);
            addObject(rushLabel, 300, 200);
        }
    }
    
    public void delete()
    {
        removeObject(hiLabel);
    }
}

