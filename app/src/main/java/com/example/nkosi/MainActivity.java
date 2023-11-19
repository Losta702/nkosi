package com.example.nkosi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtWelcome;

    Button btnNext;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        super.setSupportActionBar(toolbar);
        txtWelcome = findViewById(R.id.txtWelcome);
        btnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.overflow,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_option1) {
            txtWelcome.setText("Welcome to Nkosi Trading");
            btnNext.setText("Next");
            return true;
        } else if (itemId == R.id.action_option2) {
            txtWelcome.setText("Bienvenue sur Nkosi Trading");
            btnNext.setText("Suivante");
            return true;
        } else if (itemId == R.id.action_option3) {
            txtWelcome.setText("Bienvenido a Nkosi Trading");
            btnNext.setText("Siguiente");
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

}