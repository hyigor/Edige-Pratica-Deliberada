package br.com.alura.dao;

import br.com.alura.modelo.Categoria;

import java.util.*;

public class CategoriaDao {
    //nao pode cadastrar a mesma categoria
    private List<Categoria> listaCategorias = new ArrayList<>();

    public void insereCategoria(Categoria categoria){
        if(categoria == null){
            System.out.println("Erro!\n");
        } else if(igual(categoria)){
            System.out.println("Categoria já registrada!\n");
        } else {
            listaCategorias.add(categoria);
            System.out.println("Categoria criada com sucesso!\n");
        }

    }

    public String getListaCategorias() {
        String s = "Lista de categorias:\n\n";
        Categoria a;
        Iterator it = listaCategorias.iterator();

        while(it.hasNext()){
            a = (Categoria) it.next();

            if(it.hasNext()){
                s += a + "\n";
            } else {
                s += a +".";
            }
        }
        return s;
    }

    public boolean igual(Categoria outro){
        return listaCategorias.contains(outro);
    }




}
