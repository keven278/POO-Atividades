import javax.swing.*;
import java.awt.*;
import javax.swing.Icon;

public class Teste07 extends JFrame {
    private final JLabel label;
    private final Icon icone;

    public Teste07(){
        super("Exemplo com tooltrip");
        label = new JLabel("Hello word");
        icone = new ImageIcon("./src/assets/Gato.png");

        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setVerticalTextPosition(SwingConstants.BOTTOM);


        label.setToolTipText("Dica de um label");
        Container c1 = getContentPane();
        c1.add(label);

        label.setIcon(icone);

        setSize(600,400);
        setVisible(true);
    }

}
