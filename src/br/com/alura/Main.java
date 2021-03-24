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
    }
}
