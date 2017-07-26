package br.edu.ibta.aluno.conversor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.math.BigDecimal;

public class TemperaturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        Spinner spinnerDe3 = (Spinner) findViewById(R.id.sprDe3);
        Spinner spinnerPara3 = (Spinner) findViewById(R.id.sprPara3);

        ArrayAdapter<Unidade> adapter3 = new ArrayAdapter<Unidade>(
                this,
                android.R.layout.simple_spinner_item,
                Temperatura.getUnidadesAsKeyValueArray(getUnidades3())
        );

        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDe3.setAdapter(adapter3);
        spinnerPara3.setAdapter(adapter3);
    }


    public void btnResultado3(View view) {

        EditText txtValor3 = (EditText) findViewById(R.id.txtValor3);

        try {

            Log.w("VALOR", txtValor3.getText().toString());


            BigDecimal valor3 = new BigDecimal(txtValor3.getText().toString());

            Unidade unidadeDE3 =
                    (Unidade) ((Spinner) findViewById(R.id.sprDe3)).getSelectedItem();
            Unidade unidadePARA3 =
                    (Unidade) ((Spinner) findViewById(R.id.sprPara3)).getSelectedItem();


            BigDecimal result = valor3.multiply(
                    Temperatura.TABELA_DE_CONVERSAO[unidadeDE3.ID][unidadePARA3.ID]
            );

            EditText txtResult3 = (EditText) findViewById(R.id.txtResultado3);
            txtResult3.setText(result.toString());
        } catch (Exception E) {
            Toast tst = Toast.makeText(this, R.string.vlrinld, Toast.LENGTH_SHORT);
            tst.show();
            throw E;
        }
    }

    private String[] getUnidades3() {
        String[] unidades3 = new String[]{
                getResources().getString(R.string.temp_celsius),
                getResources().getString(R.string.temp_fahrenheit),
                getResources().getString(R.string.temp_kelvin)
        };
        return unidades3;
    }
}
