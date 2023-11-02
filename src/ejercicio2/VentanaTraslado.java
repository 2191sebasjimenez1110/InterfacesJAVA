package ejercicio2;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaTraslado extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;

	
	JButton btnTraspasa2;
	JButton btnTraspasa1;
	JLabel etiTexto2;
	JLabel etiTexto1;
	public VentanaTraslado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(127, 43, 281, 25);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese el texto");
		lblNewLabel.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 40, 107, 26);
		contentPane.add(lblNewLabel);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiTexto1.setBounds(10, 77, 396, 26);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiTexto2.setBounds(10, 114, 396, 26);
		contentPane.add(etiTexto2);
		
		btnTraspasa1 = new JButton("Trasladar 1");
		btnTraspasa1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		btnTraspasa1.setBounds(61, 169, 107, 34);
		btnTraspasa1.addMouseListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Trasladar 2");
		btnTraspasa2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		btnTraspasa2.addMouseListener(this);
		btnTraspasa2.setBounds(225, 169, 107, 34);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==btnTraspasa1) {
			etiTexto1.setText(txtTexto.getText());
		}else if (e.getSource()==btnTraspasa2) {
			etiTexto2.setText(txtTexto.getText());
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
