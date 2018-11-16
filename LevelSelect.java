import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{

    
    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("1"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
        if (Greenfoot.isKeyDown("2"))
        {
            Greenfoot.setWorld(new Testing());
        }
        if (Greenfoot.isKeyDown("3"))
        {
            Greenfoot.setWorld(new StartScherm());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        
        Level1 level1 = new Level1();
        addObject(level1,200,280);
        Level2 level2 = new Level2();
        addObject(level2,500,280);
        Level3 level3 = new Level3();
        addObject(level3,800,280);
        Level_1Pic level_1Pic = new Level_1Pic();
        addObject(level_1Pic,200,380);
    }
}
