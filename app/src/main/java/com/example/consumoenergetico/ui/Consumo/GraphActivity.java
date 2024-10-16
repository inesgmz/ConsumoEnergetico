package com.example.consumoenergetico.ui.Consumo;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import com.example.consumoenergetico.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment;
import com.github.mikephil.charting.components.Legend.LegendVerticalAlignment;
import com.github.mikephil.charting.components.Legend.LegendOrientation;

public class GraphActivity extends AppCompatActivity {
    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        pieChart = findViewById(R.id.pieChart);
        ArrayList<PieEntry> entries = new ArrayList<>();

        Button btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(GraphActivity.this, MainActivity.class);
            startActivity(intent);
        });

        // Dummy data
        entries.add(new PieEntry(5.4f, "Cocina"));
        entries.add(new PieEntry(1.4f, "Salón"));
        entries.add(new PieEntry(1.3f, "Baño"));

        PieDataSet dataSet = new PieDataSet(entries, "Consumo Energético (kWh)");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);

        PieData data = new PieData(dataSet);
        data.setValueTextSize(10f);
        data.setValueTextColor(android.graphics.Color.BLACK);

        pieChart.setData(data);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(android.graphics.Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);
        pieChart.setHoleRadius(58f);
        pieChart.invalidate();

        Legend legend = pieChart.getLegend();
        legend.setTextSize(14f);
        legend.setHorizontalAlignment(LegendHorizontalAlignment.CENTER);
        legend.setVerticalAlignment(LegendVerticalAlignment.BOTTOM);
        legend.setOrientation(LegendOrientation.HORIZONTAL);
    }
}