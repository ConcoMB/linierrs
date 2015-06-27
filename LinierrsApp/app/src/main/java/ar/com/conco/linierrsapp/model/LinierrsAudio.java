package ar.com.conco.linierrsapp.model;

import java.io.Serializable;

public class LinierrsAudio implements Serializable {

    public int rawAudioId;
    public String title;

    public LinierrsAudio(int rawAudioId, String title) {
        this.rawAudioId = rawAudioId;
        this.title = title;
    }
}
