package com.example.beeradviser2;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import beeradviser.BeerExpert;
import petardviser.PetExpert;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFindBeer(View view){
        TextView brands = (TextView) findViewById(R.id.brands);

        Spinner color = (Spinner) findViewById(R.id.color);

        String beerType = String.valueOf(color.getSelectedItem());

        BeerExpert be = new BeerExpert(beerType);
        ArrayList<String> recomendacion= be.getBrands();

        String salida = "";
        for(String a : recomendacion){
            salida += a + "\n";
        }
        brands.setText(salida);

    }

    public void onClickFindPet(View view){
        TextView pets = (TextView) findViewById(R.id.pets);

        Spinner razas = (Spinner) findViewById(R.id.raza);

        String petType = String.valueOf(razas.getSelectedItem());

        PetExpert be = new PetExpert(petType);
        ArrayList<String> recomendacion= be.getPets();

        String salida = "";
        for(String a : recomendacion){
            salida += a + "\n";
        }
        pets.setText(salida);
    }
}