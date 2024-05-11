package com.example.butonapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call your custom button listener method
        myButtonListenerMethod();
    }

    // Custom method to set the button click listener
    private void myButtonListenerMethod() {
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color of the button
                toggleBackgroundColor();
            }
        });
    }

    // Method to toggle the background color of the button
    private void toggleBackgroundColor() {

        ColorDrawable bgDrawable = (ColorDrawable) button.getBackground();
        int currentColor = bgDrawable.getColor();

        // Toggle between red and blue background colors
        if (currentColor == Color.RED) {
            button.setBackgroundColor(Color.BLUE);
        } else {
            button.setBackgroundColor(Color.RED);
        }
    }
}
