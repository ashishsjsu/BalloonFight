import greenfoot.*;

/**
 * Character class for different characters in game
 * 
 * @author Jue Chemparathy, Ashish Narkhede
 * @version 1.0
 */
public class Character extends Actor
{
   private String name;
   FloatBehaviour _floatBehaviour; 
   Descend playerDescend;
   //create reference to states
   TwoBalloonState twoBState;
   OneBalloonState oneBState;
   NoBalloonState noBState;  
   //balloon state reference to store current state
   BalloonState _currState;
   String currFace="right"; 
   
    public Character(String name,String image){
        //playerDescend = new Descend();
        this.name = name;
        super.setImage( image );
        twoBState = new TwoBalloonState(this);
        oneBState = new OneBalloonState(this);
        noBState = new NoBalloonState(this);
        _currState = twoBState;
    }
    
    public void fallDown()
    {   
        setFloatBehaviour(this.playerDescend);
        String[] result = performFloat(this._floatBehaviour);
        setLocation(getX() + Integer.parseInt(result[1]), getY() + Integer.parseInt(result[2]));            
    }
    
   public void setFloatBehaviour(FloatBehaviour _floatBehaviour)
    {
        this._floatBehaviour = _floatBehaviour;
    }
  
    public FloatBehaviour getFloatBehaviour()
    {
        return this._floatBehaviour;
    }
    
    public void fallFree()
    {
        setFloatBehaviour(this.playerDescend);
        this._floatBehaviour.vSpeed = 4;
        String[] result = performFloat(this._floatBehaviour);
        setLocation(getX() + Integer.parseInt(result[1]), getY() + Integer.parseInt(result[2]));
    }
    
   
    //state manipulation
    
    public void setState(BalloonState state)
    {
        this._currState = state;
        if(this._currState.getClass().getName() == "NoBalloonState")
        {
            Greenfoot.playSound("dead2.mp3");
        }
    }
    
    public BalloonState getOneBalloonState()
    {
        return oneBState;
    }
    
        public BalloonState getTwoBalloonState()
    {
        return twoBState;
    }
    
     
    public BalloonState getNoBalloonState()
    {
        return noBState;
    }
   
    
    public String[] performFloat(FloatBehaviour _floatBehaviour)
    {
         return _floatBehaviour.floatwithBalloon();
    }
        
    public void invokeBehaviour(String[] behav)
    {
        setLocation(getX() + Integer.parseInt(behav[1]), getY() + Integer.parseInt(behav[2]));
    }
    
    /** HELPER Functions */
      public boolean belowStage()
    {
        Actor aboveHead =  getOneObjectAtOffset(0, -40, SmallStage.class);        
        if(aboveHead != null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //check if the actor is on the platform 
    public boolean onGround()
    {
       Actor onStage = getOneObjectAtOffset(0, 40, SmallStage.class);
       Actor onBase = getOneObjectAtOffset(0, 40, BaseTerrain.class);
     
       if(onStage != null || onBase != null)
       {
          return true;
       }
       
       return onStage != null;
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
    
    
    public boolean aroundStageEdges()
    {
        Actor aroundEdges =  getOneObjectAtOffset(80, 16, SmallStage.class);      
        Actor aroundEdges1 =  getOneObjectAtOffset(-80, 16, SmallStage.class);
        
        //aroundEdges.getImage().getWidth();
        
        if(aroundEdges != null || aroundEdges1 != null)
        {
            return true;
        }
        return false;
    }
    
}
