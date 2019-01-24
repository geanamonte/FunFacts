package com.example.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.ShowFactortextView);
        showFactButton = findViewById(R.id.ShowFactButton);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view){
                String fact = factBook.getFact();
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
