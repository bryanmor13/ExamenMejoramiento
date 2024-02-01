package com.example.examenmejoramiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText Lado;
        private TextView Resultado;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Lado=findViewById(R.id.lado);
                Resultado=findViewById(R.id.resultado);

                Button generarL =findViewById(R.id.boton);
                generarL.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                calcularLado();
                        }
                });
        }

        private void calcularLado(){
                float lado = Float.parseFloat(Lado.getText().toString());

                float area= lado*lado;

                Resultado.setText(String.valueOf(area) + " cm^2");
        }
}