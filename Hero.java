
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    private GreenfootImage standing = new GreenfootImage("p1_walk08.png" );
    private GreenfootImage standinginv = new GreenfootImage("p1inv_walk08.png" );
    private GreenfootImage run1 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2 = new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3 = new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4 = new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5 = new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6 = new GreenfootImage("p1_walk06.png");
    private GreenfootImage run7 = new GreenfootImage("p1_walk07.png");
    private GreenfootImage run8 = new GreenfootImage("p1_walk08.png");
    
    private GreenfootImage run10 = new GreenfootImage("p1_walk10.png");
    private GreenfootImage invrun1 = new GreenfootImage("p1inv_walk01.png");
    private GreenfootImage invrun2 = new GreenfootImage("p1inv_walk02.png");
    private GreenfootImage invrun3 = new GreenfootImage("p1inv_walk03.png");
    private GreenfootImage invrun4 = new GreenfootImage("p1inv_walk04.png");
    private GreenfootImage invrun5 = new GreenfootImage("p1inv_walk05.png");
    private GreenfootImage invrun6 = new GreenfootImage("p1inv_walk06.png");
    private GreenfootImage invrun7 = new GreenfootImage("p1inv_walk07.png");
    private GreenfootImage invrun8 = new GreenfootImage("p1inv_walk08.png");
    
    private GreenfootImage invrun10 = new GreenfootImage("p1inv_walk10.png");
    private int frame = 1;
    private int animationCounter = 0;
    
    private final double gravity;
    private final double acc;
    private final double drag;
    private boolean onGround = true;
    private boolean lucht = true;
    
    private int speed = 2; //movement speed  
    private int vSpeed = 0; //vertical speed  
    private int acceleration = 2; //gravity effect while falling  
    private int jumpStrength = -8;
    
    private int level;
    
    boolean walking;
    boolean kijkpos;
    boolean lopen;
    int oldY;
    boolean canJump;
    private int coolSpeed;
    public int pause = 5;
    
    public Hero(int level) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        this.level = level;
        
    }

    
    @Override
    public void act() {
        
        onGround();
        
       /*
        if (oldY < getY() || oldY > getY())
        {
            canJump = false;
            
        }
        else
        {
            canJump = true;
        }
        //if (Greenfoot.isKeyDown("w"))
        //{
            //canJump;
        //}
        
        
        /*
            if(pause>0)
            {    
                pause--;
                if(pause == 0)
                {
                    oldY = getY();
                    pause = 5;
                }
            }
        */
        handleInput();
        
        animationCounter ++;
        
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                //getWorld().removeObject(this);
                //setLocation(255, 700);
                Greenfoot.setWorld(new GameOver(level));
                break;
            }
        }
        
        for (Actor liquidWater : getIntersectingObjects(TileExtended.class)) {
            TileExtended tile = (TileExtended) liquidWater;
            if (tile != null && tile.type == "water") {
                //getWorld().removeObject(this);
                //setLocation(255, 700);
                Greenfoot.setWorld(new GameOver(level));
                break;
            }
        }
    }
        
    
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getHeight()/2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;
        
    }
    
    
    
    public void animateLeft()
    {
        walking = true;
        kijkpos = false;
        lopen = true;
        if(frame == 1)
        {
            setImage(invrun1);
        }
        else if(frame == 2)
        {
            setImage(invrun2);
        }
        else if(frame == 3)
        {
            setImage(invrun3);
        }
        else if(frame == 4)
        {
            setImage(invrun4);
        }
        else if(frame == 5)
        {
            setImage(invrun5);
        }
        else if(frame == 6)
        {
            setImage(invrun6);
        }
        else if(frame == 7)
        {
            setImage(invrun7);
        }
        else if(frame == 8)
        {
            setImage(invrun8);
        }
        else if(frame == 9)
        {
            setImage(invrun10);
            frame = 1;
            return;
        }
        
        
        frame ++;
    }
    
    public void animateRight()
    {
        walking = true;
        kijkpos = true;
        lopen = true;
        if(frame == 1)
        {
            setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run2);
        }
        else if(frame == 3)
        {
            setImage(run3);
        }
        else if(frame == 4)
        {
            setImage(run4);
        }
        else if(frame == 5)
        {
            setImage(run5);
        }
        else if(frame == 6)
        {
            setImage(run6);
        }
        else if(frame == 7)
        {
            setImage(run7);
        }
        else if(frame == 8)
        {
            setImage(run8);
        }
        else if(frame == 9)
        {
            setImage(run10);
            frame = 1;
            return;
        }
       
        
        frame ++;
    }
   
    public void stopWalking()
    {
        for(int i = 1; i<=2; i++)
        {
            i++;
            lopen = false;
            if (!lopen){
            if (kijkpos){
                setImage (standing);
            }
            else
            {
                setImage (standinginv);
            }
        }
        }
        
        }
        
    
    public void handleInput() {
        
        
        if (Greenfoot.isKeyDown("w") && onGround() == true) {
            velocityY = -15;
        }

        
        if (!Greenfoot.isKeyDown("a")) {
            if(!Greenfoot.isKeyDown("d"))
            stopWalking();
        }
        
       
        
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -6;
            
            if(animationCounter % 2 == 0)
            animateLeft();
            
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 6;
            
            if(animationCounter % 2 == 0)
            animateRight();
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
