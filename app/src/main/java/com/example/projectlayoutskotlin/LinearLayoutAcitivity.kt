package com.example.projectlayoutskotlin


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity

public class LinearLayoutActivity : AppCompatActivity() {
    /**
     * Called when the activity is first created.
     */
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.linear_layout);
//        val linearButton: Button = findViewById(R.id.okay);
    }
}