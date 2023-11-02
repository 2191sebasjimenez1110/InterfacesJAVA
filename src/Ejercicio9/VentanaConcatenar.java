package Ejercicio9;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class VentanaConcatenar extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	private JLabel etiTexto;
	private JButton btnConcatenar;

	public VentanaConcatenar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 243);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Palabra Uno");
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblNewLabel.setBounds(47, 25, 95, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblPalabraDos = new JLabel("Palabra Dos\r\n");
		lblPalabraDos.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblPalabraDos.setBounds(47, 55, 95, 19);
		contentPane.add(lblPalabraDos);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		txtPalabra1.setBounds(170, 25, 230, 19);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(170, 55, 230, 19);
		contentPane.add(txtPalabra2);
		
		btnConcatenar = new JButton("Concatenar");
		btnConcatenar.setBounds(144, 141, 151, 30);
		btnConcatenar.addActionListener(this);
		contentPane.add(btnConcatenar);
		
		etiTexto = new JLabel("Palabra Concatenada");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		etiTexto.setBounds(10, 102, 414, 28);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnConcatenar) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
	
}
