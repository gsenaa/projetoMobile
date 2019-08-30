package com.example.melo;

import android.os.Parcel;
import android.os.Parcelable;

public class InfoUsuario implements Parcelable {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String email;

    public InfoUsuario(String nome, String cpf, int idade, String sexo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }

    private InfoUsuario(Parcel p){
        nome = p.readString();
        cpf = p.readString();
        idade = p.readInt();
        sexo = p.readString();
        email = p.readString();

    }

    public static final Parcelable.Creator<InfoUsuario>
        CREATOR = new Parcelable.Creator<InfoUsuario>(){

        public InfoUsuario createFromParcel(Parcel in){
            return  new InfoUsuario(in);
        }

        public InfoUsuario[] newArray(int size){
            return new InfoUsuario[size];
        }
    };


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeInt(idade);
        dest.writeString(sexo);
        dest.writeString(email);

    }
}
