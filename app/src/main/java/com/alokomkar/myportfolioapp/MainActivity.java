package com.alokomkar.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.scoresAppButton)
    public void scoresAppButtonClick() {
        showToast("This button will launch scores app!");
    }

    @OnClick(R.id.libraryAppButton)
    public void libraryAppButtonClick() {
        showToast("This button will launch library app!");
    }

    @OnClick(R.id.buildItBiggerButton)
    public void buildItBiggerButtonClick() {
        showToast("This button will launch build it bigger app!");
    }

    @OnClick(R.id.xyzReaderButton)
    public void xyzReaderButtonClick() {
        showToast("This button will launch xyz reader app!");
    }

    @OnClick(R.id.capStoneButton)
    public void capStoneButtonClick() {
        showToast("This button will launch capstone app!");
    }

    @OnClick(R.id.spotifyStreamerButton)
    public void spotifyStreamButtonClick() {
        showToast("This button will launch spotify streamer app!");
    }

    private void showToast( String message ) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

}
