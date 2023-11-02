package ejercicio4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaMensaje extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JLabel txtMensaje;
	private JButton btnDesactivar;
	private JButton btnActivar;
	private JButton btnAceptar;
	private JLabel lblNombre;
	private JLabel lblCiudad;

	public VentanaMensaje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 412, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblNombre.setForeground(new Color(0, 0, 0));
		lblNombre.setBounds(10, 11, 95, 26);
		contentPane.add(lblNombre);
		
		lblCiudad = new JLabel("Ciudad");
		lblCiudad.setForeground(Color.BLACK);
		lblCiudad.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblCiudad.setBounds(10, 48, 95, 26);
		contentPane.add(lblCiudad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(89, 11, 287, 26);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(89, 48, 287, 26);
		contentPane.add(txtCiudad);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnAceptar.setBounds(10, 158, 111, 34);
		btnAceptar.addMouseListener(this);
		contentPane.add(btnAceptar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnActivar.setBounds(141, 158, 111, 34);
		btnActivar.addMouseListener(this);
		contentPane.add(btnActivar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		btnDesactivar.setBounds(265, 158, 111, 34);
		btnDesactivar.addMouseListener(this);
		contentPane.add(btnDesactivar);
		
		txtMensaje = new JLabel("");
		txtMensaje.setForeground(Color.BLACK);
		txtMensaje.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		txtMensaje.setBounds(10, 101, 366, 26);
		contentPane.add(txtMensaje);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource() == btnAceptar) {
			String nombre = txtNombre.getText();
			String ciudad = txtCiudad.getText();
			txtMensaje.setText("Usted se llama "+ nombre +" y vive en " + ciudad);
;		} else if (e.getSource() == btnActivar) {
			txtNombre.setEnabled(true);
			lblNombre.setText("Nombre");
			txtCiudad.setEnabled(true);
			lblCiudad.setText("Ciudad");
		}	else if (e.getSource() == btnDesactivar) {
			txtNombre.setEnabled(false);
			lblNombre.setText("Desactivo");
			txtCiudad.setEnabled(false);
			lblCiudad.setText("Desactivo");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
