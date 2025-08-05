package br.com.scarlet.ui.custom.frame;

import javax.swing.*;
import java.awt.*;

    public class MainFrame extends JFrame {
        public MainFrame(final Dimension dimension, final JPanel mainPanel) {
            super("Sudoku");
            this.setSize(dimension);
            this.setPreferredSize(dimension);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLocation(null);
            this.add(mainPanel);


        }
    }

