package com.example.projectlayoutskotlin
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity


public class GridLayoutActivity : AppCompatActivity() {
    /**
     * Called when the activity is first created.
     */
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
    }
}