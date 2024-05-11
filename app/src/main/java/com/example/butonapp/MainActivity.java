package com.example.butonapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout bgElement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RelativeLayout
        bgElement = findViewById(R.id.activity_main);

        //optional
        bgElement.setBackgroundColor(Color.WHITE);

        // Call method to set button click listener
        myButtonListenerMethod();
    }

    // Method to set button click listener
    public void myButtonListenerMethod() {
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current background color of the RelativeLayout
                int color = ((ColorDrawable) bgElement.getBackground()).getColor();

                // Toggle between RED and BLUE background colors
                if (color == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                    button.setText("Blue");
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                    button.setText("Red");
                }
            }
        });
    }
}
