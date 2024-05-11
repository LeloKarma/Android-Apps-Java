package com.example.butonapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mainLayout; // Reference to the main layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        Button button = findViewById(R.id.button);
        mainLayout = findViewById(R.id.main_layout); // Assuming 'main_layout' is the ID of your main layout

        // Set button click listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle the background color of the main layout
                toggleBackgroundColor();
            }
        });
    }

    // Method to toggle the background color of the main layout
    private void toggleBackgroundColor() {
        // Get the current background color of the main layout
        int currentColor = ((ColorDrawable) mainLayout.getBackground()).getColor();


        if (currentColor == Color.RED) {
            mainLayout.setBackgroundColor(Color.BLUE);
        } else {
            mainLayout.setBackgroundColor(Color.RED);
        }
    }
}
