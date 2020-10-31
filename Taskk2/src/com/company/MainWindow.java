package com.company;

import javax.swing.*;

public class MainWindow extends JFrame {
    private DrawPanel panel;

    public MainWindow() {
        this.panel = new DrawPanel();
        this.add(panel);
    }
}
