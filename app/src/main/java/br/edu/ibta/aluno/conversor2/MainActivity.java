package br.edu.ibta.aluno.conversor2;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnComprimento(View view) {
        Intent intent = new Intent(this, ComprimentoActivity.class);
        startActivity(intent);
    }

    public void btnMassa(View view) {
        Intent intent = new Intent(this, MassaActivity.class);
        startActivity(intent);
    }

    public void btnTemperatura (View v) {
        Intent intent = new Intent (this, TemperaturaActivity.class);
        startActivity(intent);
    }

    public void btnCFK (View v){
        Intent intent = new Intent (this, CFKActivity.class);
        startActivity(intent);
    }

}
