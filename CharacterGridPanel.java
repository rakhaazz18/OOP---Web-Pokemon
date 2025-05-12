import java.awt.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class CharacterGridPanel extends JPanel {
    public CharacterGridPanel() {
        setLayout(new GridLayout(0, 4, 10, 10));
        setBackground(Color.WHITE);

        List<String> characters = Arrays.asList("Pikachu", "Charmander", "Bulbasaur", "Mew", "Squirtle", "Chikorita", "Cyndaquil", "Totodile", "Lugia", "HoOh", "Giratina", "Xerneas", "Yveltal", "Litten");

        for (String name : characters) {
            JPanel card = new JPanel(new BorderLayout());
            card.setBackground(Color.WHITE);
            card.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));

            ImageIcon icon = new ImageIcon(name + ".png");
            Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            JLabel picLabel = new JLabel(new ImageIcon(img));
            picLabel.setHorizontalAlignment(JLabel.CENTER);

            JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 14));

            card.add(picLabel, BorderLayout.CENTER);
            card.add(nameLabel, BorderLayout.SOUTH);

            add(card);
        }
    }
}
