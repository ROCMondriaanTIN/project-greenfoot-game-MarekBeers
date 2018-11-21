import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorldVraag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorldVraag extends World
{

    int pop;
    int level;
    /**
     * Constructor for objects of class MyWorldVraag.
     * 
     */
    public MyWorldVraag(int pop, int level)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.pop = pop;
        this.level = level;

        prepare(pop, level);
    }

    public void act()
    {
        //Continue con = new Continue(pop, level);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare(int pop, int level)
    {

        Cont cont = new Cont(pop, level);
        addObject(cont,484,699);
    }
}
