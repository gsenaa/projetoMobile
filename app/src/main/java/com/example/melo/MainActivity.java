package com.example.melo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.botao = (Button) findViewById(R.id.botao1);
        botao.setOnClickListener(new View.OnClickListener() {

            EditText nomeId;
            EditText cpfId;
            EditText idadeId;
            EditText sexoId;
            EditText emailId;

            @Override
            public void onClick(View v) {

                this.nomeId = (EditText) findViewById(R.id.nomeID);
                this.cpfId = (EditText) findViewById(R.id.cfpID);
                this.idadeId = (EditText) findViewById(R.id.idadeID);
                this.sexoId = (EditText) findViewById(R.id.sexoID);
                this.emailId = (EditText) findViewById(R.id.emailID);

                String nome = nomeId.getText().toString();
                String cpf = cpfId.getText().toString();
                int idade = Integer.parseInt(idadeId.getText().toString());
                String sexo = sexoId.getText().toString();
                String email = emailId.getText().toString();

                InfoUsuario infoUsuario = new InfoUsuario(nome, cpf, idade, sexo, email);
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("Dados Usuario", infoUsuario);
                startActivity(intent);

            }
        });
    }
}
