import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gif extends Actor
{
    GifImage myGif = new GifImage("trofeu.gif");
    /**
     * Act - do whatever the gif wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       setImage(myGif.getCurrentImage());
       
    }
}
