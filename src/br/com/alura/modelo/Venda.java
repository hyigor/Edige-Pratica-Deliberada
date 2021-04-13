package br.com.alura.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Venda {

    private Livro livro;
    private double preco;
    public String dataVenda;

    public Venda(Livro livro){
        setLivro(livro);
        setPreco(livro.getPreco());
        setDataVenda();
    }



    public void setLivro(Livro livro) {
        if(livro != null){
            this.livro = livro;
        } else{
            throw new IllegalArgumentException("Inválido! Você precisa escolher um livro!");
        }
    }

    public Livro getLivro() {
        return this.livro;
    }

      public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco != 0){
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Digite um número válido!");
        }
    }

    public void setDataVenda() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataVenda = LocalDate.now().format(formatador);
    }

    public String getDataVenda() {
        return dataVenda;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getLivro().getTitulo() + " - Preço: R$" + this.getPreco() + " - Data da Venda: " + this.getDataVenda();

    }



}
