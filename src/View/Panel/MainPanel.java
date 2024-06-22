package View.Panel;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel {
    private DrawingPanel drawingPanel;

    public MainPanel() {
        setLayout(new BorderLayout());

        JButton circleButton = new JButton("Draw Circle");
        JButton triangleButton = new JButton("Draw Triangle");
        JButton squareButton = new JButton("Draw Square");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(circleButton);
        buttonPanel.add(triangleButton);
        buttonPanel.add(squareButton);

        drawingPanel = new DrawingPanel();

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, buttonPanel, drawingPanel);
        splitPane.setDividerLocation(50);
        splitPane.setEnabled(false);

        add(splitPane, BorderLayout.CENTER);

        circleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.setShape("Circle");
            }
        });

        triangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.setShape("Triangle");
            }
        });

        squareButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.setShape("Square");
            }
        });
    }
}

