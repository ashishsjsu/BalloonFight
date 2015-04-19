/**
 * Write a description of class CharacterCreator here.
 * 
 * @author Jue Chemparathy 
 * @version 1.0
 */
public abstract class CharacterCreator  
{
    
        public enum CharacterType {
        HeroLevel1,
        HeroLevel2,
        Monster1,
        Monster2,
        Monster3
    }

    public abstract Character getCharacter(CharacterType characterType);
    
}
