import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyJump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyJump extends Mover
{
    private int walkRange;
    private int xMin;
    private int xMax;
    private boolean firstAct;
    private int speed;
    public EnemyJump() {
        super();
        setImage("springboardUp.png");
        //getImage().mirrorHorizontally();
        walkRange = 0;
        firstAct = true;
        speed = 0;
    }
    /**
     * Act - do whatever the EnemyJump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        applyVelocity();
        /*
        int x = getX();
        int y = getY();

        if (firstAct) {
            firstAct = false;
            xMin = x - walkRange / 2;
            xMax = x + walkRange / 2;
        }

        velocityX = speed;
        applyVelocity();
        if (getX() >= xMax) {
            speed *= -1;
            x = xMax;
            //getImage().mirrorHorizontally();
        } else if (getX() <= xMin) {
            speed *= -1;
            x = xMin;
            //getImage().mirrorHorizontally();
        }
        */
    }    
}
