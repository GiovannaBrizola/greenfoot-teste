import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class raposa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lindinha extends Actor
{
    GreenfootSound poder = new GreenfootSound("poder.mp3");
    public int speed = 3;
    private int sTimer = 0;
    /**
     * Act - do whatever the raposa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento() {
    if(Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        else if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        else if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() +speed, this.getY());
        }
        else if(Greenfoot.isKeyDown("p") && (sTimer == 0)){
            getWorld().addObject(new poder(), getX() + 100, getY() +30);
            sTimer ++;
            poder.play();           
        }
        else{
            if (!Greenfoot.isKeyDown("l")) {
            sTimer = 0;
            }
        }
    }
    }