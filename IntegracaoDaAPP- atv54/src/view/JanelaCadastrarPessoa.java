package view;
import Controller.PessoaController;
import model.Pessoa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class JanelaCadastrarPessoa extends JFrame {
    private PessoaController controller ;
    private JLabel labelnome;
    private JButton botaoCadastrar;
    private JButton botaoConsultar;
    private JTextField textoNome;
    private JTextArea textoResultado;
    private JLabel labelId;
    private JTextField textoId;
    private JButton botaoAtualizar;
    private JButton botaoExcluir;
    public JanelaCadastrarPessoa() {
        controller = new PessoaController();
        initComponents();
    }
    private void initComponents() {
        labelnome = new JLabel("Nome: ");
        botaoCadastrar = new JButton("Cadastrar");
        botaoConsultar = new JButton("Consultar");
        textoNome = new JTextField();
        textoResultado = new JTextArea();

        labelId = new JLabel("ID:");
        textoId = new JTextField();
        botaoAtualizar = new JButton("Atualizar");
        botaoExcluir = new JButton("Excluir");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastrar Pessoa");

        labelId.setBounds(50,10,40,25);
        add(labelId);
        textoId.setBounds(90,10,180,20);
        add(textoId);



        setLayout(null);
        labelnome.setToolTipText("Nome: ");
        labelnome.setBounds(50,40,40,25);
        add(labelnome);

        textoNome.setColumns(20);
        textoNome.setBounds(90,40,180,20);
        add(textoNome);

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(e -> {
            String nome = textoNome.getText();
            controller.cadastrarPessoa(textoNome.getText());
            JOptionPane.showMessageDialog(this, "Pessoa cadastrada!");
        });

        botaoCadastrar.setBounds(30,120,110,30);
        add(botaoCadastrar);

        botaoConsultar.addActionListener(e -> {
            String nome = textoNome.getText();
            Pessoa pessoa = controller.consultarPessoa(textoNome.getText());
            if (pessoa != null) {
                textoResultado.setText("ID: " + pessoa.getId() + "\n Nome: " + pessoa.getNome());

            } else {
                textoResultado.setText("Pessoa não encontrada.");
            }
        });
        botaoConsultar.setBounds(160,120,110,30);
        add(botaoConsultar);

        textoResultado.setColumns(20);
        textoResultado.setRows(5);
        textoResultado.setBounds(20,190,260,100);
        add(textoResultado);

        setSize(350,380);
        setLocationRelativeTo(null);



        botaoAtualizar.addActionListener(e -> {
            int id = Integer.parseInt(textoId.getText());
            String nome = textoNome.getText();
            controller.atualizarPessoa(id, nome);
            JOptionPane.showMessageDialog(this, "Pessoa atualizada com sucesso!");
        });
        botaoExcluir.addActionListener(e -> {
            int id = Integer.parseInt(textoId.getText());
            controller.excluirPessoa(id);
            JOptionPane.showMessageDialog(this, "Pessoa removida com sucesso!");
        });
        botaoCadastrar.setBounds(20,100,120,30);
        add(botaoCadastrar);
        botaoConsultar.setBounds(160,100,120,30);
        add(botaoConsultar);
        botaoAtualizar.setBounds(20,140,120,30);
        add(botaoAtualizar);
        botaoExcluir.setBounds(160,140,120,30);
        add(botaoExcluir);

        setVisible(true);

    }
}
