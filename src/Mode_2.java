import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;


	import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
	import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
	import java.awt.event.ActionListener;
	import java.util.Random;
	import java.awt.event.ActionEvent;

	
public class Mode_2 {
	

		private JFrame frame;

		public static int nbr_tour=0 ;
		public static int[][] M =new int[3][3] ;
		public 		JButton b1 = new JButton("b1");
		public 		JButton b2 = new JButton("b2");
		public 		JButton b3 = new JButton("b3");
		public 		JButton b4 = new JButton("b4");
		public 		JButton b5 = new JButton("b5");
		public 		JButton b6 = new JButton("b6");
		public 		JButton b7 = new JButton("b7");
		public 		JButton b8 = new JButton("b8");
		public 		JButton b9 = new JButton("b9");

		Win jD1;
		Lose jD11;
		
		

		/**
		 * Create the application.
		 */
		public Mode_2() {
			for(int i=0 ; i<3 ; i++) {
				for(int j=0;j<3;j++)
				{
					M[i][j]=0;
				}
			}
			
			initialize();
			
		}
		public JPanel getPanee()
		{
			return (JPanel) frame.getContentPane();
			
		}
		
		
		
		public int testG() {
			int a=0;
			int S=0;
			
			////////////test de C
		S=M[0][0]+M[1][0]+M[2][0];
			if(S==7) a=2; //// 2 pour le PC
			if(S==70) a=1; ////1 pour le joueur
		
			S=M[0][1]+M[1][1]+M[2][1];
			if(S==7) a=2; //// 2 pour le PC
			if(S==70) a=1; ////1 pour le joueur
			
		S=M[0][2]+M[1][2]+M[2][2];
			if(S==7) a=2; //// 2 pour le PC
			if(S==70) a=1; ////1 pour le joueur
			/////////////test de L
			S=M[0][1]+M[0][2]+M[0][0];
				if(S==7) a=2; //// 2 pour le PC
				if(S==70) a=1; ////1 pour le joueur
			
			S=M[1][1]+M[1][2]+M[1][0];
				if(S==7) a=2; //// 2 pour le PC
				if(S==70) a=1; ////1 pour le joueur
				
			S=M[2][1]+M[2][2]+M[2][0];
				if(S==7) a=2; //// 2 pour le PC
				if(S==70) a=1; ////1 pour le joueur
			
			/////////////test de D
			int K;
				K=M[0][0]+M[1][1]+M[2][2];
				if(K==7) a=2;
				if(K==70) a=1;
				K=M[0][2]+M[1][1]+M[2][0];
				if(K==12) a=2;
				if(K==120) a=1;			
				
			return a;
		}
		

	public boolean  testLG() {
		boolean result=false;
		for(int i=0;i<3;i++) {
			int S=0;
			for(int j=0;j<3;j++) {
				S=S+M[i][j];}
			if(S==3 && i==0) {
				b3.doClick();
				b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && i==0) {
				b2.doClick();
				b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && i==0) {
				b1.doClick();
				b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==3 && i==1) {
				b5.doClick();
				b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && i==1) {
				b4.doClick();
				b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && i==1) {
				b6.doClick();
				b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==3 && i==2) {
				b7.doClick();
				b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && i==2) {
				b9.doClick();
				b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && i==2) {
				b8.doClick();
				b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			
			
		}
		return result;	
	}
	/////////////////////////////////////empeche l adv de gagner
	public boolean  testL() {
		boolean result=false;
		for(int i=0;i<3;i++) {
			int S=0;
			for(int j=0;j<3;j++) {
				S=S+M[i][j];}
			if(S==30 && i==0) {
				b3.doClick();
				b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && i==0) {
				b2.doClick();
				b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && i==0) {
				b1.doClick();
				b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==30 && i==1) {
				b5.doClick();
				b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && i==1) {
				b4.doClick();
				b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && i==1) {
				b6.doClick();
				b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==30 && i==2) {
				b7.doClick();
				b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && i==2) {
				b9.doClick();
				b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && i==2) {
				b8.doClick();
				b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			
			
		}
		return result;	
	}



	public boolean  testCG() {
		boolean result=false;
		for(int j=0;j<3;j++) {
			int S=0;
			for(int i=0;i<3;i++) {
				S=S+M[i][j];}
			if(S==3 && j==0) {
				b7.doClick();
				b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && j==0) {
				b4.doClick();
				b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && j==0) {
				b1.doClick();
				b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==3 && j==1) {
				b5.doClick();
				b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && j==1) {
				b2.doClick();
				b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && j==1) {
				b8.doClick();
				b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==3 && j==2) {
				b3.doClick();
				b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==5 && j==2) {
				b9.doClick();
				b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==6 && j==2) {
				b6.doClick();
				b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
		}
		return result;	
	}



	public boolean  testC() {
		boolean result=false;
		for(int j=0;j<3;j++) {
			int S=0;
			for(int i=0;i<3;i++) {
				S=S+M[i][j];}
			if(S==30 && j==0) {
				b7.doClick();
				b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && j==0) {
				b4.doClick();
				b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && j==0) {
				b1.doClick();
				b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==30 && j==1) {
				b5.doClick();
				b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && j==1) {
				b2.doClick();
				b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && j==1) {
				b8.doClick();
				b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==30 && j==2) {
				b3.doClick();
				b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==50 && j==2) {
				b9.doClick();
				b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
			if(S==60 && j==2) {
				b6.doClick();
				b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
				result= true; 
				break;}
		}
		return result;	
	}




	//////////////////////////////////////

	public boolean testDG() {
		boolean result=false;
		 	
		int i=1;
		int S=0;
		if(i==1) {
			S=M[0][0]+M[1][1]+M[2][2];
			if(S==3) { b5.doClick();
			b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			if(S==5) { b9.doClick();
			b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			if(S==6) { b1.doClick();
			b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			i++;
		}
		if(i==2) {
			S=M[0][2]+M[1][1]+M[2][0];
			if(S==8) {
			if(M[0][2]==(0)) { b3.doClick();
			b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			if(M[1][1]==(0)) { b5.doClick();
			b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			if(M[2][0]==(0)) {b7.doClick();
			b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			}
			}
			return result;
		}

	/////////////////////////////////////empeche l adv de gagner

	public boolean testD() {
		boolean result=false;
		 	
		int i=1;
		int S=0;
		if(i==1) {
			S=M[0][0]+M[1][1]+M[2][2];
			if(S==30) { b5.doClick();
			b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			if(S==50) { b9.doClick();
			b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			if(S==60) { b1.doClick();
			b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;i=0;}
			i++;
		}
		if(i==2) {
			S=M[0][2]+M[1][1]+M[2][0];
			if(S==80) {
			if(M[0][2]==(0)) { b3.doClick();
			b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			if(M[1][1]==(0)) { b5.doClick();
			b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			if(M[2][0]==(0)) {b7.doClick();
			b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
			result=true;}
			}
			}
			return result;
		}


	///////////////////////////////
		
    public void clickaleatoire() {
	int a;
	Random s = new Random();
	int b=0;
while(b==0) {
	 a= s.nextInt(9);
	if(a==0 && M[0][0]==(0)) {
		
		b1.doClick();b=1;}
	else if(a==1 && M[0][1]==(0)) {
	
		b2.doClick(); b=1;}
	else if(a==2 && M[0][2]==(0)) {
		b3.doClick();b=1;}
	else if(a==3 && M[1][0]==(0)) {
		b4.doClick(); b=1;}
	else if(a==4 && M[1][1]==(0)) {
		b5.doClick();b=1;}
	else if(a==5 && M[1][2]==(0)) {
		b6.doClick(); b=1;}
	else if(a==6 && M[2][0]==(0)) {
		b7.doClick(); b=1;}
	else if(a==7 && M[2][1]==(0)) {
		b8.doClick();b=1;}
	else if(a==8 && M[2][2]==(0)) {
		b9.doClick(); b=1;}
}}
		////////////////////////////////////////
		

		/**
		 * Initialize the contents of the frame.
		 */
	public void decision() {
		
		boolean result=false;
		

			result=testLG();

			if(result==false) {
				result=testCG();
				if(result==false) {
					result=testDG();
					if(result==false) {
						result=testL();
						if(result==false) {
							result=testC();
							if(result==false) {
								result=testD();
								if(result==false) {
									clickaleatoire();
								}
							}
						}
						
					}
				}
			}		
		}

		
		
		private void initialize() {
			
			
			
			
			frame = new JFrame();
			frame.setBounds(100, 100, 500, 500);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_1.setBounds(179, 87, 5, 303);
			frame.getContentPane().add(label_1);
			
			JLabel label_2 = new JLabel("");
			label_2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_2.setBounds(290, 87, 5, 303);
			frame.getContentPane().add(label_2);
			
			JLabel label_3 = new JLabel("");
			label_3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_3.setBounds(63, 190, 350, 5);
			frame.getContentPane().add(label_3);
			
			JLabel label_4 = new JLabel("");
			label_4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/black.jpg")));
			label_4.setBounds(63, 287, 350, 5);
			frame.getContentPane().add(label_4);
			
			JButton Restart = new JButton("RESTART");
			Restart.setForeground(Color.BLACK);
			Restart.setFont(new Font("Chiller", Font.PLAIN, 19));
			Restart.setBounds(113, 412, 257, 38);
			frame.getContentPane().add(Restart);
			
			
			
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

					if(M[0][0]==(0) && nbr_tour==8) {
						b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						
						
						M[0][0]=10;
						nbr_tour++;	
						int y=0;
						y=testG();
						
						 if(y == 1)
						 {
							 jD1 = new Win(""); Restart.doClick(); 
							
							
						 }else if(y==2)
							 {
							 jD11 = new Lose(""); Restart.doClick();
							 }
						 
					}
					int i=0;
					if(M[0][0]==(0) && nbr_tour!=8) {	
					
					if(nbr_tour%2==0 && i==0 ) {
						b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
					
						
						M[0][0]=10;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==0) {
							decision();
						}
						else if(y == 1)
						 {
							 jD1 = new Win(""); Restart.doClick(); 
						 }else if(y==2)
							 {
							 jD11 = new Lose(""); Restart.doClick();
							 }
						

						

					}
					if(nbr_tour%2==1 && i==0 ) {
						b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
					
						M[0][0]=1;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) { jD1 = new Win(""); Restart.doClick();}
						if(y==2) {jD11 = new Lose(""); Restart.doClick();
						}
						
					}
					}

				}
			});
			b1.setBounds(76, 101, 101, 87);
			frame.getContentPane().add(b1);
			
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				if(M[0][1]==(0) && nbr_tour==8) {
						
					b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[0][0]=20;
						nbr_tour++;		
						int y=0;
						y=testG();
						if(y==1) 	{	
							 jD1 = new Win(""); Restart.doClick(); 
						}
						if(y==2) {		
							
							jD11 = new Lose(""); Restart.doClick();}
					}
					if(M[0][1]==(0) && nbr_tour!=8) {
						int i=0;
						
					if(nbr_tour%2==0 && i==0) {
						b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						
						M[0][1]=20;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==0) {
							decision();
						}
						else if(y==1) 	{		
							 jD1 = new Win(""); Restart.doClick();
							}
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick();
							}
						
						
					}
					if(nbr_tour%2==1 && i==0) {
						b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						
						M[0][1]=2;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();
							}
						if(y==2) {
							jD11 = new Lose(""); Restart.doClick();
							}
			
						
					}


				}		
		

				}});
			b2.setBounds(187, 100, 101, 88);
			frame.getContentPane().add(b2);
			
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				int i=0;
				if(M[0][2]==(0) && nbr_tour==8) {
					
					b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
					M[0][2]=40;
					nbr_tour++;	
					int y=0;
					y=testG();
					if(y==1) 	{	
						 jD1 = new Win(""); Restart.doClick(); 
						}
					if(y==2) {		
						jD11 = new Lose(""); Restart.doClick(); }
				}
					if(M[0][2]==(0) && nbr_tour!=8) {
						

					if(nbr_tour%2==0 && i==0) {
						b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[0][2]=40;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==0) {
							decision();
						}
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); Restart.doClick();}
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick();}
						

					}
					if(nbr_tour%2==1 && i==0) {
						
						b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						M[0][2]=4;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick(); }
			

						
					}
					}



				}
			});
			b3.setBounds(298, 101, 101, 87);
			frame.getContentPane().add(b3);
			
			b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

					int i=0;
					if(M[1][0]==(0) && nbr_tour==8) {
						
						b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[1][0]=20;
						nbr_tour++;		
						int y=0;
						y=testG();
						if(y==1) 	{	
							 jD1 = new Win(""); Restart.doClick();
							 }
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();}
					}
					if(M[1][0]==(0) && nbr_tour!=8) {				
					if(nbr_tour%2==0 && i==0) {
						b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[1][0]=20;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();}
						if(y==0) {
							decision();
						}
						
					}
					if(nbr_tour%2==1 && i==0) {
						
						b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						
						M[1][0]=2;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);}
			
						
					}
				}

				}
			});
			b4.setBounds(76, 199, 101, 87);
			frame.getContentPane().add(b4);
			
			b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				int i=0;
				if(M[1][1]==(0) && nbr_tour==8) {
					b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
					
					M[1][1]=40;
					nbr_tour++;			
					int y=0;
					y=testG();
					if(y==1) 	{	
						 jD1 = new Win(""); Restart.doClick();}
					if(y==2) {	
						jD11 = new Lose(""); Restart.doClick();}
				}
					if(M[1][1]==(0) && nbr_tour!=8) {

					if(nbr_tour%2==0 && i==0) {
						
						b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[1][1]=40;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();}
						if(y==0) {
							decision();
						}				}
					if(nbr_tour%2==1 && i==0) {
						b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						M[1][1]=4;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();}
			

					}

					}

				}
			});
			b5.setBounds(187, 199, 101, 87);
			frame.getContentPane().add(b5);
			
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

					
						if(M[1][2]==(0) && nbr_tour==8) {
							b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[1][2]=10;
						nbr_tour++;				
						int y=0;
						y=testG();
						if(y==1) 	{	
							 jD1 = new Win(""); Restart.doClick();}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();}
					}
					int i=0;
					if(M[1][2]==(0) && nbr_tour!=8) {	

					if(nbr_tour%2==0 && i==0) {
						
						b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[1][2]=10;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick();}
						if(y==2) {
							jD11 = new Lose(""); Restart.doClick();}
						if(y==0) {
							decision();
						}

					}
					if(nbr_tour%2==1 && i==0) {
						b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						M[1][2]=1;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick(); Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);}
						if(y==2) {
							jD11 = new Lose(""); Restart.doClick();Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);}
			

					}
					}

				}
			});
			b6.setBounds(298, 199, 101, 87);
			frame.getContentPane().add(b6);
			
			b7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				int i=0;
				if(M[2][0]==(0) && nbr_tour==8) {
					
					b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
					
					M[2][0]=40;
					nbr_tour++;				
					int y=0;
					y=testG();
					if(y==1) 	{	
						 jD1 = new Win(""); Restart.doClick(); }
					if(y==2) {	
						jD11 = new Lose(""); Restart.doClick();}
				}
					if(M[2][0]==(0) && nbr_tour!=8) {	

					if(nbr_tour%2==0 && i==0) {
						
						b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[2][0]=40;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick(); 
							}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();
							}
						if(y==0) {
							decision();
						}

					}
					if(nbr_tour%2==1 && i==0) {
						b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						M[2][0]=4;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {	
							 jD1 = new Win(""); Restart.doClick(); 
							}
						if(y==2) {	
							jD11 = new Lose(""); Restart.doClick();
							}
			

					}

					}		

				}		

			});
			b7.setBounds(76, 292, 101, 87);
			frame.getContentPane().add(b7);
			
			b8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				
					int i=0;
					if(M[2][1]==(0) && nbr_tour==8) {
						
						b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[2][1]=10;
						nbr_tour++;			
						int y=0;
						y=testG();
						if(y==1) 	{	
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick(); }
					}
					if(M[2][1]==(0) && nbr_tour!=8) {	
					

					if(nbr_tour%2==0 && i==0) {
						
						b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[2][1]=10;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick();}
						if(y==0) {
							decision();
						}

					}
					if(nbr_tour%2==1 && i==0) {
						b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						
						M[2][1]=1;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick(); Restart.doClick();}
			
					}
					}		

				}
			});
			b8.setBounds(187, 292, 101, 87);
			frame.getContentPane().add(b8);
			
			b9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();

				
					int i=0;
					if(M[2][2]==(0) && nbr_tour==8) {
						
						b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[2][2]=20;
						nbr_tour++;	
						int y=0;
						y=testG();
						if(y==1) 	{		
							 jD1 = new Win("Jouer qui a choisis le 'O' "); 
							System.out.println("P");}
						if(y==2) {		
							jD11 = new Lose("uu");
							System.out.println("C");}

					}	
					if(M[2][2]==(0) && nbr_tour!=8) {	
					

					if(nbr_tour%2==0 && i==0) {
						
						b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/X_final - Copie (2).png")));
						M[2][2]=20;
						i++;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick();}
						if(y==0) {
							decision();
						}
					}
					if(nbr_tour%2==1 && i==0) {
						b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode1/O_final - Copie (2).png")));
						M[2][2]=2;
						nbr_tour++;
						int y=0;
						y=testG();
						if(y==1) {		
							 jD1 = new Win(""); Restart.doClick(); }
						if(y==2) {		
							jD11 = new Lose(""); Restart.doClick();
							}
			

					}
					}			

				}			

			});
			b9.setBounds(298, 292, 101, 87);
			frame.getContentPane().add(b9);
			

			
			
			
			Restart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sound.PlayMusic();
					
					 Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);
					 
					 for(int i =0 ; i<3 ; i++)
					 { for(int j = 0 ;j<3; j++)
				    	   {  M[i][j]=0;}}
					 nbr_tour=0;

					 
			
					
				}
			});
			
			
			
			Initial_Icon(b1,b2,b3,b4,b5,b6,b7,b8,b9);
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(Main_Game.class.getResource("/image_mode3/final_mode1.png")));
			label.setBounds(0, 0, 484, 461);
			frame.getContentPane().add(label);

			
		}
		
		public void Initial_Icon(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,
				JButton b6,JButton b7,JButton b8,JButton b9)
		{
			b9.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b8.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b7.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b6.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b5.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b4.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b3.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b2.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			b1.setIcon(new ImageIcon(Main_Game.class.getResource("/image_win/but - Copie (2).jpg")));
			 for(int i =0 ; i<3 ; i++)
		    	   for(int j = 0 ;j<3; j++)
		    		   M[i][j]=0;
			 nbr_tour = 0 ;
			
		}
		
		

	}


