


import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Line2D;
import  javax.speech.synthesis.SynthesizerProperties ;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

import java.util.Vector;
import java.util.Enumeration;
import java.io.*;

import javax.sound.sampled.*;

import org.tritonus.dsp.ais.AmplitudeAudioInputStream;

//import CapturePlayback.SamplingGraph;


 
public class thiru1 extends JPanel implements ActionListener 
{
	////////////////////////////////////////
	int n;         
	int c;
	
	char[] mscomarr;
	char d;
	char ch;
	char[] charstring,msgarray;
	
	char[] combarr={' ',' '};
	
	String combmsg;
	String line,fillin1;
	String outlin;
	String fillin;
	JTextField jtf;
	JButton button;
	JLabel label;
	
	AudioClip adclip;
	ActionEvent ae;
	int tog=0,tog1=0;
	int fr=0,fr1=0,fr2=0,fr3=0;
	AudioInputStream appendfil,appendedFiles,clip1;
	File fil=new File("C:\\Users\\anila\\Downloads\\thiru\\bin\\wavefiles\\append.wav");
	File file = new File("C:\\Users\\anila\\Desktop\\project\\thiru\\src\\index.txt");
	 File filsad=new File("C:\\Users\\anila\\Desktop\\project\\thiru\\sadappend.wav");
	 File filangry=new File("C:\\Users\\anila\\Desktop\\project\\thiru\\angryappend.wav");
	 File filhappy = new File("C:\\Users\\anila\\Desktop\\project\\thiru\\happyappend.wav");
	BufferedReader br;
	BufferedWriter bw1=null;
	BufferedWriter bw2=null;
	////////////////////////////////////////////////////////
JButton speak;
JRadioButton sad,nutral,angry,happy;
private JTextField jTextField1;
private JTextArea jta;
ButtonGroup vg = new ButtonGroup();
ButtonGroup sg=new ButtonGroup();
ButtonGroup cg=new ButtonGroup();
private JButton jButton1; 
private JButton jButton2; 
private JButton jButton3; 
private JButton jButton4;
private JButton jButton5;
private JButton jButton6;
private JButton jButton7;
private JButton jButton8;
private JButton jButton9;
private JButton jButton10;
private JButton jButton11;
private JButton jButton12;
private JButton jButton13;
private JButton jButton14;
private JButton jButton15;
private JButton jButton16;
private JButton jButton17;
private JButton jButton18;
private JButton jButton19;
private JButton jButton20;
private JButton jButton21;
private JButton jButton22;
private JButton jButton23;
private JButton jButton24;
private JButton jButton25;
private JButton jButton26;
private JButton jButton27;
private JButton jButton28;
private JButton jButton29;
private JButton jButton30;
private JButton jButton31;
private JButton jButton32;
private JButton jButton33;
private JButton jButton34;
private JButton jButton35;
private JButton jButton36;
private JButton jButton37;
private JButton jButton38;
private JButton jButton39;
private JButton jButton40;
private JButton jButton41;
private JButton jButton42;
private JButton jButton43;
private JButton jButton44;
private JButton jButton45;
private JButton jButton46;
private JButton jButton47;
private JButton jButton48;
private JButton jButton49;
private JButton jButton50;
private JButton jButton51;
private JButton jButton52;
private JButton jButton53;
private JButton jButton54;
private JButton jButton55;
private JButton jButton56;
private JButton jButton57;
private JButton jButton58;
private JButton jButton59;
private JButton jButton60;
private JButton jButton61;
private JButton jButton62;
private JButton jButton63;
private JButton jButton64;




	 public thiru1() {
		 
		 JFrame jf=new JFrame();
		    jf.setSize(700, 800);
		   Container content= jf.getContentPane();
	        setLayout(new BorderLayout());
	        EmptyBorder eb = new EmptyBorder(20,20,20,20);
	        SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
	    
	        BevelBorder bb = new BevelBorder(BevelBorder.LOWERED);
	        CompoundBorder cb = new CompoundBorder(eb,bb);
	      
	        setBorder(new EmptyBorder(20,20,20,20));

	        JPanel p1 = new JPanel();
	        p1.setPreferredSize(new Dimension(10,100));
	       p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
	      //  p1.add(formatControls);

	        JPanel p2 = new JPanel();
	        p2.setBorder(sbb);
	        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
	        JLabel label = new JLabel(new ImageIcon("C:\\Users\\anila\\Desktop\\project\\thiru\\src\\image.jpg"));
	      label.setHorizontalAlignment(JLabel.CENTER);
	        
	        p2.add(label);
	    //*******swarapanel**********
	       JPanel sp = new JPanel();
	       sp.setLayout(new GridLayout(6,6));
	       /* swaraPanel.setBorder(new EmptyBorder(10,0,5,0));
	       jbutton1 = addButton("Play", buttonsPanel, false);
	        JButton captB = addButton("D", swaraPanel, true);
	        JButton pausB = addButton("Pause", buttonsPanel, false);
	        JButton loadB = addButton("Load...", swaraPanel, true);
	        p2.add(swaraPanel);*/
	       sp.setPreferredSize(new Dimension(30,150));
	      sp.setBackground(Color.DARK_GRAY); 
	    
	    //  title1.setFont(new Font("AkrutiMalAbhilasha",Font.LAYOUT_LEFT_TO_RIGHT,15));
	      sp.setBorder(BorderFactory.createTitledBorder("vyanjana"));
	      sp.setFont(new Font("AkrutiMalAbhilasha",Font.LAYOUT_LEFT_TO_RIGHT,15));
	      p2.add(sp);
	      jButton17 = new JButton("k");
	      jButton17.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton17.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton18= new JButton("K"); 
	 		jButton18.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton18.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton19 = new JButton("i"); 
	 		jButton19.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton19.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton20= new JButton("I"); 
	 		jButton20.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton20.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton21 = new JButton("*"); 
	 		jButton21.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton21.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton22 = new JButton("V"); 
	 		jButton22.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton22.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton23 = new JButton("W"); 
	 		jButton23.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton23.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton24 = new JButton("P"); 
	 		jButton24.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton24.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton25 = new JButton("p"); 
	 		jButton25.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton25.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton26 = new JButton("_"); 
	 		jButton26.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton26.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton27 = new JButton("B"); 
	 		jButton27.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton27.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton28 = new JButton(" \" "); 
	 		jButton28.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton28.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton29 = new JButton("["); 
	 		jButton29.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton29.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton30 = new JButton("{");
	 		jButton30.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton30.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton31 = new JButton("C");
	 		jButton31.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton31.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton32 = new JButton("l");
	 		jButton32.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton32.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton33 = new JButton("L");
	 		jButton33.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton33.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton34 = new JButton("o");
	 		jButton34.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton34.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton35 = new JButton("O");
	 		jButton35.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton35.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton36 = new JButton("v");
	 		jButton36.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton36.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton37 = new JButton("h");
	 		jButton37.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton37.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton38 = new JButton("H");
	 		jButton38.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton38.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton39 = new JButton("y");
	 		jButton39.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton39.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton40 = new JButton("Y"); 
	 		jButton40.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton40.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton41 = new JButton("c"); 
	 		jButton41.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton41.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton42 = new JButton("Q"); 
	 		jButton42.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton42.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton43= new JButton("j"); 
	 		jButton43.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton43.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton44= new JButton("u"); 
	 		jButton44.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton44.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton45 = new JButton("J"); 
	 		jButton45.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton45.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton46 = new JButton("M"); 
	 		jButton46.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton46.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton47= new JButton("m"); 
	 		jButton47.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton47.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton48= new JButton("M"); 
	 		jButton48.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton48.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton49= new JButton("T"); 
	 		jButton49.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton49.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton50= new JButton("n"); 
	 		jButton50.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton50.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton51= new JButton("U");
	 		jButton51.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton51.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton52= new JButton("}"); 
	 		jButton52.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton52.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton53= new JButton("N");
	 		jButton53.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton53.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		

	 		sp.add(jButton17);
	 		sp.add(jButton18);
	 		sp.add(jButton19);
	 		sp.add(jButton20);
	 		sp.add(jButton21);
	 		sp.add(jButton22);
	 		sp.add(jButton23);
	 		sp.add(jButton24);
	 		sp.add(jButton25);
	 		sp.add(jButton26);
	 		sp.add(jButton27);
	 		sp.add(jButton28);
	 		sp.add(jButton29);
	 		sp.add(jButton30);
	 		sp.add(jButton31);
	 		sp.add(jButton32);
	 		sp.add(jButton33);
	 		sp.add(jButton34);
	 		sp.add(jButton35);
	 		sp.add(jButton36);
	 		sp.add(jButton37);
	 		sp.add(jButton38);
	 		sp.add(jButton39);
	 		sp.add(jButton40);
	 		sp.add(jButton41);
	 		sp.add(jButton42);
	 		sp.add(jButton43);
	 		sp.add(jButton44);
	 		sp.add(jButton45);
	 		sp.add(jButton46);
	 		sp.add(jButton47);
	 		sp.add(jButton48);
	 		sp.add(jButton49);
	 		sp.add(jButton50);
	 		sp.add(jButton51);
	 		sp.add(jButton52);
	 		sp.add(jButton53);
	 	    
	 	     
	      
	        //*********vyanjana panel******************//
	        JPanel vp= new JPanel();
	        vp.setPreferredSize(new Dimension(160,30));
	        vp.setLayout(new GridLayout(6,3));  
	        vp.setBackground(Color.darkGray);
	        vp.setBorder(BorderFactory.createTitledBorder("swara"));  
	        //
	        jButton1 = new JButton("D"); 
	       // addboundary(jButton1, 33,226,23,23);
	 		jButton1.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton1.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton2 = new JButton("E");
	 		//addboundary(jButton2, 33,226,23,23);
	 		jButton2.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton2.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton3 = new JButton("F"); 
	 		jButton3.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton3.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton4 = new JButton("Fq");
	 		jButton4.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton4.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton5 = new JButton("G");
	 		jButton5.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton5.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton6 = new JButton("Gq"); 
	 		jButton6.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton6.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton7 = new JButton("+"); 
	 		jButton7.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton7.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton8 = new JButton("X"); 
	 		jButton8.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton8.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton9 = new JButton("S"); 
	 		jButton9.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton9.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton10 = new JButton("xX"); 
	 		jButton10.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton10.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton11 = new JButton("Z"); 
	 		jButton11.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton11.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton12= new JButton("Ze"); 
	 		jButton12.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton12.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton13 = new JButton("Zq"); 
	 		jButton13.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton13.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton14= new JButton("f");
	 		jButton14.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton14.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton15 = new JButton("g"); 
	 		jButton15.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton15.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton16= new JButton("A");
	 		jButton16.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton16.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton70= new JButton("e");
	 		jButton70.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton70.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton71= new JButton("R");
	 		jButton71.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton71.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 
	 		vp.add(jButton1);
	 		//vg.add(jButton1);
	 		vp.add(jButton2);
	 		//vg.add(jButton3);
	 		vp.add(jButton3);
	 		vp.add(jButton4);
	 		//vg.add(jButton3);
	 		vp.add(jButton5);
	 		vp.add(jButton6);
	 		vp.add(jButton7);
	 		vp.add(jButton8);
	 		vp.add(jButton9);
	 		vp.add(jButton10);
	 		vp.add(jButton11);
	 		vp.add(jButton12);
	 		vp.add(jButton13);
	 		
	        p1.add(vp);
	        JPanel chinpanel=new JPanel();
	        chinpanel.setLayout(new GridLayout(6,3));  
	        chinpanel.setBackground(Color.darkGray);
	        chinpanel.setBorder(BorderFactory.createTitledBorder("chinham")); 
	        
	        JButton jB1= new JButton("x");
	 		jB1.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB1.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 

	        JButton jB2= new JButton("s");
	 		jB2.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB2.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jB3= new JButton("xx");
	 		jB3.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB3.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jB4= new JButton("e");
	 		jB4.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB4.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		});
	 		JButton jB5= new JButton("t");
	 		jB5.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB5.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jB6= new JButton("d");
	 		jB6.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB6.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jB7= new JButton("r");
	 		jB7.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jB7.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		chinpanel.add(jB1);
	 		chinpanel.add(jB2);
	 		chinpanel.add(jB3);
	 		chinpanel.add(jB4);
	 		chinpanel.add(jB5);
	 		chinpanel.add(jB6);
	 		chinpanel.add(jB7);
	 		chinpanel.add(jButton14);
	 		chinpanel.add(jButton15);
	 		chinpanel.add(jButton16);
	 	    chinpanel.add(jButton70);
	 	    chinpanel.add(jButton71);
	 		
	 		p1.add(chinpanel);
	        setVisible(true);
           
         
	       //JPanel samplingPanel = new JPanel(new BorderLayout());
	      JPanel samplingPanel = new JPanel();
	       samplingPanel.setLayout(new BoxLayout(samplingPanel, BoxLayout.X_AXIS));
	        eb = new EmptyBorder(5,50,300,-50);
	        samplingPanel.setBorder(new CompoundBorder(eb, sbb));
	      //  samplingPanel.setBackground(Color.DARK_GRAY);
	        JPanel chilpanel=new JPanel();
	       // eb=new EmptyBorder(100,10,0,30);
	      //  chilpanel.setBorder(new CompoundBorder(eb,sbb));
	        /////////////////////////////////////////////// chill panel
	        
	 
	 		jButton54 = new JButton("Ê");
	 		jButton54.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton54.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		jButton55 = new JButton("Â");
	 		jButton55.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton55.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton56 = new JButton("¿"); 
	 		jButton56.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton56.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton57 = new JButton("Û"); 
	 		jButton57.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton57.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton58 = new JButton("Ã"); 
	 		jButton58.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton58.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton59 = new JButton("Ó"); 
	 		jButton59.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton59.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton60 = new JButton("Î"); 
	 		jButton60.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton60.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton61 = new JButton("Å"); 
	 		jButton61.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton61.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton62= new JButton("Ï"); 
	 		jButton62.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton62.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 		jButton63 = new JButton("À"); 
	 		jButton63.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton63.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 

	 	 jButton64= new JButton("Ø");
	 		jButton64.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton64.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton65= new JButton("á");
	 		jButton65.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton65.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		

	 		JButton jButton66= new JButton("#");
	 		jButton66.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton66.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jButton67= new JButton("Í");
	 		jButton67.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton67.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton68= new JButton("c");
	 		jButton68.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton68.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton69= new JButton("Ü");
	 		jButton69.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton69.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jButton72= new JButton("«");
	 		jButton72.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton72.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton73= new JButton("Ù");
	 		jButton73.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton73.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jButton74= new JButton("ÿ");
	 		jButton74.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton74.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton75= new JButton("Þ");
	 		jButton75.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton75.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 			
	 		JButton jButton76= new JButton("ô");
	 		jButton76.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton76.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jButton77= new JButton("¬");
	 		jButton77.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton77.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton78= new JButton("Ú");
	 		jButton78.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton78.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton79= new JButton("º");
	 		jButton79.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton79.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton80= new JButton("²");
	 		jButton80.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton80.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 

	 		JButton jButton81= new JButton("#");
	 		jButton81.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton81.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		JButton jButton82= new JButton("#");
	 		jButton82.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton82.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 		
	 		JButton jButton83= new JButton("#");
	 		jButton83.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	 		jButton83.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 				jButton1_actionPerformed(e); 
	 			} 
	  
	 		}); 
	 
	 
	 		
	 				
	 		
	        chilpanel.setPreferredSize(new Dimension(300,0));
	        chilpanel.setLayout(new GridLayout(6,6));  
	        chilpanel.setBackground(Color.darkGray);
	        chilpanel.setBorder(BorderFactory.createTitledBorder(""));  
	        
	        chilpanel.add(jButton54);
	 		//vg.add(jButton3);
	 		chilpanel.add(jButton55);
	 		chilpanel.add(jButton56);
	 		chilpanel.add(jButton57);
	 		chilpanel.add(jButton58);
	 		chilpanel.add(jButton59);
	 		chilpanel.add(jButton60);
	 		chilpanel.add(jButton61);
	 		chilpanel.add(jButton62);
	 		chilpanel.add(jButton63);
	 		chilpanel.add(jButton64);
	 		chilpanel.add(jButton65);
	 		chilpanel.add(jButton66);
	 		chilpanel.add(jButton67);
	 		chilpanel.add(jButton68);
	 		chilpanel.add(jButton69);
	 		chilpanel.add(jButton72);
	 		chilpanel.add(jButton73);
	 		chilpanel.add(jButton74);
	 		chilpanel.add(jButton75);
	 		chilpanel.add(jButton76);
	 		chilpanel.add(jButton77);
	 		chilpanel.add(jButton78);
	 		chilpanel.add(jButton79);
	 		chilpanel.add(jButton80);
	 		chilpanel.add(jButton81);
	 		chilpanel.add(jButton82);
	 		chilpanel.add(jButton83);
	        
	        /////////////////////////////////////////////////////
	        samplingPanel.add(chilpanel);
	        
	       
	       
	        jta=new JTextArea(100,150);
	        jta.setFont(new Font("AkrutiMalAbhilasha", Font.CENTER_BASELINE,15));
	       samplingPanel.add(jta);
	        setVisible(true);
	    
	      
// *****************************************The speaking part*********************************************
	      
	         speak=new JButton("hNQg");
	         
	      speak.setFont(new Font("AkrutiMalAbhilasha", Font.CENTER_BASELINE,15));
	      
	      samplingPanel.add(speak);
	      speak.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent e) 
	 			{ 
	 			System.out.println("hhhhhhhhhhhhhhh");
	 			String msg=jta.getText();
			       System.out.println(msg);
	 //************************************************************************************************				
	 			/*	JFrame f=new JFrame();
	 				f.setSize(250, 250);
	 				System.out.println(" inside speek");
	 				
	 				
	 				    String st=jta.getText();
	 			       System.out.println(st);
	 				 speek j= new speek();*/
	 			      // thirunew j=new thirunew(st);
	 				  //     f.getContentPane().add(j);
	 				  //     f.setVisible(true);
	 			     //  thirunew thir1=new thirunew(st);
	 			      // thir1.adclip.play()
	 				 
	 				
	 				
	 				 //sp1=new speek("hi"); 
	 				//sp.init();
	 //***************************************************************************************	
			       BufferedWriter bw=null;
			       
			 		try
			 		{
			 		n=msg.length();
			 	    bw=new BufferedWriter(new FileWriter("outlin.txt",false));
			 	   bw1=new BufferedWriter(new FileWriter("emotion.txt",false));
			 	  bw2=new BufferedWriter(new FileWriter("hapangry.txt",false));
			 		System.out.println("length"+n);
			 		msgarray=msg.toCharArray();
			 		
			 			for(int i=0;i<n-1;i++)
			 			{
			 				char[] outarray={' ',' ',' ',' ',' ',' ',' ',' ',' '};
			 				FileInputStream fis = new FileInputStream(file);
			 				BufferedInputStream bis = new BufferedInputStream(fis);
			 				DataInputStream dis = new DataInputStream(bis);
			 				BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			 	           if(msg.charAt(i)==' ')
			 	           {
			 	        	   i++;
			 	           }
			 				d=msg.charAt(i);
			 				if(i!=n)
			 				{
			 				ch=msg.charAt(i+1);
						}
			 				line=br.readLine();
			 				System.out.println("first line"+line);
			     
			 		if(ch=='f'||ch=='g'||ch=='d'||ch=='X'||ch=='A'||ch=='R'||ch=='r'||ch=='e'||ch=='b')
			 		{
			 			line=br.readLine();
			 		
					System.out.println("inside else:"+d+ch);
					i=i+1;
					System.out.println("ch"+line.charAt(i));
					while((line=br.readLine())!=null&&ch!=line.charAt(1))
						
						
					{
						System.out.println(line);
						System.out.println(d);
					
						
					}//end of while loop 
					
					
				    while(d!=line.charAt(0))
				    {
				    	line=br.readLine();
				    }
					System.out.println("end  char="+d+ch+","+i+line);
				    c=line.length();
					charstring= line.toCharArray();
					
					 if (ch=='e')
					 {
					 for(int j=0;j<c;j++)
					    {
					   	 
					   	 if (charstring[j]==',')
					   	 {
					   	
					   		 j++;
					   		 for(int m=0;m<c-2;m++)
					   		 {
					   			 
					   			 outarray[m]=charstring[j];
					   			 j++;
					   			
					   		 }
					   	   }
					    }
					 }//end if ch==e
					 else
					 {
						 for(int j=0;j<c;j++)
						    {
						   	 
						   	 if (charstring[j]==',')
						   	 {
						   	
						   		 j++;
						   		 for(int m=0;m<c-3;m++)
						   		 {
						   			 
						   			 outarray[m]=charstring[j];
						   			 j++;
						   			
						   		 }
						   	   }
						    } 
					 }// end elseif ch==e
					String sillin=new String("sil.wav");
					outlin=new String(outarray);
					System.out.println("outlin=="+outlin);
					
					bw.write(outlin);
					bw1.write(outlin);
					bw2.write(outlin);
					bw.newLine();
					bw2.newLine();
					bw1.newLine();
					bw1.write(sillin);
					bw.flush();
					bw1.newLine();
					bw2.flush();
					bw1.flush();
					/**/
			   		System.out.println("the play");	
				    }//end of if
			 		else
			 		{
			 			
						while((line=br.readLine())!=null&& d!=line.charAt(0))
						{
							System.out.println(line);
							System.out.println(d);
						
							
						}//end of while loop 
						System.out.println("end  char="+d+i+line);
					    c=line.length();
						charstring= line.toCharArray();
						
						 for(int j=0;j<c;j++)
						    {
						   	 
						   	 if (charstring[j]==',')
						   	 {
						   	
						   		 j++;
						   		 
						   		 for(int m=0;m<c-2;m++)
						   		 {
						   			 if(charstring[j]!=' ')
						   			 {
						   			 outarray[m]=charstring[j++];
						   			System.out.print(outarray[m]);
						   			 }
						   							   			
						   		 }
						   		 
						   	 }
						   	 
						    }
						
						System.out.println("\n");
						outlin=new String(outarray);
						System.out.println("outlin=="+outlin);
						bw.write(outlin);
						bw1.write(outlin);
						bw2.write(outlin);
						bw.newLine();
						bw1.newLine();
						bw2.newLine();
						bw1.write("sil.wav");
						bw1.newLine();
						bw.flush();
						bw1.flush();
						bw2.flush();
						
						System.out.println("the play");
				   		
									
								}
							}//end of for
						
							FileInputStream fis = new FileInputStream("C:\\Users\\anila\\Desktop\\project\\thiru\\outlin.txt");
							BufferedInputStream bis = new BufferedInputStream(fis);
							DataInputStream dis = new DataInputStream(bis);
							br = new BufferedReader(new InputStreamReader(dis));
						//while((fillin=br.readLine())!=null)
							
						//	{
						
					   //	for (int i=0;i<n;i++){	
								
								//adclip = getAudioClip(getCodeBase(),"wavefiles\\"+fillin);
								System.out.println("hiiiiiiiiiiii");
								//adclip.play();
								
							//	File file=new File("C:\\Users\\anila\\Downloads\\thiru\\bin\\wavefiles\\"+fillin);
								
								
							
//////////////////////////*****************************************************************/////////////////////////////////
							
							
									try
									{
										for(int i=0;i<20;i++)
										{
										if(tog==0)
										{
										
									fillin=br.readLine();
									tog=1;
										}
										else
										{
											fillin="append.wav";
										}
										System.out.println(fillin);
									 String wavFile1 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\longwav\\"+fillin; 
									 System.out.println("this is wavefile1"+wavFile1);
									 String fillin2=br.readLine();
							           String wavFile2 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\longwav\\"+fillin2; 
							           System.out.println("this is wavefile2"+wavFile2);
							           if(fr==0)
							           {
							               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
							              
							               fr=1;
							           }
							           else
							           {
							        	   System.out.println("insideaudio else");
							        	clip1=appendedFiles;   
							           }
							                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
							                 
							                appendedFiles =  
							                            new AudioInputStream( 
							                                new SequenceInputStream(clip1, clip2),      
							                                clip1.getFormat(),  
							                                clip1.getFrameLength() + clip2.getFrameLength()); 
							                    
							                 
							                    
										}      
							            
									 } catch (Exception ev2) { 
							              ev2.printStackTrace();   
									 }
									 
							/*
								
									
								try
								{
									for(int i=0;i<20;i++)
									{
									if(tog==0)
									{
								fillin=br.readLine();
								tog=1;
									}
									else
									{
										fillin="append.wav";
									}
									System.out.println(fillin);
								 String wavFile1 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\wavefiles\\"+fillin; 
								 System.out.println("this is wavefile1"+wavFile1);
								 String fillin2=br.readLine();
				                String wavFile2 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\wavefiles\\"+fillin2; 
						           System.out.println("this is wavefile2"+wavFile2);
						           if(fr==0)
						           {
						               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
						               clip1.skip(WHEN_FOCUSED);
						               
						               fr=1;
						           }
						           else
						           {
						        	   System.out.println("insideaudio else");
						        	clip1=appendedFiles;   
						           }
						                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
						                   clip2.skip(WHEN_FOCUSED);
						                appendedFiles =  
						                            new AudioInputStream( 
						                                new SequenceInputStream(clip1, clip2),      
						                                clip1.getFormat(),  
						                                clip1.getFrameLength() + clip2.getFrameLength()); 
						                    
						                 
						                    
									}     
								Thread.sleep(4000);
						            
								 } catch (Exception ev2) { 
						              ev2.printStackTrace();   
								 }*/
							
		///////////////////////////*************************************************************//////////////////////////////////////
						           
						   		//Thread.sleep(4000);
							//}
						
						            AudioSystem.write(appendedFiles,  
				                            AudioFileFormat.Type.WAVE,fil  
				                            );
						            
						Process p;
						p= Runtime.getRuntime().exec("rundll32.exe url.dll,FileProtocolHandler  " + fil.getAbsolutePath());
						 p.waitFor();
							
						
			       
			 		 } catch (Exception ev) { 
			              ev.printStackTrace();   
			       
			 		 }
			 	
///////////////////////////////////////////////////////////////////////////////////////////////////////////			       
	 			}// end of actionperformed of speak button
	 		}); // end of actionlistener
	      JButton sam=new JButton();
	     samplingPanel.add(sam);
	      sam.addActionListener(new ActionListener() { 
	 			public void actionPerformed(ActionEvent ae) 
	 			{
	 				thiru ne=new thiru();
	 			}
	      });
	      JPanel drawingArea = new JPanel();
	        drawingArea.setLayout(new BoxLayout(drawingArea,BoxLayout.Y_AXIS));
	       EmptyBorder eb1 = new EmptyBorder(0,5,30,100);
	        drawingArea.setBorder(new CompoundBorder(eb1, sbb));
	        
	        //drawingArea.setBackground(Color.lightGray);
	       
	           //drawingArea.setPreferredSize(new Dimension(150,100));
	           /* drawingArea.setBorder
	                     (BorderFactory.createLineBorder (Color.blue, 3));
	            drawingArea.setBackground(Color.white);*/
	            //content.add(drawingArea, BorderLayout.WEST);
	           // pack();
	     /*   nutral=new JRadioButton("");
		      nutral.setFont(new Font("AkrutiMalAbhilasha", Font.BOLD,20));
		     nutral.setMnemonic(KeyEvent.VK_N);
		      drawingArea.add(nutral);*/
		      
		      sad=new JRadioButton("ogKb");
              sad.setMnemonic(KeyEvent.VK_S);
		      sad.setFont(new Font("AkrutiMalAbhilasha", Font.BOLD,20));
		      vg.add(sad);
		      drawingArea.add(sad);
		      ////////Actionperformed of sad
		      sad.addActionListener(new ActionListener() { 
		 			public void actionPerformed(ActionEvent e) 
		 			{
                      try
                      {
                        
						
							FileInputStream fis1 = new FileInputStream("C:\\Users\\anila\\Desktop\\project\\thiru\\emotion.txt");
							BufferedInputStream bis1 = new BufferedInputStream(fis1);
							DataInputStream dis1 = new DataInputStream(bis1);
						BufferedReader br1 = new BufferedReader(new InputStreamReader(dis1));
						tog1=0;
						try
						{
							for(int i=0;i<10;i++)
							{
							if(tog1==0)
							{
						fillin1=br1.readLine();
						tog1=1;
							}
							else
							{
								fillin1="append.wav";
							}
							System.out.println(fillin1);
						 String wavFile1 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\sadwav\\"+fillin1; 
						 System.out.println("this is wavefile1"+wavFile1);
						 String fillin2=br1.readLine();
				           String wavFile2 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\sadwav\\"+fillin2; 
				           System.out.println("this is wavefile2"+wavFile2);
				           ///////////////////////////////////////////////////////////////////////////////////
				       /*   double	fAmplitude = 2.0;
				           if(fr1==0)
				           {
				              AudioInputStream clipp = AudioSystem.getAudioInputStream(new File(wavFile1));
				               AudioFileFormat aff = AudioSystem.getAudioFileFormat(new File(wavFile1));
				       		AudioFileFormat.Type	targetType = aff.getType();

				       	AmplitudeAudioInputStream amplifiedAudioInputStream =
				       		new AmplitudeAudioInputStream(clipp);
				       	amplifiedAudioInputStream.setAmplitudeLog((float)fAmplitude);

				               fr1=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	clip1=appendedFiles;   
				           }*/
				           ///////////////////////////////////////////////////////////////////////////////////
				           /////////////////////////////////////////////////////////////////////////////////
				           if(fr1==0)
				           {
				               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
				            AudioFormat audioFormat = clip1.getFormat();
				               DataLine.Info info = new DataLine.Info( SourceDataLine.class, audioFormat );
				               SourceDataLine dataLine = (SourceDataLine) AudioSystem.getLine( info );
				               // System.out.println( "SourceDataLine class=" + dataLine.getClass() );
				       
				               // The line acquires system resources (throws LineAvailableException).
				               dataLine.open( audioFormat );
				         
				               // Adjust the volume on the output line.
				               if( dataLine.isControlSupported( FloatControl.Type.MASTER_GAIN ) ) {
				                  FloatControl volume = (FloatControl) dataLine.getControl( FloatControl.Type.MASTER_GAIN );
				                  volume.setValue(-80.0F);
				               }
				               fr1=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	clip1=appendedFiles;   
				        	System.out.println("hiii this is clip1"+clip1);
				           }
				                  
				                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
				                   
				                appendedFiles =  
				                            new AudioInputStream( 
				                                new SequenceInputStream(clip1, clip2),      
				                                clip1.getFormat(),  
				                                clip1.getFrameLength() + clip2.getFrameLength()); 
				                    
				                 
				                    
							}
							
							
						}catch(Exception e1)
						{
							System.out.println(e1);
						}
				           System.out.println("hiiiiiiiiiiii  ***************filsad");
				            AudioSystem.write(appendedFiles,AudioFileFormat.Type.WAVE,filsad);
				            
				Process p1;
				p1= Runtime.getRuntime().exec("rundll32.exe url.dll,FileProtocolHandler  " + filsad.getAbsolutePath());
				 p1.waitFor();
					
						
	 		
		 				System.out.println("sad");
} catch (Exception ev1) { 
   System.out.println(ev1);   
}
		 			}
		 			});
		      
		      
		      
		     
		      angry=new JRadioButton("skehb");
		      angry.setMnemonic(KeyEvent.VK_A);
		      angry.setFont(new Font("AkrutiMalAbhilasha", Font.BOLD,20));
		      vg.add(angry);
		     drawingArea.add(angry);
		     
		     ////////Actionperformed of angry
		      angry.addActionListener(new ActionListener() { 
		 			public void actionPerformed(ActionEvent e) 
		 			{
                      try
                      {
                        
						
							FileInputStream fis1 = new FileInputStream("C:\\Users\\anila\\Desktop\\project\\thiru\\hapangry.txt");
							BufferedInputStream bis1 = new BufferedInputStream(fis1);
							DataInputStream dis1 = new DataInputStream(bis1);
						BufferedReader br1 = new BufferedReader(new InputStreamReader(dis1));
						tog1=0;
						try
						{
							for(int i=0;i<20;i++)
							{
							if(tog1==0)
							{
						fillin1=br1.readLine();
						tog1=1;
							}
							else
							{
								fillin1="append.wav";
							}
							System.out.println(fillin1);
						 String wavFile1 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\angrywav\\"+fillin1; 
						 System.out.println("this is wavefile1"+wavFile1);
						 String fillin2=br1.readLine();
				           String wavFile2 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\angrywav\\"+fillin2; 
				           System.out.println("this is wavefile2"+wavFile2);
				           ///////////////////////////////////////////////////////////////////////////////////
				       
				        
				           /////////////////////////////////////////////////////////////////////////////////
				           if(fr2==0)
				           {
				               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
				            AudioFormat audioFormat = clip1.getFormat();
				               DataLine.Info info = new DataLine.Info( SourceDataLine.class, audioFormat );
				               SourceDataLine dataLine = (SourceDataLine) AudioSystem.getLine( info );
				               // System.out.println( "SourceDataLine class=" + dataLine.getClass() );
				       
				               // The line acquires system resources (throws LineAvailableException).
				               dataLine.open( audioFormat );
				         
				               // Adjust the volume on the output line.
				               if( dataLine.isControlSupported( FloatControl.Type.MASTER_GAIN ) ) {
				                  FloatControl volume = (FloatControl) dataLine.getControl( FloatControl.Type.MASTER_GAIN );
				                  volume.setValue(6.0F);
				               }
				               fr2=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	clip1=appendedFiles;   
				        	System.out.println("hiii this is clip1"+clip1);
				           }
				                  
				                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
				                   
				                appendedFiles =  
				                            new AudioInputStream( 
				                                new SequenceInputStream(clip1, clip2),      
				                                clip1.getFormat(),  
				                                clip1.getFrameLength() + clip2.getFrameLength()); 
				                    
				                 
				                    
							}
							
							
						}catch(Exception e1)
						{
							System.out.println(e1);
						}
				           System.out.println("hiiiiiiiiiiii  ***************filsad");
				            AudioSystem.write(appendedFiles,AudioFileFormat.Type.WAVE,filangry);
				            
				Process p1;
				p1= Runtime.getRuntime().exec("rundll32.exe url.dll,FileProtocolHandler  " + filangry.getAbsolutePath());
				 p1.waitFor();
					
						
	 		
		 				System.out.println("angry");
} catch (Exception ev1) { 
   System.out.println(ev1);   
}
		 			}
		 			});
		      

		     
		    
		     
		     
		     happy=new JRadioButton("ms×eTb");
		     happy.setMnemonic(KeyEvent.VK_H);
		      happy.setFont(new Font("AkrutiMalAbhilasha", Font.BOLD,20));
		      vg.add(happy);
		      drawingArea.add(happy	);
		      
		      ////////Actionperformed of happy
		      happy.addActionListener(new ActionListener() { 
		 			public void actionPerformed(ActionEvent e) 
		 			{
                    try
                    {
                      
						
							FileInputStream fis1 = new FileInputStream("C:\\Users\\anila\\Desktop\\project\\thiru\\hapangry.txt");
							BufferedInputStream bis1 = new BufferedInputStream(fis1);
							DataInputStream dis1 = new DataInputStream(bis1);
						BufferedReader br1 = new BufferedReader(new InputStreamReader(dis1));
						tog1=0;
						try
						{
							for(int i=0;i<10;i++)
							{
							if(tog1==0)
							{
						fillin1=br1.readLine();
						tog1=1;
							}
							else
							{
								fillin1="append.wav";
							}
							System.out.println(fillin1);
						 String wavFile1 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\happywav\\"+fillin1; 
						 System.out.println("this is wavefile1"+wavFile1);
						 String fillin2=br1.readLine();
				           String wavFile2 = "C:\\Users\\anila\\Desktop\\project\\thiru\\bin\\happywav\\"+fillin2; 
				           System.out.println("this is wavefile2"+wavFile2);
				           ///////////////////////////////////////////////////////////////////////////////////
				        /*   double	fAmplitude = 2.0;
				           if(fr1==0)
				           {
				              AudioInputStream clipp = AudioSystem.getAudioInputStream(new File(wavFile1));
				               AudioFileFormat aff = AudioSystem.getAudioFileFormat(new File(wavFile1));
				       		AudioFileFormat.Type	targetType = aff.getType();

				       	AmplitudeAudioInputStream amplifiedAudioInputStream =
				       		new AmplitudeAudioInputStream(clip);
				       	amplifiedAudioInputStream.setAmplitudeLog((float)fAmplitude);

				               fr1=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	clip1=appendedFiles;   
				           }"*/
				           ///////////////////////////////////////////////////////////////////////////////////
				           /////////////////////////////////////////////////////////////////////////////////
				           if(fr3==0)
				           {
				               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
				            AudioFormat audioFormat = clip1.getFormat();
				               DataLine.Info info = new DataLine.Info( SourceDataLine.class, audioFormat );
				               SourceDataLine dataLine = (SourceDataLine) AudioSystem.getLine( info );
				               // System.out.println( "SourceDataLine class=" + dataLine.getClass() );
				       
				               // The line acquires system resources (throws LineAvailableException).
				               dataLine.open( audioFormat );
				         
				               // Adjust the volume on the output line.
				               if( dataLine.isControlSupported( FloatControl.Type.MASTER_GAIN ) ) {
				                  FloatControl volume = (FloatControl) dataLine.getControl( FloatControl.Type.MASTER_GAIN );
				                  volume.setValue(0.1F);
				               }
				               fr3=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	clip1=appendedFiles;   
				        	System.out.println("hiii this is clip1"+clip1);
				           }
				                  
				                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
				                   
				                appendedFiles =  
				                            new AudioInputStream( 
				                                new SequenceInputStream(clip1, clip2),      
				                                clip1.getFormat(),  
				                                clip1.getFrameLength() + clip2.getFrameLength()); 
				                    
				                 
				                    
							}
							
							
						}catch(Exception e1)
						{
							System.out.println(e1);
						}
				           System.out.println("hiiiiiiiiiiii  ***************filsad");
				            AudioSystem.write(appendedFiles,AudioFileFormat.Type.WAVE,filhappy);
				            
				Process p1;
				p1= Runtime.getRuntime().exec("rundll32.exe url.dll,FileProtocolHandler  " + filhappy.getAbsolutePath());
				 p1.waitFor();
					
						
	 		
		 				System.out.println("happy");
} catch (Exception ev1) { 
 System.out.println(ev1);   
}
		 			}
		 			});
		      

		     samplingPanel.add(drawingArea);
		      
       		  p2.add(samplingPanel);
		      setVisible(true);
	          // default center section
	          p1.add(p2);
	          add(p1);     
	      content.add(p1);
	    //  content.add(p2);
	      add(content);
	      	     
      }     
	        
	 

	 public void open() { }


	    public void close() {}
	    private void addboundary(Component c,int x,int y,int width,int height) 
	 	{ 
	 		c.setBounds(x,y,width,height); 
	 		//container.add(c); 
	 	} 
	  
	    
	    private void jButton1_actionPerformed(ActionEvent e) 
	 	{ 
	 		System.out.println("\njButton1_actionPerformed(ActionEvent e) called."); 
	 		// TODO: Add any handling code here 
	        String button=e.getActionCommand();
	        jta.setFont(new Font("AkrutiMalAbhilasha", Font.LAYOUT_LEFT_TO_RIGHT,15));
	        jta.append(button);
	        
	        } 
	    public void actionPerformed(ActionEvent e) {}

		 private JButton addButton(String name, JPanel p, boolean state) {
		        JButton b = new JButton(name);
		        b.addActionListener(this);
		        b.setEnabled(state);
		        p.add(b);
		        return b;
		    }

		
		
	    class FormatControls extends JPanel {
	        
	        Vector groups = new Vector();
	        JToggleButton linrB, ulawB, alawB, rate8B, rate11B, rate16B, rate22B, rate44B;
	        JToggleButton size8B, size16B, signB, unsignB, litB, bigB, monoB,sterB;
	    
	        public FormatControls() {
	            setLayout(new GridLayout(0,1));
	          
	          
		    	        }
	    

	    }
	public static void main(String[] args) {
		try
		{
		
		// TODO Auto-generated method stub
		thiru1 thir=new thiru1();
		JFrame f = new JFrame("Hindi TTS Enhanced with Emotion");
		f.getContentPane().add("Center",thir);
		
		
		f.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int w = 1000;
        int h = 500;
        f.setLocation(screenSize.width/2 - w/2, screenSize.height/2 - h/2);
        f.setSize(w, h);
        f.show();
       f.setEnabled(true);
      }catch(Exception e)
		{
			System.out.println(e);
		}
        
       }
        
      
	}
