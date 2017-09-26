package de.ropemc.utils;

import javax.swing.*;

public class UpdateGUI {
    public static JFrame frame;

    public static void createGUI() {
        frame = new JFrame("Updating RopeMC...");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {
            JOptionPane.showMessageDialog(frame, e);
        }
        frame.setSize(300, 75);
        frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        JProgressBar pb = new JProgressBar();
        pb.setIndeterminate(true);
        frame.add(pb);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
