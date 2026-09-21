import javax.swing.*;
import java.awt.*;

public class TelaCriacaoHeroi extends JFrame {

    private JLabel rotuloTitulo;
    private JTextField campoNome;
    private JTextField campoVida;
    private JTextField campoForca;
    private JTextField campoClasse;
    private JButton botaoCriar;

    public TelaCriacaoHeroi() {

        super("IF Quest");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        rotuloTitulo = new JLabel("Criação de Herói", SwingConstants.CENTER);
        add(rotuloTitulo, BorderLayout.NORTH);

        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));

        painelFormulario.add(new JLabel("Nome:"));
        campoNome = new JTextField();
        painelFormulario.add(campoNome);

        painelFormulario.add(new JLabel("Vida inicial:"));
        campoVida = new JTextField();
        painelFormulario.add(campoVida);

        painelFormulario.add(new JLabel("Força:"));
        campoForca = new JTextField();
        painelFormulario.add(campoForca);

         painelFormulario.add(new JLabel("Classe (Mago/Guerreiro):"));
        campoClasse = new JTextField();
        painelFormulario.add(campoClasse);


        add(painelFormulario, BorderLayout.CENTER);

        botaoCriar = new JButton("Criar Herói");
        add(botaoCriar, BorderLayout.SOUTH);
    }
     public static void main(String[] args) {
        TelaCriacaoHeroi tela = new TelaCriacaoHeroi();
        tela.setVisible(true);
    }
}