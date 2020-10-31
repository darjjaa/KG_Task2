package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mainWindow.setSize(1300, 700);
        mainWindow.setVisible(true);
    }
}
