package za.ac.tut.ui;


import java.awt.Color;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author owethu
 */
public class MySecondFrame extends JFrame {

    public MySecondFrame() {
        
        JFrame frame = new JFrame();
        
        frame.setTitle("Number 2");
        frame.setResizable(true);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setForeground(Color.red);
        frame.setVisible(true);
         frame.setSize(760, 200);
    }
    
}
