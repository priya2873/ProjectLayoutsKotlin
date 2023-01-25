package com.example.projectlayoutskotlin

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle;

public class RelativeLayoutActivity: AppCompatActivity() {
    /**
     * Called when the activity is first created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }
}