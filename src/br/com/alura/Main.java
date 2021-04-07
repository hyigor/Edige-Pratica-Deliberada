package br.com.alura;

public class Main {

    public static void main(String[] args) {
        Autor autor = new Autor("Igor","chagas_igor@hotmail.com","aaaaaaaa");
        Autor autor1 = new Autor("joao","chgas_igor@hotmail.com","aaaaaaaaaaaaa");
        Autor autor2 = new Autor("afonso","cagas_igor@hotmail.com","bbbbbbbbbbbbbbbbb");
        Autor autor3 = new Autor("roberto","chagas_igor@hotmail.com","cccccccccc");

        AutorDao autorDao = new AutorDao();
        autorDao.insereAutor(autor);
        autorDao.insereAutor(autor1);
        autorDao.insereAutor(autor2);
        autorDao.insereAutor(autor3);

        System.out.println(autorDao.getListaAutores());
//        System.out.println(autorDao.igual(autor3));



        Categoria ct1 = new Categoria("Ação");
        Categoria ct2 = new Categoria("Aventura");
        Categoria ct3 = new Categoria("Comédia");
        Categoria ct4 = new Categoria("Ação");

        CategoriaDao categoriaDao = new CategoriaDao();

        categoriaDao.insereCategoria(ct1);
        categoriaDao.insereCategoria(ct2);
        categoriaDao.insereCategoria(ct3);
        categoriaDao.insereCategoria(ct4);

        System.out.println(categoriaDao.getListaCategorias());





    }
}
