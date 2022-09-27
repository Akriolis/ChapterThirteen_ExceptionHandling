import javax.sound.midi.*;

public class MusicTest1 {
    /*public void play(){
        try{
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException e){
            System.out.println("Bummer!");
        }
    }*/

    public static void main(String[] args) {
        /**
         * The JavaSound API
         */

        //MusicTest1 mt = new MusicTest1();
        //mt.play();

        // .printStackTrace() to get stack trace of an exception

        /**
         * one method will catch what another method throws
         * an exception is always thrown back to the caller
         * the method that throws has to declare that it might throw the exception
         */

        /**
         * Finally - for the things you want to do no matter what
         */

        // methods can throw more than one exception

        /**
         * If you don't want to handle an exception, you can duck it by declaring it
         */

        // some rules about throwing exceptions

        // you cannot have a catch or finally without try
        // you cannot put code between the try and the catch
        // a try must be followed by either a catch or a finally
        // a try with only a finally (no catch) must still declare the exception

        /*Sequencer player = MidiSystem.getSequencer();
        player.open();

        Sequence seq = new Sequence(timing, 4);

        Track t = seq.createTrack();

        t.add(myMidiEvent1);
        player.setSequence(seq);

        player.start();*/




    }
}