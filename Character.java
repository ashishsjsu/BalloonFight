/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Character extends Actor
{
    private String name;
    
    public Character(String name,String image){
        this.name = name;
        super.setImage( image );
    }
    
}
