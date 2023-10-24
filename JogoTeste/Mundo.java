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
        raposa raposa = new raposa();
        addObject(raposa,664,291);
        raposa.setLocation(707,456);
        raposa.setLocation(707,456);
        macaco macaco = new macaco();
        addObject(macaco,301,554);
        macaco.setLocation(311,479);
        raposa.setLocation(516,496);
        macaco.setLocation(290,471);
        gif gif = new gif();
        addObject(gif,614,379);
        gif.setLocation(688,368);
        gif.setLocation(714,394);
        raposa.setLocation(148,468);
        removeObject(macaco);
        removeObject(raposa);

        addObject(raposa,136,225);

        addObject(macaco,488,252);
        macaco.setLocation(594,228);
        macaco.setLocation(500,243);
        gif.setLocation(425,195);
        gif.setLocation(320,165);
        gif.setLocation(150,97);
        gif.setLocation(93,27);
        gif.setLocation(108,35);
        gif.setLocation(116,24);
        removeObject(macaco);
        addObject(macaco,508,273);
        removeObject(macaco);
        addObject(macaco,629,303);
        macaco.setLocation(542,84);
        removeObject(macaco);
        addObject(macaco,489,276);
        macaco.setLocation(489,276);
        macaco.setLocation(425,323);
        macaco.setLocation(1182,265);
        removeObject(macaco);
        addObject(macaco,479,267);
        removeObject(macaco);
        raposa.setLocation(128,196);
        addObject(macaco,128,196);
        raposa.setLocation(144,279);
        raposa.setLocation(85,209);
        raposa.setLocation(336,147);
        macaco.setLocation(36,188);
        macaco.setLocation(116,231);
        raposa.setLocation(544,289);
        removeObject(raposa);
        addObject(raposa,493,280);
        Counter counter = new Counter();
        addObject(counter,356,60);
        poder2 poder2 = new poder2();
        addObject(poder2,411,296);
        poder2.setLocation(473,284);
        removeObject(poder2);
        docinho docinho = new docinho();
        addObject(docinho,313,135);
        docinho.setLocation(313,135);
        lindinha lindinha = new lindinha();
        addObject(lindinha,656,426);
        counter.setLocation(239,40);
        gif.setLocation(92,30);
        removeObject(gif);
        //gif gif = new gif();
        addObject(gif,98,43);
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

