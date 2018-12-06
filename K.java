import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class K here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class K extends Mover
{
    private int geld = 50;
    int level;
    String k = "K";
    public K(int level)
    {
        this.level = level;
    }
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor hero : getIntersectingObjects(Hero.class))
        {
            if (hero != null)
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefK(k);
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
            }
        }
        
        applyVelocity();
    }
   
}
