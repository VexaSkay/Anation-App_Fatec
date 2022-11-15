package com.calculadora.anation_project_fatec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username =(TextView) findViewById(R.id.usuario);
        TextView password =(TextView) findViewById(R.id.senha);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.login_btn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correto
                    Toast.makeText(MainActivity.this, "Login realizado",Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(MainActivity.this, "Login falhou",Toast.LENGTH_SHORT).show();
            }
        });
    }
}