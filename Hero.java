import greenfoot.*;

/**
 * This is class for main character in out game
 * 
 * @author Ashish
 * @version 1.0
 */
public class Hero extends Character
{
    FloatBehaviour _floatBehaviour;
    Descend playerDescend;
    String name;
    String image;
    
    public Hero(FloatBehaviour _floatBehaviour,String name,String image)
    {
        super(name,image);
        this._floatBehaviour = _floatBehaviour;
        this.playerDescend = new Descend();
        this.name=name;
        this.image=image;
    }
    
    public void setFloatBehaviour(FloatBehaviour _floatBehaviour)
    {
        this._floatBehaviour = _floatBehaviour;
    }
    
    public void act() 
    {
       checkKeys();
       
      Actor baseTerrain = getOneIntersectingObject(BaseTerrain.class);
      
       if(baseTerrain == null)
       {
           System.out.println(getY() + " " + getWorld().getHeight());
            
            if(!Greenfoot.isKeyDown("up"))
            {
               fallDown();
            }
       }
       else
       {
           
       }
       /*
        if(getY() < 580) 
        {
            System.out.println(getY() + " " + getWorld().getHeight());
            
            if(!Greenfoot.isKeyDown("up"))
            {
               fallDown();
            }
        }*/
       checkBoundaries();
    }
    
    public void checkBoundaries()
    {
       if(getX() <= 15)
       { 
           setLocation(15, getY()); 
       }
       if(getX() >= getWorld().getWidth()-15)
       {
           setLocation(getWorld().getWidth()-15, getY());
       }
       if(getY() <= 15)
       {
           setLocation(getX(), 15);
       }       
       if(getY() >= getWorld().getHeight()-15)
       {
           setLocation(getX(), getWorld().getHeight()-15);
       }       
    }
    
    public void fallDown()
    {    
         setFloatBehaviour(this.playerDescend);
         String[] result = performFloat();
         setLocation(getX() + Integer.parseInt(result[1]), getY() + Integer.parseInt(result[2]));
          
    }
    
    public String[] performFloat()
    {
         return _floatBehaviour.floatwithBalloon();
    }
        
    public void invokeBehaviour(String[] behav)
    {
        setLocation(getX() + Integer.parseInt(behav[1]), getY() + Integer.parseInt(behav[2]));
    }
    
    public void checkKeys()
    {   
        if(Greenfoot.isKeyDown("left"))
        {
            setFloatBehaviour(new FloatLeft());
            setImage("bf100L.png");
            String[] result = performFloat();
            invokeBehaviour(result);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            setFloatBehaviour(new FloatRight());
            setImage("bf100R.png");
            String[] result = performFloat();
            invokeBehaviour(result);
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            setFloatBehaviour(new Ascend());
            String[] result = performFloat();
            invokeBehaviour(result);
        }
        
    }
    
}