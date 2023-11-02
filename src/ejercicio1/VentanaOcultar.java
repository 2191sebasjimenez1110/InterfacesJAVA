package ejercicio1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class VentanaOcultar extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	JLabel etiNombre;
	JLabel etiCiudad;
	JButton btnOcultarCiudad;
	JButton btnVisuCiudad;
	JButton btnVisuNombre;
	JButton btnOcultarNombre;
	
	public VentanaOcultar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiCiudad = new JLabel("Ciudad");
		etiCiudad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiCiudad.setBounds(43, 66, 101, 23);
		contentPane.add(etiCiudad);
		
		btnVisuNombre = new JButton("Visualizar");
		btnVisuNombre.setBounds(150, 24, 101, 23);
		btnVisuNombre.addMouseListener(this);
		contentPane.add(btnVisuNombre);
		
		btnOcultarNombre = new JButton("Ocultar");
		btnOcultarNombre.setBounds(267, 24, 89, 23);
		btnOcultarNombre.addMouseListener(this);
		contentPane.add(btnOcultarNombre);
		
		etiNombre = new JLabel("Nombre");
		etiNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		etiNombre.setBounds(43, 21, 101, 23);
		contentPane.add(etiNombre);
		
		btnVisuCiudad = new JButton("Visualizar");
		btnVisuCiudad.setBounds(150, 66, 101, 23);
		btnVisuCiudad.addMouseListener(this);
		contentPane.add(btnVisuCiudad);
		
		btnOcultarCiudad = new JButton("Ocultar");
		btnOcultarCiudad.setBounds(267, 66, 89, 23);
		btnOcultarCiudad.addMouseListener(this);
		contentPane.add(btnOcultarCiudad);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		} else if (e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		} else if (e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		} else if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getSource()==btnVisuNombre) {
			etiNombre.setVisible(true);
		} else if (e.getSource()==btnOcultarNombre) {
			etiNombre.setVisible(false);
		} else if (e.getSource()==btnVisuCiudad) {
			etiCiudad.setVisible(true);
		} else if (e.getSource()==btnOcultarCiudad) {
			etiCiudad.setVisible(false);
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
