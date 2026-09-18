package com.example.apps;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    int posicao = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Integer[] imagens = new Integer[]{
                R.drawable.cachorro,
                R.drawable.porquinho,
                R.drawable.happy,
                R.drawable.patinho,
                R.drawable.gardem
        };

        ImageView imageView = findViewById(R.id.imageView);
        Button btnvolt = findViewById(R.id.volt);
        Button btnavan = findViewById(R.id.avan);

        btnavan.setOnClickListener(view -> {
            posicao++;
            imageView.setImageResource(imagens[posicao]);
        });
    }
}