package br.com.alura;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Livro {

    private String titulo;
    private String isbn;
    private String resumo;
    private String sumario;
    private int numeroPaginas;
    private Autor autor;
    private Categoria categoria;
    private double preco;
    private static final String regex = "^(?:ISBN(?:-1[03])?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$|97[89][0-9]{10}$|(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)(?:97[89][- ]?)?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";


    public Livro(String titulo, String isbn, String resumo, String sumario,
                 int numeroPaginas, Autor autor, Categoria categoria, double preco){
        setTitulo(titulo);
        setIsbn(isbn);
        setResumo(resumo);
        setSumario(sumario);
        setNumeroPaginas(numeroPaginas);
        setAutor(autor);
        setCategoria(categoria);
        setPreco(preco);
    }



    public void setTitulo(String titulo) {
        if(!titulo.isEmpty()){
            this.titulo = titulo;
        } else{
            throw new IllegalArgumentException("Inválido! Você precisa digitar o titulo!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIsbn(String isbn) {
        if(!isbn.isEmpty()){
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(isbn);
            if(matcher.matches()){
                this.isbn = isbn;
            } else {
                throw new IllegalArgumentException("Inválido! Você precisa digitar um isbn válido!");
            }
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        if(resumo.length() < 500 && !resumo.isEmpty()){
            this.resumo = resumo;
        } else if(resumo.length() > 499){
            throw new IllegalArgumentException("Inválido! Você precisa digitar um resumo com menos de 500 caracteres");
        } else if(resumo.isEmpty()){
            throw new IllegalArgumentException("Inválido! Você não pode deixar o resumo vazio");
        }
    }

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        if(!sumario.isEmpty()){
            this.sumario = sumario;
        } else {
            throw new IllegalArgumentException("Inválido! Você precisa digitar o sumário!");
        }
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if(numeroPaginas != 0){
            this.numeroPaginas = numeroPaginas;
        } else {
            throw new IllegalArgumentException("Digite um número válido!");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if(autor != null){
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("Autor inválido!");
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        if(categoria != null){
            this.categoria = categoria;
        } else {
            throw new IllegalArgumentException("Categoria inválida!");
        }
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro outro = (Livro) o;
        return outro.getIsbn().equals(this.isbn);
    }

    @Override
    public String toString() {
        return "Titulo: " + this.getTitulo() + " -  Isbn: " + this.getIsbn() + "\n Resumo: " + this.getResumo() + "\n Sumario: " + this.getSumario() + "\n Número de Páginas: " +
                this.getNumeroPaginas() + " - Autor: " + this.getAutor().getNome() + " - Categoria: " + this.getCategoria() + " - Preço: R$" + this.getPreco();

    }




}
