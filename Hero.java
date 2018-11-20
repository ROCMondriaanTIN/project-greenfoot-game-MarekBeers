
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    
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
        
       
        handleInput();
        
        animationCounter ++;
        
        location();
        
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
        
    public int location()
    {
        int x = getX();
        int y = getY();
        return 0;
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
            setImage("p1inv_walk01.png");
        }
        else if(frame == 2)
        {
            setImage("p1inv_walk02.png");
        }
        else if(frame == 3)
        {
            setImage("p1inv_walk03.png");
        }
        else if(frame == 4)
        {
            setImage("p1inv_walk04.png");
        }
        else if(frame == 5)
        {
            setImage("p1inv_walk05.png");
        }
        else if(frame == 6)
        {
            setImage("p1inv_walk06.png");
        }
        else if(frame == 7)
        {
            setImage("p1inv_walk07.png");
        }
        else if(frame == 8)
        {
            setImage("p1inv_walk08.png");
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
            setImage("p1_walk01.png");
        }
        else if(frame == 2)
        {
            setImage("p1_walk02.png");
        }
        else if(frame == 3)
        {
            setImage("p1_walk03.png");
        }
        else if(frame == 4)
        {
            setImage("p1_walk04.png");
        }
        else if(frame == 5)
        {
            setImage("p1_walk05.png");
        }
        else if(frame == 6)
        {
            setImage("p1_walk06.png");
        }
        else if(frame == 7)
        {
            setImage("p1_walk07.png");
        }
        else if(frame == 8)
        {
            setImage("p1_walk08.png");
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
                setImage ("p1_walk08.png");
            }
            else
            {
                setImage ("p1inv_walk08.png");
            }
        }
        }
        
        }
        
    
    public void handleInput() {
        
        
        if (Greenfoot.isKeyDown("w") && velocityY == 0) {
            velocityY = -14.5;
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
