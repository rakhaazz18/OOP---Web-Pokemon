import java.awt.*;
import javax.swing.*;

public class SidebarPanel extends JPanel {
    public SidebarPanel() {
        setLayout(new GridLayout(8, 1, 15, 15)); // 8 baris, jarak antar tombol lebih besar
        setBackground(new Color(40, 40, 40));
        setPreferredSize(new Dimension(240, 0)); // Lebar sidebar diperbesar
        setBorder(BorderFactory.createEmptyBorder(20, 16, 20, 16)); // Padding lebih besar

        Color buttonColor = new Color(55, 55, 55);
        String[] menuItems = {
            "Home", "Characters", "Tier List", "Memory of Chaos",
            "Light Cones", "Relics", "Guides", "Tools"
        };

        for (String item : menuItems) {
            JButton btn = new JButton(item);
            btn.setBackground(buttonColor);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setFont(new Font("Arial", Font.BOLD, 18)); // Ukuran font lebih besar
            btn.setPreferredSize(new Dimension(200, 50)); // Ukuran tombol lebih besar

            add(btn);
        }
    }
}
