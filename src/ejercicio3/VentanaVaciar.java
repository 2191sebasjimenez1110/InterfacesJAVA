package ejercicio3;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;

public class VentanaVaciar extends JFrame implements MouseListener, KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JButton btnVaciar;
	private JLabel etiTexto;

	public VentanaVaciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el texto ");
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 37, 106, 34);
		contentPane.add(lblNewLabel);
		
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		etiTexto.setBounds(30, 82, 382, 34);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("Vaciar");
		btnVaciar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		btnVaciar.addMouseListener(this);
		btnVaciar.setBounds(166, 127, 106, 34);
		contentPane.add(btnVaciar);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(146, 42, 266, 29);
		txtTexto.setColumns(10);
		txtTexto.addKeyListener(this);
		contentPane.add(txtTexto);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtTexto && e.getKeyCode() == KeyEvent.VK_ENTER) {
	        etiTexto.setText(txtTexto.getText());
	    }
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource()==btnVaciar) {
			etiTexto.setText("");
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
