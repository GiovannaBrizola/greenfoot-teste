import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends Actor
{
    GifImage poder2 = new GifImage("poder2.png");
    public int temp=50;
    /**
     * Act - do whatever the poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
        
    }
    public void moveAtaque(){
       
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle)); 
         int y = (int) Math.round(getY() + Math.sin(angle)); 
         
         setLocation(x,y);
    }
    
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(raposa.class); 
         if(b != null){
             Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
             counter.add(1);
                 getWorld().removeObject(b);
                 getWorld().removeObject(this);
                  temp=0;
                 if(temp<1){
                     macacovence world = new macacovence();
                     Greenfoot. setWorld(world);
                    }
    
         }
    }
    
    public void acertarAlvo2(){
        Actor c = getOneIntersectingObject(lindinha.class); 
         if(c != null){
             Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
             counter.add(1);
                 getWorld().removeObject(c);
                 getWorld().removeObject(this);
                if(temp<1){
                     macacovence world = new macacovence();
                     Greenfoot. setWorld(world);
                    }
         }
    }
    
    public void acertarAlvo3(){
        Actor d = getOneIntersectingObject(docinho.class); 
         if(d != null){
             Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
             counter.add(1);
                 getWorld().removeObject(d);
                 getWorld().removeObject(this);
                 if(temp<1){
                     macacovence world = new macacovence();
                     Greenfoot. setWorld(world);
                    }
    
         }
    }
   
}