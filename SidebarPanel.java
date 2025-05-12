import javax.swing.*;
import java.awt.*;

public class SidebarPanel extends JPanel {
    public SidebarPanel() {
        setLayout(new GridLayout(0, 1, 10, 10));
        setBackground(new Color(40, 40, 40));
        setPreferredSize(new Dimension(150, 0));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        Color buttonColor = new Color(55, 55, 55);
        String[] menuItems = {"Home", "Characters", "Tier List", "Trade", "Battle", "Equipment"};

        for (String item : menuItems) {
            JButton btn = new JButton(item);
            btn.setBackground(buttonColor);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            add(btn);
        }
    }
}
