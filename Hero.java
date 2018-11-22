
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    
    private int frame = 1;
    private int animationCounter = 0;
    int punten =0;
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
     int pop = 1;
    int poppoe;
    int poppie;
    boolean walking;
    boolean kijkpos;
    boolean lopen;
    int oldY;
    boolean canJump;
    private int coolSpeed;
    public int pause = 5;
    
    public Hero(int level, int pop) {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        this.level = level;
        this.pop = pop;
        
    }

    
    @Override
    public void act() {
        
        onGround();
        
       
        handleInput(pop);
        
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
                int poppetjenr = 1;
                Greenfoot.setWorld(new GameOver(level, pop));
                return;
            }
        }
        
        for (Actor liquidWater : getIntersectingObjects(TileExtended.class)) {
            TileExtended tile = (TileExtended) liquidWater;
            if (tile != null && tile.type == "water") {
                //getWorld().removeObject(this);
                //setLocation(255, 700);
                Greenfoot.setWorld(new GameOver(level, pop));
                break;
            }
        }
    }
     
    
    public int geefPunt(int geld)
    {
        punten = punten + geld;
        return punten;
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
    
    
    
    public void animateLeft(int poppoe)
    {
        walking = true;
        kijkpos = false;
        lopen = true;
        this.poppie = poppoe;
        if(frame == 1)
        {
            setImage("p"+ poppie +"inv_walk01.png");
        }
        else if(frame == 2)
        {
            setImage("p"+ poppie +"inv_walk02.png");
        }
        else if(frame == 3)
        {
            setImage("p"+ poppie +"inv_walk03.png");
        }
        else if(frame == 4)
        {
            setImage("p"+ poppie +"inv_walk04.png");
        }
        else if(frame == 5)
        {
            setImage("p"+ poppie +"inv_walk05.png");
        }
        else if(frame == 6)
        {
            setImage("p"+ poppie +"inv_walk06.png");
        }
        else if(frame == 7)
        {
            setImage("p"+ poppie +"inv_walk07.png");
        }
        else if(frame == 8)
        {
            setImage("p"+ poppie +"inv_walk08.png");
            frame = 1;
            return;
        }
        
        
        frame ++;
    }
    //hello there:]
    public void animateRight(int poppoe)
    {
        walking = true;
        kijkpos = true;
        lopen = true;
        this.poppie = poppoe;
        if(frame == 1)
        {
            setImage("p"+ poppie +"_walk01.png");
        }
        else if(frame == 2)
        {
            setImage("p"+ poppie +"_walk02.png");
        }
        else if(frame == 3)
        {
            setImage("p"+ poppie +"_walk03.png");
        }
        else if(frame == 4)
        {
            setImage("p"+ poppie +"_walk04.png");
        }
        else if(frame == 5)
        {
            setImage("p"+ poppie +"_walk05.png");
        }
        else if(frame == 6)
        {
            setImage("p"+ poppie +"_walk06.png");
        }
        else if(frame == 7)
        {
            setImage("p"+ poppie +"_walk07.png");
        }
        else if(frame == 8)
        {
            setImage("p"+ poppie +"_walk08.png");
            frame = 1;
            return;
        }
       
        
        frame ++;
    }
   
    public void stopWalking(int poppoe)
    {
        
        for(int i = 1; i<=2; i++)
        {
            i++;
            lopen = false;
            if (!lopen){
            if (kijkpos){
                setImage ("p"+ poppoe +"_walk08.png");
            }
            else
            {
                setImage ("p"+ poppoe +"inv_walk08.png");
            }
        }
        }
        
        }
        
    
    public void handleInput(int pop) {
        
        this.poppoe = pop;
        if (Greenfoot.isKeyDown("w") && velocityY == 0) {
            velocityY = -14.5;
        }

        
        if (!Greenfoot.isKeyDown("a")) {
            if(!Greenfoot.isKeyDown("d"))
            stopWalking(poppoe);
        }
        
       
        
        if (Greenfoot.isKeyDown("a")) {
            if(poppoe == 1){
                velocityX = -6;
            }
            else if(poppoe == 2)
            {
                velocityX = -7;
            }
            else if (poppoe == 3)
            {
                velocityX = -8;
            }
            if(animationCounter % 2 == 0)
                animateLeft(poppoe);
            
        } else if (Greenfoot.isKeyDown("d")) {
            
            if(poppoe == 1){
                velocityX = 6;
            }
            else if(poppoe == 2)
            {
                velocityX = 7;
            }
            else if (poppoe == 3)
            {
                velocityX = 8;
            }
            if(animationCounter % 2 == 0)
            animateRight(poppoe);
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
