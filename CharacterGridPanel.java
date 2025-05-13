import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

public class CharacterGridPanel extends JPanel {
    public CharacterGridPanel() {
        setLayout(new GridLayout(0, 4, 10, 10));
        setBackground(Color.WHITE);

        List<String> characters = Arrays.asList("Pikachu", "Charmander", "Bulbasaur", "Mew", "Squirtle", "Chikorita", "Cyndaquil", "Totodile", "Lugia", "HoOh", "Giratina", "Xerneas", "Yveltal", "Litten","Mudkip");

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

            // Tambahkan MouseListener untuk preview
            card.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    showCharacterPreview(name, icon);
                }
            });

            add(card);
        }
    }

    // Fungsi untuk menampilkan preview karakter
    private void showCharacterPreview(String name, ImageIcon icon) {
        JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), name, true);
        dialog.setLayout(new BorderLayout());
        dialog.setSize(350, 400);
        dialog.setLocationRelativeTo(this);

        JLabel imgLabel = new JLabel();
        imgLabel.setHorizontalAlignment(JLabel.CENTER);
        imgLabel.setIcon(new ImageIcon(icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH)));

        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 22));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        dialog.add(imgLabel, BorderLayout.CENTER);
        dialog.add(nameLabel, BorderLayout.SOUTH);

        dialog.setVisible(true);
    }
}
