package com.example.parcial2docorte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText cedula;
    private EditText nombre;
    private EditText apellido;
    private EditText correo;
    private String carrera;
    private String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        cedula = findViewById(R.id.forCedula);
        nombre = findViewById(R.id.forNombre);
        apellido = findViewById(R.id.forApellido);
        correo = findViewById(R.id.forCorreo);
        String operacion;
        String valor;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void software(View view){

        String textoValor1 = cedula.getText().toString();
        String textoValor2 = nombre.getText().toString();
        String textoValor3 = apellido.getText().toString();
        String textoValor4 = correo.getText().toString();
        carrera = "software";
        valor= "$2'500.000";


        try {

            Intent intent = new Intent(this, MainActivity2.class);
            Bundle bundle = new Bundle();
            Paquete paquete = new Paquete(textoValor1, textoValor2,textoValor3,textoValor4,carrera,valor);
            bundle.putSerializable("Per",paquete);
            intent.putExtras(bundle);
            startActivity(intent);

        } catch (NumberFormatException e) {
        }
    }
}


