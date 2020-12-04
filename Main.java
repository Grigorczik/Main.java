package com.MyCalk;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Work w = new Work("Calk");
        w.setVisible(true);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setResizable(false);
        w.setSize(416, 338);
        w.setLocationRelativeTo(null);

    }
}
