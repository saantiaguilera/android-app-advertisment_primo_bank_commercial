package com.santi.sender;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by santi on 22/06/16.
 */
public class MainActivity extends Activity {

    private ImageView imageStart;
    private ImageView imageEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        imageStart = (ImageView) findViewById(R.id.activity_main_sender_start);
        imageEnd = (ImageView) findViewById(R.id.activity_main_sender_end);

        imageStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageEnd.setVisibility(View.VISIBLE);
                imageStart.setVisibility(View.GONE);
            }
        });
    }

}
