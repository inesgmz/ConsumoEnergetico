package com.example.consumoenergetico.ui.Consumo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import com.example.consumoenergetico.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Start data collection service
        Intent intent = new Intent(this, DataService.class);
        startService(intent);
    }

    // Navigate to GraphActivity
    public void openGraphs(View view) {
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);
    }

    // Navigate to RecommendationsActivity
    public void openRecommendations(View view) {
        Intent intent = new Intent(this, RecommendationsActivity.class);
        startActivity(intent);
    }
}
