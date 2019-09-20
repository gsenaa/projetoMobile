package com.example.melo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends Activity {
    TextView nome;
    TextView cpf;
    TextView idade;
    TextView sexo;
    TextView email;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        InfoUsuario infoUsuario = getIntent().getExtras().getParcelable("Dados Usuario");

        this.nome = findViewById(R.id.NomeView);
        this.cpf =  findViewById(R.id.cpfView);
        this.idade = findViewById(R.id.idadeView2);
        this.sexo =  findViewById(R.id.sexoView3);
        this.email = findViewById(R.id.emailView4);

        String nomeUsuario = infoUsuario.getNome();
        String cpfUsuario = infoUsuario.getCpf();
        String idadeUsuario = Integer.toString(infoUsuario.getIdade());
        String sexoUsuario = infoUsuario.getSexo();
        String emailUsuario = infoUsuario.getEmail();
        this.nome.setText(nomeUsuario);
        this.cpf.setText(cpfUsuario);
        this.idade.setText(idadeUsuario);
        this.sexo.setText(sexoUsuario);
        this.email.setText(emailUsuario);
    }
}

