package com.calculadora.anation_project_fatec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CartoesActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoes);

        bottomNavigationView = findViewById(R.id.nav_bar);
        bottomNavigationView.setSelectedItemId(R.id.menu_cartoes);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.menu_dashboard:
                        startActivity(new Intent(getApplicationContext(),DashboardActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_cartoes:
                        return false;

                    case R.id.menu_contas:
                        startActivity(new Intent(getApplicationContext(),ContasActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_carteira:
                        startActivity(new Intent(getApplicationContext(),CarteiraInvestimentosActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.menu_relatorios:
                        startActivity(new Intent(getApplicationContext(),RelatoriosActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                }

                return false;
            }
        });
    }
}