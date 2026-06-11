import javax.swing.*;
import java.awt.*;

public class ExemploSpringLayout extends JFrame {
    public ExemploSpringLayout() {
        super("Exemplo SpringLayout");
        SpringLayout layout = new SpringLayout();
        Container c = getContentPane();
        c.setLayout(layout);

        JButton b1 = new JButton("botao1");
        JButton b2 = new JButton("botao2");
        c.add(b1);
        c.add(b2);

        layout.putConstraint(SpringLayout.NORTH, b1, 20, SpringLayout.NORTH, c);
        layout.putConstraint(SpringLayout.WEST, b1, 30, SpringLayout.WEST, c);
        layout.putConstraint(SpringLayout.NORTH, b2, 20, SpringLayout.SOUTH, b1);
        layout.putConstraint(SpringLayout.WEST, b2, 0, SpringLayout.WEST, b1);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
