package wheni.mbored;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
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
public class CenaTrack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot JohnCena = new Robot (kw, 0, 0, Direction.SOUTH);
        JohnCena.setColor(Color.green);
        JohnCena.setLabel("John Cena");
        // Objective: Retrieve the flag and bring it back to where you started
        
        new Wall (kw, 0, 0, Direction.NORTH);
        new Wall (kw, 0, 0, Direction.EAST);
        new Wall (kw, 0, 0, Direction.WEST);
        new Wall (kw, 1, 0, Direction.WEST);
        new Wall (kw, 2, 0, Direction.WEST);
        new Wall (kw, 3, 0, Direction.WEST);
        new Wall (kw, 1, 0, Direction.EAST);
        new Wall (kw, 2, 0, Direction.EAST);
        new Wall (kw, 3, 0, Direction.SOUTH);
        new Wall (kw, 3, 1, Direction.SOUTH);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.SOUTH);
        new Wall (kw, 3, 5, Direction.SOUTH);
        new Wall (kw, 3, 1, Direction.NORTH);
        new Wall (kw, 3, 2, Direction.NORTH);
        new Wall (kw, 3, 3, Direction.NORTH);
        new Wall (kw, 3, 4, Direction.NORTH);
        new Wall (kw, 3, 5, Direction.EAST);
        new Wall (kw, 2, 5, Direction.WEST);
        new Wall (kw, 2, 5, Direction.NORTH);
        new Wall (kw, 2, 6, Direction.SOUTH);
        new Wall (kw, 2, 6, Direction.EAST);
        new Wall (kw, 1, 6, Direction.EAST);
        new Wall (kw, 0, 6, Direction.EAST);
        new Wall (kw, -1, 6, Direction.EAST);
        new Wall (kw, -2, 6, Direction.EAST);
        new Wall (kw, 1, 6, Direction.WEST);
        new Wall (kw, 0, 6, Direction.WEST);
        new Wall (kw, -1, 6, Direction.WEST);
        new Wall (kw, -2, 6, Direction.NORTH);
        new Wall (kw, -2, 5, Direction.NORTH);
        new Wall (kw, -2, 5, Direction.WEST);
        new Wall (kw, -1, 5, Direction.WEST);
        new Wall (kw, -1, 5, Direction.EAST);
        new Wall (kw, 0, 5, Direction.EAST);
        new Wall (kw, 0, 5, Direction.SOUTH);
        new Wall (kw, 0, 4, Direction.SOUTH);
        new Wall (kw, 0, 3, Direction.SOUTH);
        new Wall (kw, 0, 4, Direction.NORTH);
        new Wall (kw, 0, 3, Direction.WEST);
        new Wall (kw, -1, 3, Direction.WEST);
        new Wall (kw, -2, 3, Direction.WEST);
        new Wall (kw, -3, 3, Direction.WEST);
        new Wall (kw, -4, 3, Direction.WEST);
        new Wall (kw, -1, 3, Direction.EAST);
        new Wall (kw, -2, 3, Direction.EAST);
        new Wall (kw, -3, 3, Direction.EAST);
        new Wall (kw, -4, 3, Direction.EAST);
        new Wall (kw, -5, 3, Direction.EAST);
        new Wall (kw, -5, 3, Direction.NORTH);
        new Wall (kw, -5, 2, Direction.NORTH);
        new Wall (kw, -5, 1, Direction.NORTH);
        new Wall (kw, -5, 0, Direction.NORTH);
        new Wall (kw, -5, 2, Direction.SOUTH);
        new Wall (kw, -5, 1, Direction.SOUTH);
        new Wall (kw, -5, 0, Direction.WEST);
        new Wall (kw, -4, 0, Direction.WEST);
        new Wall (kw, -3, 0, Direction.WEST);
        new Wall (kw, -2, 0, Direction.WEST);
        new Wall (kw, -1, 0, Direction.WEST);
        new Wall (kw, -4, 0, Direction.EAST);
        new Wall (kw, -3, 0, Direction.EAST);
        new Wall (kw, -2, 0, Direction.EAST);
        new Wall (kw, -1, 0, Direction.EAST);
        new Wall (kw, -1, 0, Direction.SOUTH);
        
        new Thing (kw, -1, 0);
        
        while( true ){
            if(JohnCena.canPickThing()){
                JohnCena.pickThing();
                JohnCena.turnLeft();
                JohnCena.turnLeft();}
            
            if (JohnCena.countThingsInBackpack() == 1 && JohnCena.getAvenue() == 0
                    && JohnCena.getStreet() == 0){
                JohnCena.putThing();
                JohnCena.turnLeft();
                JohnCena.turnLeft();
                break;}
            
            else if (JohnCena.frontIsClear()){
                JohnCena.move();}
            
            else if (!JohnCena.frontIsClear()){
                JohnCena.turnLeft();
                if (!JohnCena.frontIsClear()){
                JohnCena.turnLeft();
                JohnCena.turnLeft();}}
            
            }
        }
        
        
    }
    

