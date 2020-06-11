package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int pontos = 0;

    public void avaliarQuestao1() {
        EditText questao1 = findViewById(R.id.campo_resposta);
        if (questao1.getText().toString().toUpperCase().contains("ANDROID STUDIO")) {
            pontos++;
        }
    }

    public void avaliarQuestao2(View view) {
        RadioButton botao_oreo = findViewById(R.id.botao_oreo);
        if (botao_oreo.isChecked()) {
            pontos++;
        }
    }

    public void avaliarQuestao3(View view) {
        CheckBox botaoC = findViewById(R.id.botao_C);
        CheckBox botaoJava = findViewById(R.id.botao_java);
        CheckBox botaoC2 = findViewById(R.id.botao_C2);
        if (botaoC.isChecked() && botaoJava.isChecked() && botaoC2.isChecked()) {
            pontos++;
        }
    }


    public void avaliarQuestao4(View view) {
        RadioButton botao_extensible = findViewById(R.id.botao_extensible);
        if (botao_extensible.isChecked()) {
            pontos++;
        }
    }

    public void avaliarQuestao5(View view) {
        RadioButton botao_linux = findViewById(R.id.botao_linux);
        if (botao_linux.isChecked()) {
            pontos++;
        }
    }

    public void displayPontos() {
        Toast.makeText(getApplicationContext(), "Você marcou " + pontos + " ponto(s).", Toast.LENGTH_LONG).show();
    }

    public void resetJogo(){
        pontos = 0;
    }

    public void enviarRespostas(View view) {
        avaliarQuestao1();
        avaliarQuestao2(view);
        avaliarQuestao3(view);
        avaliarQuestao4(view);
        avaliarQuestao5(view);
        displayPontos();
        resetJogo();
    }

}
