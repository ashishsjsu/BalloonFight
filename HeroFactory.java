/**
 * Write a description of class HeroFactory here.
 * 
 * @author Jue Chemparathy 
 * @version 1.0
 */
public class HeroFactory  extends CharacterCreator
{

        public Character getCharacter( CharacterType heroType ) {
        
        Hero hero = null;
        String image=null;
        switch( heroType ) {
            case Player1:
                image = "bf100R.png";
                hero = new Hero( new Descend(),"Hero1",image);
                break;
            case Player2:
                image = "bf100L.png";
                hero = new Hero(new Descend(),"Hero2",image);
                break;
        }
        return hero;
    }
   
}