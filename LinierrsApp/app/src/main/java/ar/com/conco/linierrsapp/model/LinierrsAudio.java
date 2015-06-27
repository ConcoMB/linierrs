package ar.com.conco.linierrsapp.model;

import java.io.Serializable;

public class LinierrsAudio implements Serializable {

    public int rawAudioId;
    public String title;
    public int backgroundId;

    public LinierrsAudio(int rawAudioId, String title, int backgroundId) {
        this.rawAudioId = rawAudioId;
        this.title = title;
        this.backgroundId = backgroundId;
    }
}
