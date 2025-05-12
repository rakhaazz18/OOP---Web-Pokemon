import javax.swing.*;
import java.awt.*;

public class HeaderPanel extends JPanel {
    public HeaderPanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(40, 40, 40));

        JLabel titleLabel = new JLabel("Pokemon:Characters List");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 0));

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setOpaque(false);

        JButton discordBtn = new JButton("Join Discord");
        discordBtn.setBackground(Color.BLUE);
        discordBtn.setForeground(Color.WHITE);
        discordBtn.setFocusPainted(false);

        JButton koFiBtn = new JButton("Buy us a Ko-Fi");
        koFiBtn.setBackground(Color.RED);
        koFiBtn.setForeground(Color.WHITE);
        koFiBtn.setFocusPainted(false);

        buttonPanel.add(discordBtn);
        buttonPanel.add(koFiBtn);

        add(titleLabel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);
    }
}
