package com.example.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView factTextView;
    private Button showFactButton;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factTextView = findViewById(R.id.ShowFactortextView);
        showFactButton = findViewById(R.id.ShowFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view){
                String fact = factBook.getFact();
                int color = colorWheel.getColor();
                factTextView.setText(fact);
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);
//        Log.d(TAG,"We' re logging from onCreate() method!");
//        Toast.makeText(this,"yay!",Toast.LENGTH_SHORT).show();

    }
}
