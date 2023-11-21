import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Giovanna 
 * @version 0.1 Alpha*/
public class Mundo extends World
{

    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        lindinha lindinha = new lindinha();
        addObject(lindinha,675,431);
        macaco macaco = new macaco();
        addObject(macaco,108,209);
        raposa raposa = new raposa();
        addObject(raposa,322,140);
        docinho docinho = new docinho();
        addObject(docinho,510,296);
        Counter counter = new Counter();
        addObject(counter,668,35);
        Counter2 counter2 = new Counter2();
        addObject(counter2,241,28);
        gif gif = new gif();
        addObject(gif,100,44);
        counter2.setLocation(709,47);
        counter.setLocation(196,34);
        docinho.setLocation(512,261);
        counter2.setLocation(540,32);
        counter2.setLocation(591,48);
        counter.setLocation(228,55);
        counter2.setLocation(616,54);
    }
    private GreenfootSound bgMusic = new GreenfootSound("musicSonic.mp3");
    public void started()
    {
    bgMusic.playLoop();
    }
    
    public void atopped()
    {
    bgMusic.pause();
    }


}

