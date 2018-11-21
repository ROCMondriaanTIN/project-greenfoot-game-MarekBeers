import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScherm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScherm extends World
{

    
    int pop = 1;
    /**
     * Constructor for objects of class StartScherm.
     * 
     */
    public StartScherm(/*int pop*/)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
        //this.pop = pop;
    }

    
    
    public void act()
    {
        if (Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new LevelSelect(2));
        }
        if (Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("ctrl"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("shift"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("w"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("a"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("s"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        if (Greenfoot.isKeyDown("d"))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }

        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelect(1));
        }
        
        if (Greenfoot.isKeyDown("h"))
        {
            Greenfoot.setWorld(new MyWorld(2));
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StartButtons startButtons = new StartButtons(1);
        addObject(startButtons,492,580);
        LDG lDG = new LDG(1);
        addObject(lDG,500,132);
    }
}
