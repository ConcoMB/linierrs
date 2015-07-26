package ar.com.conco.bastanete.activity;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import ar.com.conco.bastanete.R;
import ar.com.conco.bastanete.adapter.AudioButtonsAdapter;
import ar.com.conco.bastanete.dao.LinierrsAudioDao;

public class MainActivity extends WoloxActivity {

    private GridView mGridView;
    private AudioButtonsAdapter mAudioButtonsAdapter;
    private Toolbar mToolbar;
    private AdView mAdView;

    @Override
    protected int layout() {
        return R.layout.activity_main;
    }

    @Override
    protected void setUi() {
        mGridView = (GridView) findViewById(R.id.activity_main_grid);
        mToolbar = (Toolbar) findViewById (R.id.toolbar);
        mAdView = (AdView) findViewById(R.id.ad_view);
        //Toolbar will now take on default Action Bar characteristics
        setSupportActionBar(mToolbar);
        //You can now use and reference the ActionBar
        getSupportActionBar().setTitle(R.string.app_name);
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
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_share:
                mAudioButtonsAdapter.toggleShareMode();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
