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
    /**
     * Act - do whatever the poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        acertarAlvo();
        acertarAlvo2();
        acertarAlvo3();
    }
    public void moveAtaque(){
       
        double angle = Math.toRadians( getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle)); 
         int y = (int) Math.round(getY() + Math.sin(angle)); 
         
         setLocation(x,y);
    }
    
    public void acertarAlvo(){
        Actor a = getOneIntersectingObject(raposa.class); 
         if(a != null){
             Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
             counter.add(1);
                 getWorld().removeObject(a);
                 getWorld().removeObject(this);
    
         }
    }
   public void acertarAlvo2(){
        Actor c = getOneIntersectingObject(docinho.class); 
         if(c != null){
             Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
             counter.add(1);
                 getWorld().removeObject(c);
                 getWorld().removeObject(this);
    
         }
    }
    public void acertarAlvo3(){
        Actor d = getOneIntersectingObject(lindinha.class); 
         if(d != null){
             Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
             counter.add(1);
                 getWorld().removeObject(d);
                 getWorld().removeObject(this);
    
         }
    }
}