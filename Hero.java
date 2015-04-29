import greenfoot.*;

/**
 * This is class for main character in out game
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class Hero extends Character
{
    GreenfootSound sound = new GreenfootSound("Theme_Song.mp3"); 
    
    //String currFace = "right";
   
         public Hero(FloatBehaviour _floatBehaviour,String name, String image)
        {
            super(name, image);
            this.playerDescend = new Descend();
            this._floatBehaviour = _floatBehaviour;
            //initialize character to default state
            _currState = twoBState;
            System.out.println(_currState.getClass().getName());
        }
        
    
    public boolean detectHit()
    {
       Actor enemyObj =  getOneObjectAtOffset(0, -30, Enemy.class);
    
       if(enemyObj != null)
       {
         move(15);
         return true;
       } 
       
       return false;
    }
    
    public void act() 
    {
     
      if(_currState.getClass().getName() != "NoBalloonState")
      {
          checkKeys();
          checkBoundaries();
          
          if(detectHit())
          {
              //pass 1 to burst balloon to indicate hero's balloon state needs to be changed 
              _currState.burstBalloon(1);
              
          }
          
          if(!onGround())
          {
              if(this._floatBehaviour != null)
              {  
                  this._floatBehaviour.resetSpeed();
                  
                  if(!Greenfoot.isKeyDown("up"))
                  {
                      fallDown();
                  }                  
              }
          }
          else
          {
              if(this._currState.getClass().getName() != "NoBalloonState")
              {
                  this._floatBehaviour.vSpeed = 0;
              }
          }
      }        
      else
      {
          this._currState.takeLife();
      }
   }
    
   
    public void checkKeys()
    {   
        
        if(Greenfoot.isKeyDown("left"))
        {
            if(!aroundStageEdges())
            {
                currFace = "left";
                setFloatBehaviour(new FloatLeft());
                _currState.setImage(1);
                //setImage("bf100L.png");
                String[] result = performFloat(this._floatBehaviour);
                invokeBehaviour(result);
            }
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            if(!aroundStageEdges())
            {
                currFace = "right";
                setFloatBehaviour(new FloatRight());
                _currState.setImage(1);
                //setImage("bf100R.png");
                String[] result = performFloat(this._floatBehaviour);
                invokeBehaviour(result);
            }           
        }
        
        if(Greenfoot.isKeyDown("up"))
        {
            if(!belowStage())
            {
                setFloatBehaviour(new Ascend());
                String[] result = performFloat(this._floatBehaviour);
                invokeBehaviour(result);
           }
           else
           {
               fallDown();
           }
        }
        
        
        if(Greenfoot.isKeyDown("down"))
        {
            if(!belowStage())
            {
                setFloatBehaviour(new Descend());
                this._floatBehaviour.vSpeed = 2;
                String[] result = performFloat(this._floatBehaviour);
                invokeBehaviour(result);
           }
           else
           {
               fallDown();
           }
        }
        
        if(Greenfoot.isKeyDown("p"))
        {
           if(sound.isPlaying())
           {
               sound.stop();
           }
           else
           {
               sound.play();
           }
        }
    }//checkKeys
    
        
}