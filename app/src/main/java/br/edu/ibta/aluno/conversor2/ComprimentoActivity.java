package br.edu.ibta.aluno.conversor2;


import java.math.BigDecimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ComprimentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comprimento);

        Spinner spinnerDe = (Spinner) findViewById(R.id.sprDe);
        Spinner spinnerPara = (Spinner) findViewById(R.id.sprPara);

        ArrayAdapter<Unidade> adapter = new ArrayAdapter<Unidade>(
                this,
                android.R.layout.simple_spinner_item,
                Comprimento.getUnidadesAsKeyValueArray(getUnidades())
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerDe.setAdapter(adapter);
        spinnerPara.setAdapter(adapter);
    }

    public void btnResultado(View view) {

        EditText txtValor = (EditText) findViewById(R.id.txtValor);

        try {

            BigDecimal valor = new BigDecimal(txtValor.getText().toString());

            Unidade unidadeDE =
                    (Unidade) ((Spinner) findViewById(R.id.sprDe)).getSelectedItem();
            Unidade unidadePARA =
                    (Unidade) ((Spinner) findViewById(R.id.sprPara)).getSelectedItem();

            BigDecimal result = valor.multiply(

                    Comprimento.TABELA_DE_CONVERSAO[unidadeDE.ID][unidadePARA.ID]
            );

            EditText txtResult = (EditText) findViewById(R.id.txtResultado);
            txtResult.setText(result.toString());
        } catch (Exception E) {
            Toast tst = Toast.makeText(this, R.string.vlrinld, Toast.LENGTH_SHORT);
            tst.show();
        }
    }

    private String[] getUnidades() {
        String[] unidades = new String[]{

                getResources().getString(R.string.comprimento_centimetro),
                getResources().getString(R.string.comprimento_metro),
                getResources().getString(R.string.comprimento_quilometro),
                getResources().getString(R.string.comprimento_polegada),
                getResources().getString(R.string.comprimento_pe),
                getResources().getString(R.string.comprimento_milha)
        };
        return unidades;
    }

}