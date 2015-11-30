import javax.speech.*;
import javax.speech.synthesis.*;
public class JSTest {
public static void main(String arg[]) throws Exception {
SynthesizerModeDesc desc =  new SynthesizerModeDesc();
 desc.setModeName("general");
 desc.getRunning();
// desc.setLocale(java.util.Locale.US);
 System.out.println(desc);
 Synthesizer reader = Central.createSynthesizer(desc);
 reader.allocate();
 reader.resume();
 Voice v = new Voice();
 v.setName("kevin16");
 reader.getSynthesizerProperties().setVoice(v);
 reader.getSynthesizerProperties().setPitch(150.0F);
 reader.getSynthesizerProperties().setVolume(1.0F);
 reader.getSynthesizerProperties().setSpeakingRate(160.0F);
 String s = "Hello "+System.getProperty("user.name")+"!\n"+  "I am kevin speaking at 16 kHz!\nWill you take me as your friend?"; 
 reader.speakPlainText(s, null);
 reader.waitEngineState(Synthesizer.QUEUE_EMPTY);
 System.exit(0);
 }
} 