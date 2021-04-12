package br.com.alura;

import java.util.List;

public class Buscar {

    List<Livro> listaLivros;

    public Buscar(LivroDao dao){

        if(dao.listaLivros() != null){
            listaLivros = dao.listaLivros();
        } else {
            throw new RuntimeException("Erro!");
        }

    }

    public Livro buscar(String titulo){
        for(Livro livro : listaLivros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        throw new RuntimeException("Esse livro não existe!");
    }


}
