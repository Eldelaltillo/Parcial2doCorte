package com.example.parcial2docorte;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

     EditText cedula;
     EditText nombre;
     EditText apellido;
     EditText correo;
     String carrera;
     String valor;

    String forcedula;
    String fornombre;
    String forapellido;
    String forcorreo;
    String forcarrera;
    String forvalor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        cedula = findViewById(R.id.textView4);
        nombre = findViewById(R.id.textView7);
        apellido = findViewById(R.id.textView9);
        correo = findViewById(R.id.textView11);
        carrera = findViewById(R.id.textView13);
        valor = findViewById(R.id.textView17);

        Paquete paquete = (Paquete) getIntent().getSerializableExtra("Per");

        forcedula = paquete.getCedula();
        fornombre = paquete.getNombre();
        forapellido = paquete.getApellido();
        forcorreo = paquete.getCorreo();
        forcarrera = paquete.getCarrera();
        forvalor = paquete.getValor();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}