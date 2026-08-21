package com.example.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

import kotlin.random.URandomKt;

public class MainActivity extends AppCompatActivity {
    Random rng = new Random();;
    double contador = 0;
    double sum = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        TextView tv = findViewById(R.id.textView);

        b.setOnClickListener(view -> {

            contador = contador + Math.round(sum);
            tv.setText(Double.toString(contador));
            tv.setBackgroundColor(rng.nextInt());
            tv.setTextSize(55);
            sum = sum * 1.02;
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}