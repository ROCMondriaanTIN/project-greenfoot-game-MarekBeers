
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {
    
    private int frame = 1;
    private int animationCounter = 0;
    public static int punten =0;
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
        onSnake();
        onSpike();
        handleInput(pop);
        onJump();
        animationCounter ++;
        onWater();
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
                if(level == 1){
                ((MyWorld)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 2)
            {
                ((Testing)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 3)
            {
                ((Level3)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 4)
            {
                ((Level4)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 5)
            {
                ((Level5)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 5)
            {
                ((Level5)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else{}
                Greenfoot.setWorld(new GameOver(level, pop));
               
                return;
            }
        }
        for (Actor enemy : getIntersectingObjects(EnemySnake.class)) {
            if(onSnake()==true)
            {
                EnemySnake snake = (EnemySnake) enemy;
                Greenfoot.playSound("Super Mario Bros- Goomba Stomp Sound.mp3");
                int geld = 25;
                geefPunt(geld);
                getWorld().removeObject(snake);
            }
            else if (enemy != null) {
                //getWorld().removeObject(this);
                //setLocation(255, 700);
                int poppetjenr = 1;
                if(level == 1){
                ((MyWorld)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
                
            }
            else if (level == 2)
            {
                ((Testing)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
                
            }
            else if (level == 3)
            {
                ((Level3)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 4)
            {
                ((Level4)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 5)
            {
                ((Level5)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 6)
            {
                ((Level6)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else{}
                Greenfoot.setWorld(new GameOver(level, pop));
                
                return;
            }
        }
        if(onJump() == true){
                velocityY = -30;
                Greenfoot.playSound("Boing Sound Effect.mp3");
                return;
            }
        
        // for (Actor liquidWater : getIntersectingObjects(TileExtended.class)) {
            // TileExtended tile = (TileExtended) liquidWater;
            // if (tile != null && tile.type == "water") {
                //getWorld().removeObject(this);
                //setLocation(255, 700);
                if(onWater() == true){
                if(level == 1){
                ((MyWorld)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 2)
            {
                ((Testing)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 3)
            {
                ((Level3)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 4)
            {
                ((Level4)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else if (level == 5)
            {
                ((Level5)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }else if (level == 6)
            {
                ((Level6)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
            }
            else{}
                Greenfoot.setWorld(new GameOver(level, pop));
                
                
                
            }
        
        for (Actor coinBronze : getIntersectingObjects(TileExtended.class)) {
            TileExtended tile = (TileExtended) coinBronze;
            if (tile != null && tile.type == "coin") {
                int geld = 5;
                geefPunt(geld);
                Greenfoot.playSound("Super Mario Bros.-Coin Sound Effect.mp3");
                getWorld().removeObject(tile);
            }
        }
        if (onSpike() == true) {
                ((Level6)getWorld()).stopped();
                Greenfoot.playSound("Roblox Death Sound Effect.mp3");
                Greenfoot.setWorld(new GameOver(level, pop));
            }
        
        
    }
    public String geefl(String l)
    {
        if(level == 5)
        {
            getWorld().showText(l, 20, 20);
        }
        
        return l;
    }
    public String geeft(String t)
    {
        if(level == 5)
        {
            getWorld().showText(t, 50, 20);
        }
        
        return t;
    }
    public String geeft2(String t2)
    {
        if(level == 5)
        {
            getWorld().showText(t2, 65, 20);
        }
        
        return t2;
    }
    public String geefu(String u)
    {
        if(level == 4)
        {
            getWorld().showText(u, 50, 20);
        }
        
        return u;
    }
    public String geefd(String d)
    {
        if(level == 4)
        {
            getWorld().showText(d, 20, 20);
        }
        if(level == 6)
        {
            getWorld().showText(d, 20, 20);
        }
        return d;
    }
    public String geefe2(String e2)
    {
        if(level == 3)
        {
            getWorld().showText(e2, 65, 20);
        }
        if(level == 5)
        {
            getWorld().showText(e2, 80, 20);
        }
        return e2;
    }
    public String geefn(String n)
    {
        if(level == 3)
        {
            getWorld().showText(n, 80, 20);
        }
        if(level == 3)
        {
            getWorld().showText(n, 80, 20);
        }
        if(level == 6)
        {
            getWorld().showText(n, 65, 20);
        }
        return n;
    }
    public String geefa(String a)
    {
        if(level == 1)
        {
            getWorld().showText(a, 20, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(a, 50, 20);
        }
        return a;
    }
    public String geefr(String r)
    {
        if(level == 3)
        {
            getWorld().showText(r, 20, 20);
        }
        if(level == 4)
        {
            getWorld().showText(r, 65, 20);
        }
        if(level == 5)
        {
            getWorld().showText(r, 95, 20);
        }
        if(level == 6)
        {
            getWorld().showText(r, 35, 20);
        }
        return r;
    }
    public String geefg(String g)
    {
        if(level == 3)
        {
            getWorld().showText(g,50, 20);
        }
        
        return g;
    }
    public String geefa2(String a2)
    {
        if(level == 1)
        {
            getWorld().showText(a2, 20, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(a2, 35, 20);
        }
        return a2;
    }
    public String geefs(String s)
    {
        if(level == 1)
        {
            getWorld().showText(s, 20, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(s, 65, 20);
        }
        return s;
    }
    public String geefK(String k)
    {
        if(level == 1)
        {
            getWorld().showText(k, 20, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(k, 20, 20);
        }
        return k;
    }
    public String geefe(String e)
    {
        if(level == 1)
        {
            getWorld().showText(e, 50, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(e, 200, 20);
        }
        else if(level == 3)
        {
            getWorld().showText(e, 35, 20);
        }
        else if(level == 4)
        {
            getWorld().showText(e, 35, 20);
        }
        else if(level == 5)
        {
            getWorld().showText(e, 35, 20);
        }
        else if(level == 6)
        {
            getWorld().showText(e, 80, 20);
        }
        return e;
    }
    public String geefo(String o)
    {
        if(level == 1)
        {
            getWorld().showText(o, 35, 20);
        }
        else if(level == 2)
        {
            getWorld().showText(o, 200, 20);
        }
        else if(level == 6)
        {
            getWorld().showText(o, 50, 20);
        }
        return o;
    }
    public int geefPunt(int geld)
    {
        punten = punten + geld;
        getWorld().showText("Punten: " + punten, 500, 20);
        
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
        /*Actor under = getOneObjectAtOffset(0, getHeight()/2, Tile.class);
        Tile tile = (Tile) under;
        return tile != null && tile.isSolid == true;*/
        Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, Tile.class);
        Actor underCenter = getOneObjectAtOffset(0, getImage().getHeight() / 2, Tile.class);
        Tile tile1 = (Tile) underLeft;
        Tile tile2 = (Tile) underRight;
        Tile tile3 = (Tile) underCenter;

        //return (underCenter != null || underLeft != null || underRight != null) && tile1.isSolid == true;
        return (tile1 != null && tile1.isSolid) || (tile2 != null && tile2.isSolid) || (tile3 != null && tile3.isSolid);
        //return tile1 != null && tile1.isSolid == true;
        
    }
    public boolean onSnake()
    {
        Actor underCenter = getOneObjectAtOffset(0, getImage().getHeight() / 2, EnemySnake.class);
        Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, EnemySnake.class);
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, EnemySnake.class);
        EnemySnake snake = (EnemySnake) underCenter;
        EnemySnake snake2 = (EnemySnake) underLeft;
        EnemySnake snake3 = (EnemySnake) underRight;

        
        return (snake != null) || (snake2 != null) || (snake3 != null);
        
        
    }
    public boolean onJump()
    {
        Actor underCenter = getOneObjectAtOffset(0, getImage().getHeight() / 2, EnemyJump.class);
        Actor underLeft = getOneObjectAtOffset(-getImage().getWidth() / 2, getImage().getHeight() / 2, EnemyJump.class);
        Actor underRight = getOneObjectAtOffset(getImage().getWidth() / 2, getImage().getHeight() / 2, EnemyJump.class);
        EnemyJump jump = (EnemyJump) underCenter;
        EnemyJump jump2 = (EnemyJump) underLeft;
        EnemyJump jump3 = (EnemyJump) underRight;

        
        return (jump != null) || (jump2 != null) || (jump3 != null);
        
        
    }
    public boolean onSpike()
    {
        
        Actor underCenter = getOneObjectAtOffset(0, getImage().getHeight() / 2, TileExtended.class);
        
        TileExtended Spiked = (TileExtended) underCenter;
        
        return (Spiked != null && Spiked.type == "spike");
        
    
    }
    public boolean onWater()
    {
        
        Actor underCenter = getOneObjectAtOffset(0, getImage().getHeight() / 2, TileExtended.class);
        
        TileExtended Water = (TileExtended) underCenter;
        
        return (Water != null && Water.type == "water");
        
    
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
        if (Greenfoot.isKeyDown("w") && /*velocityY == 0*/ onGround() == true) {
            
            if(poppoe == 1){
                velocityY = -17;
            }
            else if(poppoe == 2)
            {
                velocityY = -19;
            }
            else if (poppoe == 3)
            {
                velocityY = -16;
            }
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
                velocityX = -6.5;
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
                velocityX = 6.5;
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
