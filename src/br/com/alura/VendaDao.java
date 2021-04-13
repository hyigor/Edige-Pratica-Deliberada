package br.com.alura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VendaDao {


    private List<Venda> listaVendas = new ArrayList<>();
    private List<Livro> carrinho = new ArrayList<>();

    public void adicionarNoCarrinho(Livro livro){
        if(livro == null){
            System.out.println("Erro!\n");
        } else {
            carrinho.add(livro);
            System.out.println("\nAdicionado com sucesso no carrinho!\n");
        }
    }

    public void insereVenda(){
        if(carrinho == null){
            System.out.println("Erro!\n");
        } else {
            for (Livro livro : carrinho){
                listaVendas.add(new Venda(livro));
            }
            System.out.println("\nVenda feita com sucesso!\n");
        }
    }


    public String vender(){
        insereVenda();
        String s = "Lista de livros vendidos:\n\n";
        Venda a;
        double total = 0;
        Iterator it = listaVendas.iterator();
        while(it.hasNext()){
            a = (Venda) it.next();

            s += a + "\n";

            total += a.getPreco();
        }
        s += "\n Valor total da venda: " + total;
        return s;
    }




}
