package org.example;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame {
    private Shapes shapes;
    private StyleShapes styleShapes;
    public TitlesFrame(Shapes shapes, StyleShapes styleShapes) {
        this.shapes = shapes;
        this.styleShapes = styleShapes;
        this.initUI();
    }

    private void initUI() {
        this.setTitle("Криві фігури");
        this.setDefaultCloseOperation(3);
        this.add(new TitlesPanel(this.shapes, this.styleShapes));
        this.setSize(350, 350);
        this.setLocationRelativeTo((Component)null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Shapes shapes = Shapes.Star;
                StyleShapes styleShapes = StyleShapes.White_grey_gradient;
                TitlesFrame ps = new TitlesFrame(shapes, styleShapes);
                ps.setVisible(true);
            }
        });
    }
}