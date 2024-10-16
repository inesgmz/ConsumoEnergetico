package com.example.consumoenergetico.ui.Consumo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import com.example.consumoenergetico.R;

public class RecommendationsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        TextView recommendationsView = findViewById(R.id.recommendations);

        // Dummy recommendations based on consumption data
        String recommendations = "Recomendaciones para reducir el consumo:\n\n" +
                "1. Reduce el uso del horno: Usa microondas para platos pequeños.\n" +
                "2. Desconecta cargadores cuando no estén en uso.\n" +
                "3. Aprovecha la luz natural en el salón para reducir el uso de lámparas.\n" +
                "4. Usa ciclos de lavado en frío en la lavadora.";

        recommendationsView.setText(recommendations);

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(RecommendationsActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
