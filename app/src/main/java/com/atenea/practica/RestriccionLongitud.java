package com.atenea.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class RestriccionLongitud extends AppCompatActivity {

    private TextInputEditText passwordEditText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restriccion_longitud);
        passwordEditText = findViewById(R.id.passwordEditText);
        button =  findViewById(R.id.submitButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = passwordEditText.getText().toString().trim();
                if(isValidPassword(password))
                {
                    Toast.makeText(RestriccionLongitud.this,"La contrasena es valida",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(RestriccionLongitud.this,"La contrasena debe tener entre 6 y 12 caracteres",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidPassword(String password) {
        return password.length() >= 6 && password.length() <= 12;
    }
}