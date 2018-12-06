import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    int level;
    int popie;
    int knopppie;
    Restart(int level, int pop)
    {
        this.level = level;
        this.popie = pop;
    }
    
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GrootBlauwHoofdje hdgb = new GrootBlauwHoofdje(level);
        
        resseting(popie);
    
    }
    public void resseting(int popie)
    {
        this.knopppie = popie;
        //System.out.println(this.knopppie);
        if (level == 1){
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MyWorld(knopppie));
        }
    }
    else if (level == 2)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Testing(knopppie));
        }
    }
    else if (level == 3)
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Level3(knopppie));
        }
    }
    }
    
}
