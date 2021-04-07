package br.com.alura;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor {

    private String nome;
    private String email;
    private String biografia;
    private String data;
    private static final String regex = "^(.+)@(.+)$";

//    private LocalDate data;

    public Autor(String nome, String email, String biografia){
        setNome(nome);
        setEmail(email);
        setBiografia(biografia);
        setData();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getBiografia() {
        return biografia;
    }

    public String getData() {
        return data;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Inválido! Você precisa digitar o nome!");
        }
    }

    public void setBiografia(String biografia) {
        if(!biografia.isEmpty()){
            this.biografia = biografia;
        } else {
            throw new IllegalArgumentException("Inválido! Você precisa digitar a biográfia!");
        }
    }

    public void setEmail(String email) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
            this.email = email;
        } else {
            throw new IllegalArgumentException("Inválido! Você precisa digitar um e-mail válido!");
        }
    }

    public void setData() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.now().format(formatador);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor outro = (Autor) o;
        return outro.getEmail().equals(this.email);
    }

    @Override
    public String toString() {
        return this.getNome() + ", " + this.getEmail() + ", " + this.getBiografia() + ", " + this.getData();
    }
}
