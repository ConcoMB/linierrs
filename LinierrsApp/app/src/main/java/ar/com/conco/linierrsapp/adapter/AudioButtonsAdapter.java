package ar.com.conco.linierrsapp.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import ar.com.conco.linierrsapp.R;
import ar.com.conco.linierrsapp.model.LinierrsAudio;

public class AudioButtonsAdapter extends BaseAdapter {

    private Context mContext;
    private List<LinierrsAudio> mAudioIdList;

    public AudioButtonsAdapter(Context context, List<LinierrsAudio> audioIdList) {
        this.mContext = context;
        this.mAudioIdList = audioIdList;
    }

    @Override
    public int getCount() {
        return mAudioIdList.size();
    }

    @Override
    public Object getItem(int position) {
        return mAudioIdList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder v;
        if (view == null || view.getTag() == null) {
            view = inflater.inflate(R.layout.adapter_audio_buttons, parent, false);
            if (view == null) return null;
            v = new ViewHolder(view);
            view.setTag(v);
        } else {
            v = (ViewHolder) view.getTag();
        }
        LinierrsAudio audio = mAudioIdList.get(position);
        populate(audio, v);
        setListeners(audio, v);
        return view;
    }

    private void populate(LinierrsAudio audio, ViewHolder v) {
        v.mTitleView.setText(audio.title);
    }

    private void setListeners(final LinierrsAudio audio, ViewHolder v) {
        v.mImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mediaPlayer = MediaPlayer.create(mContext, audio.rawAudioId);
                mediaPlayer.start();
            }
        });
    }

    private class ViewHolder {
        ImageButton mImageButton;
        TextView mTitleView;

        ViewHolder(View view) {
            mImageButton = (ImageButton) view.findViewById(R.id.adapter_audio_buttons_button);
            mTitleView = (TextView) view.findViewById(R.id.adapter_audio_buttons_title);
        }
    }
}
