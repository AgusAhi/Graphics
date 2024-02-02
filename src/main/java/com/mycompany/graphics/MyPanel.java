/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graphics;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author puntual
 */
public class MyPanel extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.blue);
        for (int i = 0; i <= 1000; i++) {
        Dimension size = getSize();
        Insets insets = getInsets();
        int w = size.width - insets.left - insets.right;
        int h = size.height - insets.top - insets.bottom;
        Random r = new Random();
        int x = r.nextInt(w);
        int y = r.nextInt(h);
        g2d.drawLine(x, y, x, y);
        }
    }
}
