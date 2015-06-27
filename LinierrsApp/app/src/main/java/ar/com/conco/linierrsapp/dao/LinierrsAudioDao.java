package ar.com.conco.linierrsapp.dao;

import java.util.ArrayList;
import java.util.List;

import ar.com.conco.linierrsapp.R;
import ar.com.conco.linierrsapp.model.LinierrsAudio;

public class LinierrsAudioDao {

    public static List<LinierrsAudio> list() {
        List<LinierrsAudio> list = new ArrayList<>();
        // todo make this better too lazy to do it now
        list.add(new LinierrsAudio(R.raw.arte, "Arte", R.drawable.ic_audio_arte));
        list.add(new LinierrsAudio(R.raw.aveces, "A veces", R.drawable.ic_audio_armo_cosas));
        list.add(new LinierrsAudio(R.raw.avion, "Avión", R.drawable.ic_audio_palitos));
        list.add(new LinierrsAudio(R.raw.bastanete, "Bastanete", R.drawable.ic_audio_crazy));
        list.add(new LinierrsAudio(R.raw.esperar, "Esperar", R.drawable.ic_audio_bondi));
        list.add(new LinierrsAudio(R.raw.gracias, "Gracias", R.drawable.ic_audio_gracias));
        list.add(new LinierrsAudio(R.raw.humor, "Humor", R.drawable.ic_audio_helarte));
        list.add(new LinierrsAudio(R.raw.juguetes, "Juguetes",
                R.drawable.ic_audio_todo_tipo_de_arte));
        list.add(new LinierrsAudio(R.raw.liniers, "Linierrs", R.drawable.ic_audio_liniers));
        list.add(new LinierrsAudio(R.raw.literatura, "Literatura", R.drawable.ic_audio_art_attack));
        return list;
    }
}
