package com.atenea.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText editText;
    private TextView charCountTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        charCountTextView = findViewById(R.id.charCountTextView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this,"Antes de cambiar el texto",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String inputText = charSequence.toString();
                int charCount = inputText.length();
                charCountTextView.setText(String.valueOf(charCount));
            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(MainActivity.this,"Despues de cambiar el texto",Toast.LENGTH_SHORT).show();
            }
        });
    }
}


