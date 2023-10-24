import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class macaco extends Actor
{
     public int speed = 6;
    private int sTimer = 0;
    /**
     * Act - do whatever the sonic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento() {
    if(Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        else if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        else if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        else if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed, this.getY());
        }
        else if(Greenfoot.isKeyDown("shift")){
            getWorld().addObject(new poder2(),getX() -50, getY() +30);
            
        }
}
}
