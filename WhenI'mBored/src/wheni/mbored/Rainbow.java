package wheni.mbored;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plati_000
 */
public class Rainbow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot lightning = new Robot (kw, 1, 0, Direction.EAST);
        
        while ( true ){
            lightning.setColor(Color.ORANGE);
            lightning.move();
            lightning.setColor(Color.YELLOW);
            lightning.turnLeft();
            lightning.setColor(Color.GREEN);
            lightning.move();
            lightning.setColor(Color.CYAN);
            lightning.turnLeft();
            lightning.setColor(Color.BLUE);
            lightning.move();
            lightning.setColor(Color.MAGENTA);
            lightning.turnLeft();
            lightning.setColor(Color.PINK);
            lightning.move();
            lightning.setColor(Color.RED);
            lightning.turnLeft();
        }
        }
    }
    

