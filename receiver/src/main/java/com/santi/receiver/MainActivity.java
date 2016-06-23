package com.santi.receiver;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by santi on 22/06/16.
 */
public class MainActivity extends Activity {

    private static final int DELAY_TIME = 2000;

    private ImageView imageStart;
    private ImageView imageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageStart = (ImageView) findViewById(R.id.activity_main_receiver_start);
        imageEnd = (ImageView) findViewById(R.id.activity_main_receiver_end);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                imageEnd.setVisibility(View.VISIBLE);
                imageStart.setVisibility(View.GONE);
            }
        }, DELAY_TIME);
    }

}
