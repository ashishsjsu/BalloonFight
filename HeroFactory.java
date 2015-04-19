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
            case HeroLevel1:
                image = "bf100R1.png";
                hero = new Hero( null,"Hero1",image);
                break;
            case HeroLevel2:
                image = "bf100R.png";
                hero = new Hero(null,"Hero2",image);
                break;
        }
        return hero;
    }
   
}
