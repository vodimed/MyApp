package com.smartoperator.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends Activity {
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView control = findViewById(R.id.scroller);
        control.setOnClickListener(onClick);
        control.setMovementMethod(new android.text.method.ScrollingMovementMethod());
    }

    private View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // https://github.com/dawsonice/KissProxy
            ((android.widget.TextView)view).append(String.format(Locale.getDefault(), "%d\n", ++i));
        }
    };
}
