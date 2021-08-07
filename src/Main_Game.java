import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Main_Game extends JFrame {
	
	
	
	private JPanel contentPane;
	
	private Mode_1 P1;
	private Mode_2 P2;
	private Mode_3 P3;

	private int ModePlay = 0;


	public Main_Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
	
		
		/*
		Pane = new JPanel();
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(Pane);
		contentPane.setLayout(null);
		
		JButton Player_222 = new JButton("New button");
		Player_222.setIcon(new ImageIcon(Menu_Bar.class.getResource("/im/two_pla.png")));
		JButton Player_111 = new JButton("New button");
		Player_111.setIcon(new ImageIcon(Menu_Bar.class.getResource("/im/one_pl.png")));
		Pane.add(Player_111);
		Pane.add(Player_222);
       */		
		P1 = new Mode_1();
        P2 = new Mode_2();
		P3 = new Mode_3();
	
		
		JButton Two_Player = new JButton("New button");
		Two_Player.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/two_pla.png")));
		JButton One_Player = new JButton("New button");
		One_Player.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/one_pl.png")));
		
		JButton Level1 = new JButton("New button");
		Level1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/level11.png")));
		Level1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

				 ModePlay = 1;
			}
		});
		
		JButton Level2 = new JButton("New button");
		Level2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/level22.png")));
		Level2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

				 ModePlay =2;
			}
		});
		Level2.setBounds(326, 172, 89, 31);
		contentPane.add(Level2);
		Level2.setVisible(false);
		

		 
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

				
				Level1.setVisible(false);
				Level2.setVisible(false);
				
				One_Player.setVisible(true);
				Two_Player.setVisible(true);

				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/btn_Back.png")));
		btnNewButton_1.setBounds(183, 390, 89, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

			
				if(ModePlay == 1 )
				{
					contentPane = P1.getPanee();
					
				}else if( ModePlay == 2)
				{
					contentPane = P2.getPanee();
					
				}else 
				{
					contentPane = P3.Return_Pane();
					
				}
				 setP(contentPane);
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/btn_Start.png")));
		btnNewButton.setBounds(277, 390, 178, 60);
		contentPane.add(btnNewButton);
		Level1.setBounds(326, 143, 89, 31);
		contentPane.add(Level1);
		Level1.setVisible(false);
		
		
		
		
		One_Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();


				Level1.setVisible(true);
				Level2.setVisible(true);
				One_Player.setVisible(true);
				Two_Player.setVisible(false);
				
			}
		});
		One_Player.setBounds(62, 143, 178, 60);
		contentPane.add(One_Player);
		
		
		
		
		Two_Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

				
				 ModePlay = 3;
	
				 Level2.setVisible(false);
				 Level1.setVisible(false);
				 
				One_Player.setVisible(false);
				Two_Player.setEnabled(true);
			}
		});
		Two_Player.setBounds(68, 274, 172, 52);
		contentPane.add(Two_Player);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main_Game.class.getResource("/image_main/back_ground_menu3.png")));
		lblNewLabel.setBounds(0, 0, 484, 461);
		contentPane.add(lblNewLabel);
		
		setP(contentPane);
		
	}
	
	public void setP(JPanel P)
	{
		JPanel contentPane = (JPanel) this.getContentPane();

		contentPane.removeAll();
		contentPane.add(P);
		contentPane.revalidate(); 
		contentPane.repaint();
		
	}
	
	public JPanel getPanee()
	{
		return (JPanel) this.getContentPane();
		
	}

}





