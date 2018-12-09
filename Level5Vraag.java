import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5Vraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5Vraag extends World
{

    /**
     * Constructor for objects of class Level5Vraag.
     * 
     */
    public Level5Vraag(int pop)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare(pop);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int pop)
    {
        Cross cross = new Cross(pop, 12);
        addObject(cross,970,29);
        Cont cont = new Cont(pop, 5);
        addObject(cont,500,701);
    }
}
