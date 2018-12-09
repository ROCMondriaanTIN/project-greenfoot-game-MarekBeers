import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N extends Mover
{
    private int geld = 50;
    
    String N = "N";
    
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for (Actor hero : getObjectsInRange(200, Hero.class))
        {
            if (Greenfoot.mouseClicked(this))
            {
                Hero h = (Hero)hero;
                h.geefPunt(geld);
                h.geefn(N);
                Greenfoot.playSound("Sonic Ring sound Effect in stereo.mp3");
                getWorld().removeObject(this);
            }
        }
        
        applyVelocity();
    }
   
}
