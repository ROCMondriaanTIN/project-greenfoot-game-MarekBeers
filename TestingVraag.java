import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TestingVraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestingVraag extends World
{

    int pop;
    int level;
    /**
     * Constructor for objects of class TestingVraag.
     * 
     */
    public TestingVraag(int pop, int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        prepare(pop);
        this.pop = pop;
        this.level = level;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int pop)
    {
        KoeMelken koeMelken = new KoeMelken();
        addObject(koeMelken,510,450);
        Cont cont = new Cont(pop, 2);
        addObject(cont,500,700);
        Cross cross = new Cross(pop, 99);
        addObject(cross,970,32);
    }
}
