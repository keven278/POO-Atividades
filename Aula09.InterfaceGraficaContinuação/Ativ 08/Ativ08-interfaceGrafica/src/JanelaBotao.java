import javax.swing.*;
import java.awt.*;

public class JanelaBotao extends JFrame {
    private JButton botao1;
    public JanelaBotao() {
        botao1 = new JButton("Clique aqui");
        setLayout(new FlowLayout());
        GestorBotoes gestorBotoes = new GestorBotoes();
        botao1.addActionListener(gestorBotoes);
        add(botao1);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}