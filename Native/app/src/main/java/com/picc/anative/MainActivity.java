package com.picc.anative;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

import io.flutter.view.FlutterMain;


public class MainActivity extends AppCompatActivity {

    private FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FlutterMain.startInitialization(this);
        container = (FrameLayout) findViewById(R.id.flutter_container);
        findViewById(R.id.btn_flutter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MyFlutterActivity.class));
//                View flutterView = Flutter.createView(
//                        MainActivity.this,
//                        getLifecycle(),
//                        "route1"
//                );
////                FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
////                layout.leftMargin = 100;
////                layout.topMargin = 200;
////                addContentView(flutterView, layout);
//                container.addView(flutterView);
            }
        });
    }
}
