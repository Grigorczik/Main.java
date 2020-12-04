package com.MyCalk;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Work extends JFrame {
    JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, O1, O2, O3, O4, E1, C1;
    static JTextField t1;
    static int i;
    static String a, numS = "0";
    static double num, numB, numF;
    static boolean plus, minus, dev, mult;

    eHandler handler = new eHandler();

    public Work(String s) {
        super(s);
        setLayout(null);
        Font font = new Font("Serif", Font.PLAIN, 45);
        n1 = new JButton("1");
        n1.setBounds(0, 180, 100, 60);
        n1.setFont(font);
        add(n1);
        n2 = new JButton("2");
        n2.setBounds(100, 180, 100, 60);
        n2.setFont(font);
        add(n2);
        n3 = new JButton("3");
        n3.setBounds(200, 180, 100, 60);
        n3.setFont(font);
        add(n3);
        O1 = new JButton("-");
        O1.setBounds(300, 180, 100, 60);
        O1.setFont(font);
        add(O1);
        n4 = new JButton("4");
        n4.setBounds(0, 120, 100, 60);
        n4.setFont(font);
        add(n4);
        n5 = new JButton("5");
        n5.setBounds(100, 120, 100, 60);
        n5.setFont(font);
        add(n5);
        n6 = new JButton("6");
        n6.setBounds(200, 120, 100, 60);
        n6.setFont(font);
        add(n6);
        O2 = new JButton("+");
        O2.setBounds(300, 120, 100, 60);
        O2.setFont(font);
        add(O2);
        n7 = new JButton("7");
        n7.setBounds(0, 60, 100, 60);
        n7.setFont(font);
        add(n7);
        n8 = new JButton("8");
        n8.setBounds(100, 60, 100, 60);
        n8.setFont(font);
        add(n8);
        n9 = new JButton("9");
        n9.setBounds(200, 60, 100, 60);
        n9.setFont(font);
        add(n9);
        C1 = new JButton("С");
        C1.setBounds(300, 60, 100, 60);
        C1.setFont(font);
        add(C1);
        O3 = new JButton("*");
        O3.setBounds(0, 240, 100, 60);
        O3.setFont(font);
        add(O3);
        n0 = new JButton("0");
        n0.setBounds(100, 240, 100, 60);
        n0.setFont(font);
        add(n0);
        O4 = new JButton("/");
        O4.setBounds(200, 240, 100, 60);
        O4.setFont(font);
        add(O4);
        E1 = new JButton("=");
        E1.setBounds(300, 240, 100, 60);
        E1.setFont(font);
        add(E1);
        t1 = new JTextField();
        t1.setBounds(0, 0, 400, 60);
        t1.setFont(new Font("Serif", Font.PLAIN, 45));
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setEditable(false);
        add(t1);
        n0.addActionListener(handler);
        n1.addActionListener(handler);
        n2.addActionListener(handler);
        n3.addActionListener(handler);
        n4.addActionListener(handler);
        n5.addActionListener(handler);
        n6.addActionListener(handler);
        n7.addActionListener(handler);
        n8.addActionListener(handler);
        n9.addActionListener(handler);
        O1.addActionListener(handler);
        O2.addActionListener(handler);
        O3.addActionListener(handler);
        O4.addActionListener(handler);
        E1.addActionListener(handler);
        C1.addActionListener(handler);

    }

    public class eHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if ((Double.parseDouble(numS)) >= 9999999) {
                t1.setText(null);
                numS = "0";
                numB = 0;
                JOptionPane.showMessageDialog(null, "Максимальная длина числа");
            }
            if (e.getSource() == C1) {
                t1.setText(null);
                numS = "0";
                numB = 0;
            }
            if (e.getSource() == O2) {
                numB = Double.parseDouble(numS);
                numS = "0";
                plus = true;
                minus = false;
                dev = false;
                mult = false;
            }
            if (e.getSource() == O1) {
                numB = Double.parseDouble(numS);
                numS = "0";
                plus = false;
                minus = true;
                dev = false;
                mult = false;
            }
            if (e.getSource() == O3) {
                numB = Double.parseDouble(numS);
                numS = "0";
                plus = false;
                minus = false;
                dev = false;
                mult = true;
            }
            if (e.getSource() == O4) {
                numB = Double.parseDouble(numS);
                numS = "0";
                plus = false;
                minus = false;
                dev = true;
                mult = false;
            }
            if (e.getSource() == n0) {
                numS = Calc.count(numS, 0);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n1) {
                numS = Calc.count(numS, 1);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n2) {
                numS = Calc.count(numS, 2);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n3) {
                numS = Calc.count(numS, 3);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n4) {
                numS = Calc.count(numS, 4);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n5) {
                numS = Calc.count(numS, 5);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n6) {
                numS = Calc.count(numS, 6);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n7) {
                numS = Calc.count(numS, 7);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n8) {
                numS = Calc.count(numS, 8);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if (e.getSource() == n9) {
                numS = Calc.count(numS, 9);
                double numOut = Double.parseDouble(numS);
                if (numOut - (int) numOut != 0) {
                    t1.setText(Double.toString(numOut));
                } else {
                    i = (int) numOut;
                    t1.setText(Integer.toString(i));
                }
            }
            if(e.getSource()==E1){
                num = Double.parseDouble(numS);
                Work.equals(numB, num);
            }

        }
    }
    public static void equals(double x1, double x2){
        if(plus){
            numF = x1 + x2;
            if(numF - (int)numF!=0){
                numF = numF * 10000;
                numF = (int)numF;
                numF = numF/10000;
                a = Double.toString(numF);
                t1.setText(a);
            }else{
                i = (int)numF;
                t1.setText(Integer.toString(i));
            }
            num = 0;
            numB = 0;
            numS = "0";
            plus = false;
        }
        if(minus){
            numF = x1 - x2;
            if(numF - (int)numF!=0){
                numF = numF * 10000;
                numF = (int)numF;
                numF = numF/10000;
                a = Double.toString(numF);
                t1.setText(a);
            }else{
                i = (int)numF;
                t1.setText(Integer.toString(i));
            }
            num = 0;
            numB = 0;
            numS = "0";
            minus = false;
        }
        if(mult){
            numF = x1 * x2;
            if(numF - (int)numF!=0){
                numF = numF * 10000;
                numF = (int)numF;
                numF = numF/10000;
                a = Double.toString(numF);
                t1.setText(a);
            }else{
                i = (int)numF;
                t1.setText(Integer.toString(i));
            }
            num = 0;
            numB = 0;
            numS = "0";
            mult = false;
        }
        if(dev){
            numF = x1 / x2;
            if(numF - (int)numF!=0){
                numF = numF * 10000;
                numF = (int)numF;
                numF = numF/10000;
                a = Double.toString(numF);
                t1.setText(a);
            }else{
                i = (int)numF;
                t1.setText(Integer.toString(i));
            }
            num = 0;
            numB = 0;
            numS = "0";
            dev = false;
        }
    }
}
