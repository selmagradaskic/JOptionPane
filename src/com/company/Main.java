package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        ImageIcon icon = new ImageIcon("Car.jpg");


        String[] cars = {"BMW", "Audi", "Porshe"};
        String favCar = (String) JOptionPane.showInputDialog(
                frame,
                "Pick your car to race with: ",
                "*VROOM VROOM* racing game",
                JOptionPane.QUESTION_MESSAGE,
                icon,
                cars,
                cars[0]
        );



        JOptionPane.showMessageDialog(
                frame,
                "Player1 has selected: \n"+favCar,
                "*VROOM VROOM* racing game",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );



    }
}
