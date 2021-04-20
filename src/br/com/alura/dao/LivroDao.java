package br.com.alura.dao;

import br.com.alura.modelo.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LivroDao {

    private List<Livro> listaLivros = new ArrayList<>();

    public void insereLivro(Livro livro){
        if(livro == null){
            System.out.println("Erro!\n");
        } else if(igual(livro)){
            System.out.println("Livro já registrado!\n");
        } else {
            listaLivros.add(livro);
            System.out.println("Livro criada com sucesso!\n");
        }
    }

    public String getListaLivros() {
        String s = "Lista de livros:\n\n";
        Livro a;
        Iterator it = listaLivros.iterator();

        while(it.hasNext()){
            a = (Livro) it.next();

            if(it.hasNext()){
                s += a + "\n\n";
            } else {
                s += a +".";
            }
        }
        return s;
    }

    public List<Livro> listaLivros(){
        return Collections.unmodifiableList(listaLivros);
    }

    public boolean igual(Livro outro){
        return listaLivros.contains(outro);
    }

}
