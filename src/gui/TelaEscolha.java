package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class TelaEscolha {

	private JFrame frmTelaDeEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException  ex) {
            System.err.println(ex);
        } 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEscolha window = new TelaEscolha();
					window.frmTelaDeEntrada.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaEscolha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaDeEntrada = new JFrame();
		frmTelaDeEntrada.setTitle("Tela de Entrada - MFit");
		frmTelaDeEntrada.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaEscolha.class.getResource("/imagens/biceps png.png")));
		frmTelaDeEntrada.getContentPane().setBackground(new Color(255, 255, 255));
		frmTelaDeEntrada.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 496, 107);
		frmTelaDeEntrada.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(79, 0, 340, 117);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Ricardo\\Downloads\\free_horizontal_on_white_by_logaster.png"));
		
		JLabel lblEscolhaUmaDas = new JLabel("Escolha uma das op\u00E7\u00F5es acima para que possa prosseguir");
		lblEscolhaUmaDas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaUmaDas.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblEscolhaUmaDas.setBounds(79, 418, 355, 23);
		frmTelaDeEntrada.getContentPane().add(lblEscolhaUmaDas);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setForeground(new Color(255, 255, 255));
		btnCadastrarCliente.setBackground(new Color(0, 128, 0));
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrarCliente.setBounds(159, 195, 176, 41);
		frmTelaDeEntrada.getContentPane().add(btnCadastrarCliente);
		
		JButton btnCadastrarInstrutor = new JButton("Cadastrar Instrutor");
		btnCadastrarInstrutor.setForeground(new Color(255, 255, 255));
		btnCadastrarInstrutor.setBackground(new Color(0, 128, 0));
		btnCadastrarInstrutor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrarInstrutor.setBounds(159, 265, 176, 41);
		frmTelaDeEntrada.getContentPane().add(btnCadastrarInstrutor);
		frmTelaDeEntrada.setBounds(100, 100, 512, 491);
		frmTelaDeEntrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}