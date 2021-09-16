package com.luizao.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir, btnFechar;
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAbrir = findViewById(R.id.btnAbrir);
        btnFechar =findViewById(R.id.btnFechar);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(
                        view,
                        "Botão Pressionado",
                        Snackbar.LENGTH_LONG
                ).setAction(
                        "Confirmar",
                        new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //btnAbrir.setText("Botão Abrir alterado");

                            }
                        }).setActionTextColor(getResources().getColor(R.color.black)).show();
            }
        });

        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });
    }
}