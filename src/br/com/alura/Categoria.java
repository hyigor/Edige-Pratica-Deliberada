package br.com.alura;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Categoria {

    private String nome;
    private String data;

    public Categoria(String nome){
        setNome(nome);
        setData();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Inválido! Você precisa digitar o nome!");
        }
    }

    public String getData() {
            return data;
    }

    public void setData() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.now().format(formatador);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria outro = (Categoria) o;
        return outro.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return this.getNome() + ", " + this.getData();
    }
}
