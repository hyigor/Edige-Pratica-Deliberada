package br.com.alura;

import br.com.alura.dao.LivroDao;
import br.com.alura.modelo.Livro;

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
                System.out.println("\nO livro " + livro.getTitulo() +" foi encontrado com sucesso!");
                return livro;
            }
        }
        throw new RuntimeException("Esse livro não existe!");
    }


}
