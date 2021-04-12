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

//        System.out.println(autorDao.getListaAutores());
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

//        System.out.println(categoriaDao.getListaCategorias());

        Livro livro1 = new Livro("Livro1", "978-3-16-148410-0", "aaaaaaaaaaaaaa", "bbbbbbbbbbbbbbbbbb", 50, autor, ct1, 50.0);
        Livro livro2= new Livro("Livro2", "978-4-16-148410-0", "bbbbbbbbbbbbbbbb", "ccccccccccccccccc", 100, autor1, ct2, 150.0);
        Livro livro3 = new Livro("Livro3", "978-5-16-148410-0", "ccccccccccccccccc", "ddddddddddddddddddd", 150, autor2, ct3, 250.0);
        Livro livro4 = new Livro("Livro4", "978-5-16-148410-0", "ccccccccccccccccccccccccccccccccccccccccccccccc", "ddddddddddddddddddd", 150, autor2, ct3, 250.0);

        LivroDao livroDao = new LivroDao();


        livroDao.insereLivro(livro1);
        livroDao.insereLivro(livro2);
        livroDao.insereLivro(livro3);
        livroDao.insereLivro(livro4);

        System.out.println(livroDao.getListaLivros());


        Buscar buscar = new Buscar(livroDao);

        Livro livroBuscado1 = buscar.buscar("Livro1");
        Livro livroBuscado2 = buscar.buscar("Livro3");



        VendaDao vendaDao = new VendaDao();

        vendaDao.adicionarNoCarrinho(livroBuscado1);
        vendaDao.adicionarNoCarrinho(livroBuscado2);


        System.out.println(vendaDao.vender());








    }
}
