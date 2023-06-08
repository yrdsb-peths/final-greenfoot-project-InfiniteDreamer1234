import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */

    Label titleLabel = new Label("Rush Hour", 60);
    GreenfootSound worldSound = new GreenfootSound ("Menu.mp3");
    private long lastMark = System.currentTimeMillis();
    private SimpleTimer timer = new SimpleTimer();
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            QuickIntro gameWorld = new QuickIntro();
            Greenfoot.setWorld(gameWorld);
        }
        
        if(Greenfoot.isKeyDown("space"))
        {
            QuickIntro gameWorld = new QuickIntro();
            Greenfoot.setWorld(gameWorld);
        }
        if (timer.millisElapsed() > 900 )
        {
        
            worldSound.playLoop();
            worldSound.setVolume(55);
            addObject(titleLabel, getWidth()/2, getHeight()/2);
            prepare();
        
            
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label label = new Label("Press space to continue", 40);
        addObject(label,269,300);
        label.setLocation(314,241);
        label.setLocation(239,280);
    }


}
