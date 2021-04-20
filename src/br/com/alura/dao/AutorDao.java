package br.com.alura.dao;

import br.com.alura.modelo.Autor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AutorDao {

    private List<Autor> listaAutores = new ArrayList<Autor>();

    public void insereAutor(Autor autor){
        if(autor == null){
            System.out.println("Erro!\n");
        } else if(igual(autor)){
            System.out.println("Autor já registrado com esse email.\n");
        } else {
            listaAutores.add(autor);
            System.out.println("Autor criado com sucesso!\n");
        }


    }

    public String getListaAutores() {

        String s = "Lista de autores:\n\n";
        Autor a;
        Iterator it = listaAutores.iterator();

        while(it.hasNext()){
            a = (Autor) it.next();

            if(it.hasNext()){
                s += a + "\n";
            } else {
                s += a +".";
            }
        }

//        for(Autor autor: listaAutores){
//            if(listaAutores.)
//            s += autor.getNome() + ", ";
//        }
        return s;
    }


    public boolean igual(Autor outro){
        return listaAutores.contains(outro);
    }





}







