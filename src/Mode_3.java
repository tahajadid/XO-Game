import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javazoom.jl.player.Player;

public class Mode_3 {

	private JPanel contentPane;
	int joueur = 1 ;
 	int[][] tab = new int[3][3];
 	int res = 2;
 	String Premier_Joueur;
 	String Deusieme_Joueur;
 	
	public Mode_3() {
		
	}
	
	public int Tester()
	{
		int resultat = 2 ;
		
		/************ For the first option the "O" symbol   ***********/
		
		if( (tab[0][0] == 0) && (tab[0][1] == 0 ) && (tab[0][2]==0)  )
		{
				resultat = 0; 
		}
		else if( (tab[1][0] == 0) && (tab[1][1] == 0 ) && (tab[1][2]==0) )
		{
			resultat = 0;
		}
		else if( (tab[2][0] == 0) && (tab[2][1] == 0 ) && (tab[2][2]==0) )
		{
			resultat = 0;
		}
		else if( (tab[0][0] == 0) && (tab[1][0] == 0 ) && (tab[2][0]==0) )
		{
			resultat = 0;
		}
		else if( (tab[0][1] == 0) && (tab[1][1] == 0 ) && (tab[2][1]==0) )
		{
			resultat = 0;
		}
		else if( (tab[0][2] == 0) && (tab[1][2] == 0 ) && (tab[2][2]==0) )
		{
			resultat = 0;
		}
		else if( (tab[0][0] == 0) && (tab[1][1] == 0 ) && (tab[2][2]==0) )
		{
			resultat = 0;
		}
		else if( (tab[0][2] == 0) && (tab[1][1] == 0 ) && (tab[2][0]==0) )
		{
			resultat = 0;
		}
		else {
			  /************ For the first option the "X" symbol   ***********/
			
			if( (tab[0][0] == 1) && (tab[0][1] == 1 ) && (tab[0][2]==1)  )
			{
					resultat = 1;	
			}
			else if( (tab[1][0] == 1) && (tab[1][1] == 1 ) && (tab[1][2]==1) )
			{
				resultat = 1;
			}
			else if( (tab[2][0] == 1) && (tab[2][1] == 1 ) && (tab[2][2]==1) )
			{
				resultat = 1;
			}
			else if( (tab[0][0] == 1) && (tab[1][0] == 1 ) && (tab[2][0]==1) )
			{
				resultat = 1;
			}
			else if( (tab[0][1] == 1) && (tab[1][1] == 1 ) && (tab[2][1]==1) )
			{
				resultat = 1;
			}
			else if( (tab[0][2] == 1) && (tab[1][2] == 1 ) && (tab[2][2]==1) )
			{
				resultat = 1;
			}
			else if( (tab[0][0] == 1) && (tab[1][1] == 1 ) && (tab[2][2]==1) )
			{
				resultat = 1;
			}
			else if( (tab[0][2] == 1) && (tab[1][1] == 1) && (tab[2][0]==1) )
			{
				resultat = 1;
			}
			else resultat = 2;
		}
		
		/********* THE FINAL RESULT *******/
		
		return  resultat;
	}
	
	public JPanel Return_Pane() 
	{
		
			
	       for(int i =0 ; i<3 ; i++)
	    	   for(int j = 0 ;j<3; j++)
	    		   tab[i][j]=2;
	       
			
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setLayout(null);
			this.contentPane.setBounds(100, 100,500, 500);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_1.setBounds(179, 87, 5, 303);
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_2.setBounds(290, 87, 5, 303);
			contentPane.add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_3.setBounds(63, 190, 350, 5);
			contentPane.add(label_3);
			
			JButton Restart = new JButton("RESTART");
			Restart.setForeground(Color.BLACK);
			Restart.setFont(new Font("Chiller", Font.PLAIN, 19));
			Restart.setBounds(113, 412, 257, 38);
			contentPane.add(Restart);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_4.setBounds(63, 287, 350, 5);
			contentPane.add(label_4);
			
			JButton btnNewButton0_1 = new JButton("");
			btnNewButton0_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			btnNewButton0_1.setBounds(187, 100, 101, 88);
			contentPane.add(btnNewButton0_1);
			
			
			JButton btnNewButton0_0 = new JButton("");
			btnNewButton0_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			btnNewButton0_0.setForeground(Color.BLACK);
			btnNewButton0_0.setBounds(76, 101, 101, 87);
			contentPane.add(btnNewButton0_0);
			
			JButton btnNewButton0_2 = new JButton("");
			btnNewButton0_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton0_2.setBounds(298, 101, 101, 87);
			contentPane.add(btnNewButton0_2);
			
			JButton btnNewButton1_0 = new JButton("");
			btnNewButton1_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton1_0.setBounds(76, 199, 101, 87);
			contentPane.add(btnNewButton1_0);
			
			JButton btnNewButton1_1 = new JButton("");
			btnNewButton1_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton1_1.setBounds(187, 199, 101, 87);
			contentPane.add(btnNewButton1_1);
			
			JButton btnNewButton1_2 = new JButton("");
			btnNewButton1_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton1_2.setBounds(298, 199, 101, 87);
			contentPane.add(btnNewButton1_2);
			
			JButton btnNewButton2_0 = new JButton("");
			btnNewButton2_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton2_0.setBounds(76, 292, 101, 87);
			contentPane.add(btnNewButton2_0);
			
			JButton btnNewButton2_1 = new JButton("");
			btnNewButton2_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton2_1.setBounds(187, 292, 101, 87);
			contentPane.add(btnNewButton2_1);
			
			JButton btnNewButton2_2 = new JButton("");
			btnNewButton2_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg")));
			btnNewButton2_2.setBounds(298, 292, 101, 87);
			contentPane.add(btnNewButton2_2);
			
			JButton btnNewButton_O = new JButton("");
			btnNewButton_O.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					joueur = 2;
				 	Premier_Joueur = "Le joueur qui a choisis le 'O' ";
				 	Deusieme_Joueur = "Le joueur qui a choisis le 'X' ";
				}
			});
			btnNewButton_O.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/choice_o.png")));
			btnNewButton_O.setBounds(314, 40, 40, 38);
			contentPane.add(btnNewButton_O);
			
			JButton btnNewButton_X = new JButton("New button");
			btnNewButton_X.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					joueur = 1;
					Premier_Joueur = " Le joueur qui a choisis le 'X' ";
				 	Deusieme_Joueur = "Le joueur qui a choisis le 'O' ";
				}
			});
			
			btnNewButton_X.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/x_ch.png")));
			btnNewButton_X.setBounds(380, 40, 41, 38);
			contentPane.add(btnNewButton_X);
			
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/final.png")));
			label.setBounds(0, 0, 484, 461);
			contentPane.add(label);
			
			
		     
		       btnNewButton0_0.addActionListener(new ActionListener() {
		    private Win jD0_0;
			private Win jD0_0_2;

			public void actionPerformed(ActionEvent e) {
				sound.PlayMusic();

				 if( (joueur % 2) == 1)
				   {
					 btnNewButton0_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final.png") ) );
				      joueur++;
				      tab[0][0] = 1;
				   }
				 else {
					 btnNewButton0_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final.png") ) );
				      joueur++;
				      tab[0][0] = 0;
				 }
				 res = Tester();
				if((res == 0) || (res==1)) 
				{
					for(int i =0;i<3;i++ )
					 {
						
					 }

					 if(res == 0)
					 {
						 jD0_0 = new Win(""); 
						 Restart.doClick();
					
					 }else 
						 {
						 jD0_0_2 = new Win("");
						 Restart.doClick();
						 }
				}
				 
				
			}
		   });
		

			     btnNewButton0_1.addActionListener(new ActionListener() {
					   private Win jD0_1;
					private Win jD0_1_2;

					public void actionPerformed(ActionEvent e) {
						sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton0_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png") ) );
						      joueur++;
						      tab[0][1] = 1;
						   
						   }
						 else {
							 btnNewButton0_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (2).png") ) );
						      joueur++;
						      tab[0][1] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 jD0_1 = new Win(""); 
									 Restart.doClick();
								 }else if(res == 1)
									 {
									 jD0_1_2 = new Win(""); 
									 Restart.doClick();
									 }
							}
							 
					}
				   });
			     
			     
			       btnNewButton0_2.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						   
						 if( (joueur % 2) == 1)
						   {
							  btnNewButton0_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (3).png") ) );
						      joueur++;
						      tab[0][2] = 1;
						      
						   }
						 else {
							 btnNewButton0_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (3).png") ) );
						      joueur++;
						      tab[0][2] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								 if(res == 0)
								 {
									 Win JD0_2 = new Win(" "); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD0_2_2 = new Win(""); 
									 Restart.doClick();
									 }
							}
					}
				   });
			       
			       btnNewButton1_0.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton1_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (4).png") ) );
						      joueur++;
						      tab[1][0] = 1;
						      
						   }
						 else {
							 btnNewButton1_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (4).png") ) );
						      joueur++;
						      tab[1][0] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
															
								 if(res == 0)
								 {
									 Win JD1_0 = new Win(" "); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD1_0_2 = new Win(" "); 
									 Restart.doClick();
									 }
							}
					}
				   });
			       
			       btnNewButton1_1.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton1_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (5).png") ) );
						      joueur++;
						      tab[1][1] = 1;
						      
						   }
						 else {
							 btnNewButton1_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (5).png") ) );
						      joueur++;
						      tab[1][1] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 Win JD1_1 = new Win(""); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD1_1_2 = new Win(" "); 
									 Restart.doClick();
									 }
							}
					}
				   });
			       
			       btnNewButton1_2.addActionListener(new ActionListener() {
					   private Win jD1_2;

					public void actionPerformed(ActionEvent e) {
						sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton1_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (6).png") ) );
						      joueur++;
						      tab[1][2] = 1;
						      
						   }
						 else {
							 btnNewButton1_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (6).png") ) );
						      joueur++;
						      tab[1][2] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 jD1_2 = new Win(""); 
									 Restart.doClick();
								 }else 
									 { 
									 Win JD1_2_2 = new Win(""); 
									 Restart.doClick();
									 }
							}
					}
				   });
			       
			       btnNewButton2_0.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton2_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (7).png") ) );
						      joueur++;
						      tab[2][0] = 1;
						   }
						 else {
							 btnNewButton2_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (7).png") ) );
						      joueur++;
						      tab[2][0] =0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 Win JD2_0 = new Win(""); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD2_0_0 = new Win(" "); 
									 Restart.doClick();
									 }
							}
					}
				   });
			       
			       btnNewButton2_1.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton2_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (8).png") ) );
						      joueur++;
						      tab[2][1] = 1;
						      
						   }
						 else {
							 btnNewButton2_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie (8).png") ) );
						      joueur++;
						      tab[2][1] = 0;
						 }
						 res = Tester();
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 Win JD2_1 = new Win(""); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD2_2_1_2 = new Win(""); 
									 Restart.doClick();
									 } 
								 
							}
					}
				   });
			       
			       btnNewButton2_2.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e) {
							sound.PlayMusic();

						 if( (joueur % 2) == 1)
						   {
							  btnNewButton2_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie.png") ) );
						      joueur++;
						      tab[2][2] = 1;
						      
						   }
						 else {
							 btnNewButton2_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/O_final - Copie.png") ) );
						      joueur++;
						      tab[2][2] = 0;
						 
						 }
						 res = Tester();
						 
						 if((res == 0) || (res==1)) 
							{
								
								 if(res == 0)
								 {
									 Win JD2_2 = new Win(" "); 
									 Restart.doClick();
								 }else 
									 {
									 Win JD2_2_2 = new Win(" "); 
									 Restart.doClick();
									 }
								 
							}
					}
				   });
			       Restart.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							btnNewButton2_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton2_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton2_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton1_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton1_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton1_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton0_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton0_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							btnNewButton0_0.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but.jpg") ));
							 for(int i =0 ; i<3 ; i++)
						    	   for(int j = 0 ;j<3; j++)
						    		   tab[i][j]=2;
							
						}
					});
			       
			       return contentPane;
			
		}
	
}
