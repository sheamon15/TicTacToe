import java.awt.Graphics;
import javax.swing.JApplet;
import java.awt.Font;

/**
 * Author@Shea Salloum
 * Licence: GNU
 * Purpose: Display a tic tac toe applet
 */


public class TicTacToe extends JApplet{
    public void paint (Graphics canvas ){
        canvas.drawLine(200,50,200,500);
        canvas.drawLine(400,50,400,500);
        canvas.drawLine(50,200,600,200);
        canvas.drawLine(50,400,600,400);

        //xs
        Font font = new Font("Blackadder ITC",Font.BOLD,150);
        canvas.setFont(font);
        canvas.drawString("X",225,180);
        canvas.drawString("X",225,360);
        canvas.drawString("X",225,540);


        //Os
        canvas.drawString("O",450,180);
        canvas.drawString("O",60,540);
        canvas.drawString("O",450,360);
    }


}
