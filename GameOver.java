import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    int pop;
    int level;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int lvl, int pop)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        level = lvl;
        prepare(pop);
        this.pop = pop;
    }

    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int pop)
    {
        Restart restart = new Restart(level, pop);
        addObject(restart,500,700);
        Cross cross = new Cross(pop,0);
        addObject(cross,966,32);
    }
}
