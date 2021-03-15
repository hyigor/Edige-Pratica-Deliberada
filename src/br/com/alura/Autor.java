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

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()){
//            System.out.println("Email Válido! Autor criado!");
            this.nome = nome;
            this.email = email;
            this.biografia = biografia;
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.data = LocalDate.now().format(formatador);
        } else {
            System.out.println("E-mail Inválido");
        }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor outro = (Autor) o;
        return outro.getEmail().equals(this.email);
    }


}
