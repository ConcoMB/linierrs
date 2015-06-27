package ar.com.conco.linierrsapp.dao;

import java.util.ArrayList;
import java.util.List;

import ar.com.conco.linierrsapp.R;
import ar.com.conco.linierrsapp.model.LinierrsAudio;

public class LinierrsAudioDao {

    public static List<LinierrsAudio> list() {
        List<LinierrsAudio> list = new ArrayList<>();
        // todo make this better too lazy to do it now
        list.add(new LinierrsAudio(R.raw.arte, "Arte"));
        list.add(new LinierrsAudio(R.raw.aveces, "A veces"));
        list.add(new LinierrsAudio(R.raw.avion, "Avión"));
        list.add(new LinierrsAudio(R.raw.bastanete, "Bastanete"));
        list.add(new LinierrsAudio(R.raw.esperar, "Esperar"));
        list.add(new LinierrsAudio(R.raw.gracias, "Gracias"));
        list.add(new LinierrsAudio(R.raw.humor, "Humor"));
        list.add(new LinierrsAudio(R.raw.juguetes, "Juguetes"));
        list.add(new LinierrsAudio(R.raw.liniers, "Linierrs"));
        list.add(new LinierrsAudio(R.raw.literatura, "Literatura"));
        return list;
    }
}
