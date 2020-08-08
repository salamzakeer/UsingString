package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textMsg2 = findViewById(R.id.GvMsg1);
        textMsg2.setText(R.string.Msg2);

        Log.i( "Lifecycle", "OnStart called");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i( "Lifecycle", "OnStart called");

    }
    protected void onResume() {
        super.onResume();
        Log.i( "Lifecycle", "OnResume called");

    }

    protected void onPause() {
        super.onPause();
        Log.i( "Lifecycle", "onPause called");

    }
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "Lifecycle", "onDestroy called");

    }
}