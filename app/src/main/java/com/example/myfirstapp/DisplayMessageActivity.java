package com.example.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private String message = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

      /*  TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
        layout.addView(textView);*/
    }

    public void abrirDireccion(View view) {
        Uri location = Uri.parse("geo:0,0?q=" + message);
        Intent intent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(intent);
    }
}
