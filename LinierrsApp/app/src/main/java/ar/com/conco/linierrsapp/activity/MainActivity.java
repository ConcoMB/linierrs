package ar.com.conco.linierrsapp.activity;

import android.widget.GridView;

import ar.com.conco.linierrsapp.R;
import ar.com.conco.linierrsapp.adapter.AudioButtonsAdapter;
import ar.com.conco.linierrsapp.dao.LinierrsAudioDao;

public class MainActivity extends WoloxActivity {

    private GridView mGridView;
    private AudioButtonsAdapter mAudioButtonsAdapter;

    @Override
    protected int layout() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUi() {
        mGridView = (GridView) findViewById(R.id.activity_main_grid);
    }

    @Override
    protected void setListeners() {

    }

    @Override
    protected void populate() {

    }

    @Override
    protected void init() {
        mAudioButtonsAdapter = new AudioButtonsAdapter(this, LinierrsAudioDao.list());
        mGridView.setAdapter(mAudioButtonsAdapter);
    }
}
