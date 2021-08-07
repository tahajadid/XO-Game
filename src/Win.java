import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.EventQueue;
import java.io.*;

import java.awt.SystemColor;

import java.awt.EventQueue;
import java.io.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class Win extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JTextField textField;
	public static  InputStream musicB;
	public static AudioStream audiosB;

	public Win(String J) {


		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNon = new JButton("NO");
		btnNon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNon.setForeground(Color.RED);
		btnNon.setBounds(250, 203, 117, 47);
		contentPanel.add(btnNon);
		
		JLabel lblVoulezVousContinuez = new JLabel("Do you want to continue ?");
		lblVoulezVousContinuez.setForeground(new Color(65, 105, 225));
		lblVoulezVousContinuez.setFont(new Font("Impact", Font.PLAIN, 27));
		lblVoulezVousContinuez.setBounds(86, 170, 281, 41);
		contentPanel.add(lblVoulezVousContinuez);
		
		JButton btnNewButton = new JButton("YES");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Berlin Sans FB", Font.PLAIN, 23));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(86, 203, 164, 47);
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Win.class.getResource("/image_win/Back_Ground_JD_1.png")));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPanel.add(lblNewLabel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		PlayMusic();
		
	}
	
	

	public static void InitMusic() {
		try {
			musicB = new FileInputStream(new File("music/congratulations_intro-sjmkyYyWdzM.wav"));
			audiosB= new AudioStream(musicB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void stopMusic() {
		AudioPlayer.player.stop(audiosB);
	}
	public static void PlayMusic() {
		stopMusic();
		InitMusic();
		AudioPlayer.player.start(audiosB);
		 
	}
	
}








	
	
	

	


