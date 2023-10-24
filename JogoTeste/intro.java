import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
private int atraso = 0;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
      prepare();
    }

    public void act(){
      //dialogo
    if (Greenfoot.isKeyDown("enter") && (atraso ==0)){
setBackground(new GreenfootImage("2.png"));
atraso++;
}

else{
if(Greenfoot.isKeyDown("enter")){
atraso = 0;
}
}

//iniciar o jogo
 if (Greenfoot.isKeyDown("space")){
Mundo world = new Mundo();
setBackground(new GreenfootImage("3.png"));
}
 if ((Greenfoot.isKeyDown("space"))){
Mundo world = new Mundo();
Greenfoot.setWorld(world);
  }
}
    private void prepare()
    {
    }
}

