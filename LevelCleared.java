import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelCleared here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelCleared extends World
{

    int pop;
    int level = 10;

    
    /**
     * Constructor for objects of class LevelCleared.
     * 
     */
    public LevelCleared(int pop)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        this.pop = pop;
        prepare();
        Greenfoot.playSound("Video Game Level Win _ Clear Sound Effect.mp3");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cont cont = new Cont(pop, 10);
        addObject(cont,485,700);
        showText("punten: "+ Hero.punten, 500, 150);
    }
}
