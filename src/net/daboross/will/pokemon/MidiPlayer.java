package net.daboross.will.pokemon;

import java.io.IOException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;

public class MidiPlayer {

    private Sequencer sequencer;
    private String filename;
    private boolean bgm;

    public MidiPlayer(String file, boolean b) {
        filename = file;
        bgm = b;
    }

    public void start() {
        try {
            Sequence sequence = MidiSystem.getSequence(getClass().getResource(filename));
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            if (bgm == true) {
                sequencer.setLoopCount(999);
            }
            sequencer.start();
        } catch (InvalidMidiDataException | IOException | MidiUnavailableException e) {
        }
    }

    public void stop() {
        sequencer.stop();
    }
}