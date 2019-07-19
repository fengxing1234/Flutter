package com.picc.anative;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //GeneratedPluginRegistrant.registerWith(this);
        setContentView(R.layout.activity_main);
        container = (FrameLayout) findViewById(R.id.flutter_container);
        findViewById(R.id.btn_flutter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View flutterView = Flutter.createView(
                        MainActivity.this,
                        getLifecycle(),
                        "route1"
                );
//                FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
//                layout.leftMargin = 100;
//                layout.topMargin = 200;
//                addContentView(flutterView, layout);
                container.addView(flutterView);
            }
        });
    }
}
