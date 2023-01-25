package com.example.projectlayoutskotlin

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity

open public class LayoutsActivity: AppCompatActivity() {
    /**
     * Called when the activity is first created.
     */
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        // Create UI Nodes/Objects e.g. Buttons, TextView etc..
        // Create View Hierarchy i.e. View Tree
        // Initialise UI
        // Set The ContentView To Initialised UI
        setContentView(R.layout.activity_main);

        // findViewById Will Search View In View Hierarchy i.e. View Tree
        val linearButton: Button = findViewById(R.id.linearButton);
        val relativeButton: Button = findViewById(R.id.relativeButton);
        val gridButton: Button = findViewById(R.id.gridButton);

        linearButton.setOnClickListener(OnClickListener() {
            fun onClick(v: View) {
                // Creating Intent Object
                // Intent is Message
                //      From    : LayoutActivity
                //      To      : LinearLayoutActivity

                // startActivity Method Will Send Intent

                startActivity(Intent(this, LinearLayoutActivity::class.java));
            }
        });

        relativeButton.setOnClickListener(OnClickListener() {
            fun onClick(v: View) {
                startActivity(Intent(this, RelativeLayoutActivity::class.java));
            }
        });

        gridButton.setOnClickListener(OnClickListener() {
            fun onClick(v: View) {
                startActivity(Intent(this, GridLayoutActivity::class.java));
            }
        });
    }
}