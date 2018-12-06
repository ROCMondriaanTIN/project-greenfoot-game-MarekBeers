import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3Vraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3Vraag extends World
{

    
    /**
     * Constructor for objects of class Level3Vraag.
     * 
     */
    public Level3Vraag(int pop)
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
        Cont cont = new Cont(pop, 3);
        addObject(cont,480,702);
    }
}
