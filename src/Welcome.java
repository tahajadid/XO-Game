import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private Main_Game game;
	JButton go ;

	public static void main(String[] args ) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Welcome() {
		
		game = new Main_Game();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 17));
		lblNewLabel.setIcon(new ImageIcon(Welcome.class.getResource("/image_main/back_ground_menu.png")));
		lblNewLabel.setBounds(0, 0, 494, 461);
		contentPane.add(lblNewLabel);
		
		setP(contentPane);
		
		JButton go = new JButton("GOO !!");
		go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();
				contentPane = game.getPanee();
				setP(contentPane);

			}
		});
		go.setFont(new Font("Bauhaus 93", Font.PLAIN, 21));
		go.setForeground(Color.DARK_GRAY);
		go.setBounds(203, 417, 116, 33);
		contentPane.add(go);
		
	}
	public void setP(JPanel P)
	{
		JPanel contentPane = (JPanel) this.getContentPane();

		contentPane.removeAll();
		contentPane.add(P);
		contentPane.revalidate(); 
		contentPane.repaint();
		
	}
}
