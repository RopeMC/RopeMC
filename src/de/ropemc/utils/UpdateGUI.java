package de.ropemc.utils;

import javax.swing.*;
import java.awt.*;

public class UpdateGUI {
    public static JFrame frame;

    public static void createGUI() {
        UpdateGUI here = new UpdateGUI();
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
        here.centerFrame();
        frame.setVisible(true);
    }
    private void centerFrame() {
        Dimension windowSize = frame.getSize();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        int dx = centerPoint.x - windowSize.width / 2;
        int dy = centerPoint.y - windowSize.height / 2;
        frame.setLocation(dx, dy);
    }
}
