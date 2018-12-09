import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class L here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class L extends Mover
{
    private int geld = 50;
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //for (Actor hero : getIntersectingObjects(Hero.class))
        for (Actor hero : getObjectsInRange(200, Hero.class))
        {
            if (Greenfoot.mouseClicked(this))
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefl("L");
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
            }
            /*if (hero != null)
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefl("L");
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
                
            }*/
        }
        applyVelocity();
    }    
}
