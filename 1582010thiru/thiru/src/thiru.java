	import javax.sound.sampled.AudioFileFormat;
	import javax.sound.sampled.AudioSystem;
	import java.io.*;
	
	import javax.sound.sampled.*;
	
	
	
	public class thiru
	{
		public static void main(String args[])
		{
			thiru thi=new thiru();
		}
		int tog=0;
		String fillin;
		int fr=0;
		File fil;
		BufferedReader br;
		AudioInputStream clip1,clip2,appendedFiles;
		
		public thiru()
		{
			System.out.println("hhhhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiihhhhhhhhhhhhhhhhhhhhiiiiiiiiiiiiiiii");
			fil=new File("C:\\Users\\rakshit\\Desktop\\Nitte_finalProject\\1582010thiru\\thiru\\append.wav");
			
			
			try
			{
				FileInputStream fis = new FileInputStream("C:\\Users\\rakshit\\Desktop\\Nitte_finalProject\\1582010thiru\\thiru\\outlin.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				DataInputStream dis = new DataInputStream(bis);
				br = new BufferedReader(new InputStreamReader(dis));
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
						 String wavFile1 = "C:\\Users\\rakshit\\Desktop\\Nitte_finalProject\\1582010thiru\\thiru\\wavefiles\\"+fillin; 
						 System.out.println("this is wavefile1"+wavFile1);
						 String fillin2=br.readLine();
						 if(fillin2==null)
						 {
							 break;
						 }
				        String wavFile2 = "C:\\Users\\rakshit\\Desktop\\Nitte_finalProject\\1582010thiru\\thiru\\wavefiles\\"+fillin2; 
				           System.out.println("this is wavefile2"+wavFile2);
				           if(fr==0)
				           {
				               clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
				             //  clip1.skip(WHEN_FOCUSED);
				               
				               fr=1;
				           }
				           else
				           {
				        	   System.out.println("insideaudio else");
				        	   clip1=appendedFiles;   
				           }
				           		
				                   AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2)); 
				                   System.out.println("here");
				                  // clip2.skip(WHEN_FOCUSED);
				                appendedFiles =  
				                            new AudioInputStream( 
				                                new SequenceInputStream(clip1, clip2),      
				                                clip1.getFormat(),  
				                                clip1.getFrameLength() + clip2.getFrameLength()); 
				                    
				                 
				                    
				}     
			Thread.sleep(4000);
	            
			 } catch (Exception ev2) { 
	              ev2.printStackTrace();   
			 }
		
	///////////////////////////*************************************************************//////////////////////////////////////
	           
	   		//Thread.sleep(4000);
		//}
	try
	{
	            AudioSystem.write(appendedFiles,  
	                    AudioFileFormat.Type.WAVE,fil  
	                    );
	            
	Process p;
	p= Runtime.getRuntime().exec("rundll32.exe url.dll,FileProtocolHandler  " + fil.getAbsolutePath());
	 p.waitFor();
		
	}catch(Exception ec)
	{
		System.out.println(ec);
	}
	
		}
	}