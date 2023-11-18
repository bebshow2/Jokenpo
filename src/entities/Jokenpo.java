package entities;

import application.Interface;
import javax.swing.JFrame;

public class Jokenpo {
    public static void main(String[] args) {
        Interface inter = new Interface();
        
        inter.setSize(400, 170);
        inter.setVisible(true);
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
