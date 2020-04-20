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
    public static final double X = 300.0;      //horizontal center of lollipop
    public static final double Y = 180.0;      //vertical center of lollipop
    public static final double SIZE = 80.0;    //diameter of lollipop
    public static final double STICK = 200.0;   //length of lollipop stick
    /**
     * Constructor for objects of class Lollipops 
     */
    public Lollipops(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }

    /** Draw a red lollipop on a stick */
    private void drawLollipop() {
        double left = X-SIZE/2.0;           //left of lollipop
        double top = Y-SIZE/2.0;            //top of lollipop
        double bottom = Y+STICK;            //bottom of stick
        
        UI.setLineWidth(SIZE/8.0);          //set a line width to 10
        UI.drawLine(X, Y, X, Y+STICK);      //draw line (300, 200) to (300, 400)
        UI.setLineWidth(1);                 //set line width to 1
        UI.setColor(Color.red);             //set colour t red
        UI.fillOval(X-SIZE/2.0, Y-SIZE/2.0, SIZE, SIZE);      //fill oval     (260, 160), 80x80
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

