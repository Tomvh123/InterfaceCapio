package com.example.capio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inlog);

        button = (Button) findViewById(R.id.ButtonInloggen);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}



