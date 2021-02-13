package com.example.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tbhConversores;
    TextView tempVal;
    Button btnConvertir;
    Spinner spnOptionDe, spnOptionA;
    conversores miConversor = new conversores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbhConversores = findViewById(R.id.tabConversores);
        tbhConversores.setup();

        tbhConversores.addTab(tbhConversores.newTabSpec("Monedas").setContent(R.id.tabMonedas).setIndicator("M"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Longitud").setContent(R.id.tabLongitud).setIndicator("L"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Masa").setContent(R.id.tabMasa).setIndicator("P"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Tiempo").setContent(R.id.tabTiempo).setIndicator("T"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Volumen").setContent(R.id.tabVolumen).setIndicator("V"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Area").setContent(R.id.tabArea).setIndicator("A"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Almacenamiento").setContent(R.id.tabAlmacenamiento).setIndicator("D"));
        tbhConversores.addTab(tbhConversores.newTabSpec("Temperatura").setContent(R.id.tabTemperatura).setIndicator("tmp"));

        btnConvertir = findViewById(R.id.btncalcular);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    tempVal = (EditText) findViewById(R.id.txtcantidad);
                    Double cantidad = Double.parseDouble(tempVal.getText().toString());

                    spnOptionDe = findViewById(R.id.cboDe);
                    spnOptionA = findViewById(R.id.cboA);
                    tempVal = findViewById(R.id.IblRespuesta);
                    tempVal.setText("Respuesta: " + miConversor.covertir(0, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));
                }catch(Exception ex){
                    tempVal =findViewById(R.id.IblRespuesta);
                    tempVal.setText("Por favor ingrese la cantidad");
                    Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnConvertir = findViewById(R.id.btncalcularL);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        try {
                            tempVal = (EditText) findViewById(R.id.txtcantidadL);
                            Double cantidad = Double.parseDouble(tempVal.getText().toString());

                            spnOptionDe = findViewById(R.id.cboDeL);
                            spnOptionA = findViewById(R.id.cboDeAL);
                            tempVal = findViewById(R.id.IblRespuestaL);

                            tempVal.setText("Respuesta: " + miConversor.covertir(1, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));


                        }catch(Exception ex){
                            tempVal =findViewById(R.id.IblRespuestaL);
                            tempVal.setText("Por favor ingrese la cantidad");
                            Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
                        }
                    }
                });

        btnConvertir = findViewById(R.id.btncalcularMa);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                tempVal = (EditText) findViewById(R.id.txtcantidadMa);
                Double cantidad = Double.parseDouble(tempVal.getText().toString());

                spnOptionDe = findViewById(R.id.cboDeMasa);
                spnOptionA = findViewById(R.id.cboDeMa);
                tempVal = findViewById(R.id.IblRespuestaMa);
                tempVal.setText("Respuesta: " + miConversor.covertir(2, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));
            }catch(Exception ex){
                tempVal =findViewById(R.id.IblRespuestaL);
                tempVal.setText("Por favor ingrese la cantidad");
                Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
            }
            }
        });

        btnConvertir = findViewById(R.id.btncalcularTi);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            try{
                tempVal = (EditText) findViewById(R.id.txtcantidadTi);
                Double cantidad = Double.parseDouble(tempVal.getText().toString());

                spnOptionDe = findViewById(R.id.cboDeTiempo);
                spnOptionA = findViewById(R.id.cboDeTi);
                tempVal = findViewById(R.id.IblRespuestaTi);
                tempVal.setText("Respuesta: " + miConversor.covertir(3, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));
            }catch(Exception ex){
                tempVal =findViewById(R.id.IblRespuestaL);
                tempVal.setText("Por favor ingrese la cantidad");
                Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
            }
            }
        });

        btnConvertir = findViewById(R.id.btncalcularV);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        try{
        tempVal = (EditText) findViewById(R.id.txtcantidadV);
        Double cantidad = Double.parseDouble(tempVal.getText().toString());

        spnOptionDe = findViewById(R.id.cboDeV);
        spnOptionA = findViewById(R.id.cboDeAV);
        tempVal = findViewById(R.id.IblRespuestaV);
        tempVal.setText("Respuesta: " + miConversor.covertir(4, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));
        }catch(Exception ex){
                tempVal =findViewById(R.id.IblRespuestaL);
                tempVal.setText("Por favor ingrese la cantidad");
                Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
        });

        btnConvertir = findViewById(R.id.btncalcularAr);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        try{
        tempVal = (EditText) findViewById(R.id.txtcantidadAr);
        Double cantidad = Double.parseDouble(tempVal.getText().toString());

        spnOptionDe = findViewById(R.id.cboDeArea);
        spnOptionA = findViewById(R.id.cboDeAr);
        tempVal = findViewById(R.id.IblRespuestaAr);

        tempVal.setText("Respuesta: " + miConversor.covertir(5, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));
        }catch(Exception ex){
                tempVal =findViewById(R.id.IblRespuestaL);
                tempVal.setText("Por favor ingrese la cantidad");
                Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
            }
        }
        });

        btnConvertir = findViewById(R.id.btncalcularAlm);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                try {
                    tempVal = (EditText) findViewById(R.id.txtcantidadAlm);
                    Double cantidad = Double.parseDouble(tempVal.getText().toString());

                    spnOptionDe = findViewById(R.id.cboDeAlmacenamiento);
                    spnOptionA = findViewById(R.id.cboDeAlm);
                    tempVal = findViewById(R.id.IblRespuestaAlm);

                    tempVal.setText("Respuesta: " + miConversor.covertir(1, spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));

                }catch(Exception ex){
                    tempVal =findViewById(R.id.IblRespuestaAlm);
                    tempVal.setText("Por favor ingrese la cantidad");
                    Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnConvertir = findViewById(R.id.btncalcularTem);
        btnConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    tempVal = (EditText) findViewById(R.id.txtcantidadTm);
                    Double cantidad = Double.parseDouble(tempVal.getText().toString());

                    spnOptionDe = findViewById(R.id.cboDeTm);
                    spnOptionA = findViewById(R.id.cboDeTem);
                    tempVal = findViewById(R.id.IblRespuestaTm);

                    tempVal.setText("Respuesta: " + miConversor.convertirTemperatura(spnOptionDe.getSelectedItemPosition(), spnOptionA.getSelectedItemPosition(), cantidad));

                }catch(Exception ex){
                    tempVal =findViewById(R.id.IblRespuestaTm);
                    tempVal.setText("Por favor ingrese la cantidad");
                    Toast.makeText(getApplicationContext(), "Por favor ingrese los valores indicados "+ ex.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


class conversores {

    Double[][] conversor = {
            {1.0, 8.85, 7.77, 24.05, 34.89, 608.72, 20.08, 0.83, 0.73, 105.0}, //Monedas/
            {1000000., 1000., 100., 39.37, 3.28, 1.09, 1., 0.001, 0.000621, 0.00054},//Longitud/
            {1.0, 0.453592, 16.0, 453592.4, 453.5924, 4.535924, 0.000454, 0.000446, 0.0005, 45.35924}, //Masa/
            {1.0, 3.6e+12, 3.6e+9, 3.6e+6, 3600.0, 60.0, 0.0416667, 0.00595238, 0.00136986, 1.1416e-5}, //Tiempo/
            {1.0, 0.06, 0.001, 0.000001, 0.202884, 0.067628, 0.033814, 0.004227, 0.002113, 0.001057},//Volumen//
            {1.0, 1.430828, 15.903307888, 14233.213, 10.000, 0.01, 15.500031, 107.639, 11.960, 2.471054}
    };

    public double covertir(int option, int de, int a, double cantidad) {
        return conversor[option][a] / conversor[option][de] * cantidad;
    }

    public double convertirTemperatura(int de, int a, double cantidad) {
        double respuesta = 0;
        //Celsius
        if (de == 0) {
            if (a == 0) {
                respuesta = cantidad;
            } else if (a == 1) {
                respuesta = (cantidad * 9 / 5) + 32;
            } else if (a == 2) {
                respuesta = cantidad + 273.15;
            }
        }
        //Fahrenheit
        if (de == 1) {
            if (a == 0) {
                respuesta = (cantidad - 32) * 5 / 9;
            } else if (a == 1) {
                respuesta = cantidad;
            } else if (a == 2) {
                respuesta = (cantidad - 32) * 5 / 9 + 273.15;
            }
        }
        // Kelvin
        if (de == 2) {
            if (a == 0) {
                respuesta = cantidad - 273.15;
            } else if (a == 1) {
                respuesta = (cantidad - 273.15) * 9 / 5 + 32;
            } else if (a == 2) {
                respuesta = cantidad;
            }
        }

        return respuesta;

     }
    }
}
