package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoSobrenome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.campoNome = findViewById(R.id.et_nome);
        this.campoSobrenome = findViewById(R.id.et_sobrenome);
    }

    @Override
    protected  void onStart() { super.onStart(); }

    public void clicarParaMostrar(View v) {
        Toast.makeText(MainActivity.this, campoNome.getText() + " " + campoSobrenome.getText(), Toast.LENGTH_LONG).show();
    }

    public void clicarParaLimpar(View v) {
        campoNome.setText("");
        campoSobrenome.setText("");
    }
}