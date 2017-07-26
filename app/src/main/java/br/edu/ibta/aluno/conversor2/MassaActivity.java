package br.edu.ibta.aluno.conversor2;

import java.math.BigDecimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MassaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massa);

        Spinner spinnerDe2 = (Spinner) findViewById(R.id.sprDe2);
        Spinner spinnerPara2 = (Spinner) findViewById(R.id.sprPara2);

        ArrayAdapter<Unidade> adapter2 = new ArrayAdapter<Unidade>(
                this,
                android.R.layout.simple_spinner_item,
                Massa.getUnidadesAsKeyValueArray2(getUnidades2())
        );

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDe2.setAdapter(adapter2);
        spinnerPara2.setAdapter(adapter2);
    }


    public void btnResultado2(View view) {
        EditText text = (EditText) findViewById(R.id.txtValor2);

        try {


            BigDecimal valor = new BigDecimal(text.getText().toString());

            Unidade unidadeDe = (Unidade) ((Spinner) findViewById(R.id.sprDe2)).getSelectedItem();
            Unidade unidadePara = (Unidade) ((Spinner) findViewById(R.id.sprPara2)).getSelectedItem();
            BigDecimal result = valor.multiply(

                    Massa.TABELA_DE_CONVERSAO[unidadeDe.ID][unidadePara.ID]
            );

            EditText txtResult = (EditText) findViewById(R.id.txtResultado2);
            txtResult.setText(result.toString());
        }

        catch (Exception E) {
            Toast tst = Toast.makeText(this, R.string.vlrinld, Toast.LENGTH_SHORT);
            tst.show();
        }
    }


    public String[] getUnidades2() {
        String unidades2[] = new String[]{
                getResources().getString(R.string.massa_grama),
                getResources().getString(R.string.massa_quilograma),
                getResources().getString(R.string.massa_libra),
                getResources().getString(R.string.massa_onca),
        };
        return unidades2;
    }
}