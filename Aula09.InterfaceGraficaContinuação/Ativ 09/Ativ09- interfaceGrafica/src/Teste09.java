import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teste09 extends JFrame {
    private JButton botao1, botao2;
    private Icon borbo2 = new ImageIcon(Teste09.class.getResource("borbo2.jpg"));
    private String strIcone = "botao associado a uma imagem";
    private String strFinalizar = "Finalizar";
    public Teste09() {
        super("Testando Botões");
            Container container = getContentPane();
            container.setLayout(new FlowLayout());
            botao1 = new JButton("Botão Java", borbo2);
            botao1.setToolTipText("Pressione o botão");
            botao1.setActionCommand(strIcone);
            container.add(botao1);
            botao2 = new JButton(strFinalizar);
            botao2.setToolTipText("Finaliza o programa");
            container.add(botao2);

            GerenciadorBotoes gestorBotoes = new GerenciadorBotoes();
            botao1.addActionListener(gestorBotoes);
            botao2.addActionListener(gestorBotoes);
            setSize(545, 280);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);
        }
        private class GerenciadorBotoes implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getActionCommand().equals(strIcone)) {
                    JOptionPane.showMessageDialog(null, "Você pressionou: botão associado a uma imagem");
                } else if (event.getActionCommand().equals(strFinalizar)) {
                    System.exit(0);
                    setVisible(true);
                }
            }
        }
    }
