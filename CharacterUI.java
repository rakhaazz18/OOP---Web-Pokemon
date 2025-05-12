import java.awt.*;
import javax.swing.*;

public class CharacterUI extends JFrame {
    public CharacterUI() {
        setTitle("Pokemon");
        setSize(1200, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel-panel modular
        HeaderPanel header = new HeaderPanel();
        SidebarPanel sidebar = new SidebarPanel();
        CharacterGridPanel characterGrid = new CharacterGridPanel();

        add(header, BorderLayout.NORTH);
        add(sidebar, BorderLayout.WEST);
        add(new JScrollPane(characterGrid, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED), BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CharacterUI::new);
    }
}
