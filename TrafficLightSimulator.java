// made by JIBIN WILSON S7 CSE
import javax.swing.*;
import java.awt.*;

public class TrafficLightSimulator extends JFrame {
    private enum Light { NONE, RED, YELLOW, GREEN }
    private Light current = Light.NONE;

    public TrafficLightSimulator() {
        super("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        JPanel control = new JPanel();
        ButtonGroup group = new ButtonGroup();
        JRadioButton red = new JRadioButton("Red");
        JRadioButton yellow = new JRadioButton("Yellow");
        JRadioButton green = new JRadioButton("Green");
        group.add(red); group.add(yellow); group.add(green);
        control.add(red); control.add(yellow); control.add(green);

        JPanel lightPanel = new JPanel() {
            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int x = getWidth()/2 - 30;
                int y = 30;
                g.setColor(Color.DARK_GRAY);
                g.fillRect(x - 10, y - 20, 80, 240);
                // Red
                g.setColor(current == Light.RED ? Color.RED : Color.GRAY);
                g.fillOval(x, y, 60, 60);
                // Yellow
                g.setColor(current == Light.YELLOW ? Color.YELLOW : Color.GRAY);
                g.fillOval(x, y + 70, 60, 60);
                // Green
                g.setColor(current == Light.GREEN ? Color.GREEN : Color.GRAY);
                g.fillOval(x, y + 140, 60, 60);
            }
        };
        lightPanel.setPreferredSize(new Dimension(280, 280));

        red.addActionListener(e -> { current = Light.RED; lightPanel.repaint(); });
        yellow.addActionListener(e -> { current = Light.YELLOW; lightPanel.repaint(); });
        green.addActionListener(e -> { current = Light.GREEN; lightPanel.repaint(); });

        setLayout(new BorderLayout());
        add(control, BorderLayout.NORTH);
        add(lightPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrafficLightSimulator().setVisible(true));
    }
}


