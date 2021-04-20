package br.com.alura;

import br.com.alura.dao.AutorDao;
import br.com.alura.dao.CategoriaDao;
import br.com.alura.dao.LivroDao;
import br.com.alura.dao.VendaDao;
import br.com.alura.modelo.Autor;
import br.com.alura.modelo.Categoria;
import br.com.alura.modelo.Livro;

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
        Livro livro4 = new Livro("Livro4", "978-5-20-148410-0", "ccccccccccccccccccccccccccccccccccccccccccccccc", "ddddddddddddddddddd", 150, autor2, ct3, 250.0);
        Livro livro5 = new Livro("Livro5", "978-5-21-148410-0", "ccccccccccccccccccccccccccccccccccccccccccccccc", "ddddddddddddddddddd", 150, autor2, ct3, 250.0);
        Livro livro6 = new Livro("Livro6", "978-5-22-148410-0", "ccccccccccccccccccccccccccccccccccccccccccccccc", "ddddddddddddddddddd", 150, autor2, ct3, 250.0);

        LivroDao livroDao = new LivroDao();


        livroDao.insereLivro(livro1);
        livroDao.insereLivro(livro2);
        livroDao.insereLivro(livro3);
        livroDao.insereLivro(livro4);
        livroDao.insereLivro(livro5);
        livroDao.insereLivro(livro6);

        System.out.println(livroDao.getListaLivros());


        Buscar buscar = new Buscar(livroDao);

        Livro livroBuscado1 = buscar.buscar("Livro1");
        Livro livroBuscado2 = buscar.buscar("Livro2");
        Livro livroBuscado3 = buscar.buscar("Livro3");
        Livro livroBuscado4 = buscar.buscar("Livro4");
        Livro livroBuscado5 = buscar.buscar("Livro5");
        Livro livroBuscado6 = buscar.buscar("Livro6");



        VendaDao vendaDao = new VendaDao();

        vendaDao.adicionarNoCarrinho(livroBuscado1);
        vendaDao.adicionarNoCarrinho(livroBuscado2);
        vendaDao.adicionarNoCarrinho(livroBuscado3);
        vendaDao.adicionarNoCarrinho(livroBuscado4);
        vendaDao.adicionarNoCarrinho(livroBuscado5);
        vendaDao.adicionarNoCarrinho(livroBuscado6);


        System.out.println(vendaDao.vender());

        vendaDao.listaVendas().get(0).dataVenda = "09/04/2021";
        vendaDao.listaVendas().get(1).dataVenda = "12/04/2021";
        vendaDao.listaVendas().get(2).dataVenda = "13/04/2021";
        vendaDao.listaVendas().get(3).dataVenda = "14/04/2021";
        vendaDao.listaVendas().get(4).dataVenda = "14/04/2021";
        vendaDao.listaVendas().get(5).dataVenda = "20/04/2021";

        RelatorioFaturamento relatorioFaturamento = new RelatorioFaturamento(vendaDao);
        relatorioFaturamento.relatorio("10/04/2021","20/04/2021");








    }
}
