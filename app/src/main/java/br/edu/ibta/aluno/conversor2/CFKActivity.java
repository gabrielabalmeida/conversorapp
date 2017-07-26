package br.edu.ibta.aluno.conversor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.widget.Toast.makeText;
import static br.edu.ibta.aluno.conversor2.R.id.txtResultado_celsius;
import static br.edu.ibta.aluno.conversor2.R.id.txtResultado_fahrenheit;
import static br.edu.ibta.aluno.conversor2.R.id.txtResultado_kelvin;

public class CFKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfk);
    }

    public void calcCFK(View view) {
        EditText zeradorC = (EditText) findViewById(txtResultado_celsius);
        EditText zeradorF = (EditText) findViewById(txtResultado_fahrenheit);
        EditText zeradorK = (EditText) findViewById(txtResultado_kelvin);
        zeradorC.setText("");
        zeradorF.setText("");
        zeradorK.setText("");
        //Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        cb_celsius();
        cb_fahrenheit();
        cb_kelvin();
    }


    private void cb_celsius() {
        RadioButton rb_celsius = (RadioButton) findViewById(R.id.rb_celsius);
        CheckBox cbCelsius = (CheckBox) findViewById(R.id.cb_celsius);
        CheckBox cbFahrenheit = (CheckBox) findViewById(R.id.cb_fahrenheit);
        CheckBox cbKelvin = (CheckBox) findViewById(R.id.cb_kelvin);

        if (rb_celsius.isChecked() == true) {

            try {


                EditText vlr_celsius = (EditText) findViewById(R.id.txtValorToCalc);
                Double num_input = Double.parseDouble(vlr_celsius.getText().toString());


                if (cbCelsius.isChecked() == true) {
                    EditText resultadoCelsius = (EditText) findViewById(R.id.txtResultado_celsius);
                    resultadoCelsius.setText("" + num_input);
                }

                if (cbFahrenheit.isChecked() == true) {

                    double resultCF = 0.0;
                    resultCF = (num_input * 1.8) + 32;

                    EditText resultadoFahranheit = (EditText) findViewById(R.id.txtResultado_fahrenheit);
                    resultadoFahranheit.setText("" + resultCF);
                }

                if (cbKelvin.isChecked() == true) {

                    double resultCK = 0.0;
                    resultCK = num_input + 273.0;

                    EditText resultadoKelvin = (EditText) findViewById(txtResultado_kelvin);
                    resultadoKelvin.setText("" + resultCK);
                }
            } catch (Exception E) {
                Toast tst = Toast.makeText(this,  R.string.vlrinld, Toast.LENGTH_SHORT);
                tst.show();
            }
        }
    }

    private void cb_fahrenheit() {
        RadioButton rb_fahrenheit = (RadioButton) findViewById(R.id.rb_fahrenheit);
        CheckBox cbCelsius = (CheckBox) findViewById(R.id.cb_celsius);
        CheckBox cbFahrenheit = (CheckBox) findViewById(R.id.cb_fahrenheit);
        CheckBox cbKelvin = (CheckBox) findViewById(R.id.cb_kelvin);

        if (rb_fahrenheit.isChecked() == true) {

            try {

                EditText vlr_celsius = (EditText) findViewById(R.id.txtValorToCalc);
                Double num_inputF = Double.parseDouble(vlr_celsius.getText().toString());


                if (cbCelsius.isChecked() == true) {

                    double resultFC = 0.0;
                    resultFC = (num_inputF - 32.0) / 1.8;

                    EditText resultadoFahranheit = (EditText) findViewById(R.id.txtResultado_celsius);
                    resultadoFahranheit.setText("" + resultFC);

                }

                if (cbFahrenheit.isChecked() == true) {

                    EditText resultadoCelsius = (EditText) findViewById(R.id.txtResultado_fahrenheit);
                    resultadoCelsius.setText("" + num_inputF);
                }

                if (cbKelvin.isChecked() == true) {

                    double resultFK = 0.0;
                    resultFK = (num_inputF + 459.67) * (5.0 / 9.0);

                    EditText resultadoKelvin = (EditText) findViewById(txtResultado_kelvin);
                    resultadoKelvin.setText("" + resultFK);
                }
            } catch (Exception E) {
                Toast tst = Toast.makeText(this,  R.string.vlrinld, Toast.LENGTH_SHORT);
                tst.show();
            }
        }
    }

    private void cb_kelvin() {
        RadioButton rb_kelvin = (RadioButton) findViewById(R.id.rb_kelvin);
        CheckBox cbCelsius = (CheckBox) findViewById(R.id.cb_celsius);
        CheckBox cbFahrenheit = (CheckBox) findViewById(R.id.cb_fahrenheit);
        CheckBox cbKelvin = (CheckBox) findViewById(R.id.cb_kelvin);

        if (rb_kelvin.isChecked() == true) {

            try {
                EditText vlr_celsius = (EditText) findViewById(R.id.txtValorToCalc);
                Double num_inputK = Double.parseDouble(vlr_celsius.getText().toString());


                if (cbCelsius.isChecked() == true) {
                    double resultKC = 0.0;
                    resultKC = num_inputK - 273.0;

                    EditText resultadoCelsius = (EditText) findViewById(R.id.txtResultado_celsius);
                    resultadoCelsius.setText("" + resultKC);
                }

                if (cbFahrenheit.isChecked() == true) {
                    double resultKF;
                    resultKF = (num_inputK * (9.0 / 5.0)) - 459.67;

                    EditText resultadoFahranheit = (EditText) findViewById(R.id.txtResultado_fahrenheit);
                    resultadoFahranheit.setText("" + resultKF);
                }

                if (cbKelvin.isChecked() == true) {
                    EditText resultadoKelvin = (EditText) findViewById(txtResultado_kelvin);
                    resultadoKelvin.setText("" + num_inputK);
                }
            } catch (Exception E) {
                Toast tst = Toast.makeText(this,  R.string.vlrinld, Toast.LENGTH_SHORT);
                tst.show();
            }
        }

    }
}

