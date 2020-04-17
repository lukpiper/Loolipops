/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Draws little pictures on the graphics pane
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lollipops{

    /**
     * Constructor for objects of class Lollipops 
     */
    public Lollipops(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /** Draw a red lollipop on a stick */
    private void drawLollipop() {
        UI.setLineWidth(10);                //set a line width to 10
        UI.drawLine(300, 200, 300, 400);    //draw line (300, 200) to (300, 400)
        UI.setLineWidth(1);                 //set line width to 1
        UI.setColor(Color.red);             //set colour t red
        UI.fillOval(260, 160, 80, 80);      //fill oval     (260, 160), 80x80
    }
    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Lollipops obj = new Lollipops();
        obj.drawLollipop();
    }

}

