package br.com.alura;

import br.com.alura.dao.VendaDao;
import br.com.alura.modelo.Venda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RelatorioFaturamento {

    private VendaDao dao;
    List<Venda> copiaLista;
    private List<Venda> relatorio = new ArrayList<>();

    public RelatorioFaturamento(VendaDao dao){
        if(setDao(dao)){
            copiaLista = this.dao.listaVendas();
        }
    }

    public boolean setDao(VendaDao dao) {
        if(dao == null){
            throw new RuntimeException("Erro!");
        } else {
            this.dao = dao;
            return true;
        }
    }

    public void relatorio(String comeco, String fim){

        String [] comec = comeco.split("/");
        String [] end = fim.split("/");

        String[] resultado;

        for(Venda venda : copiaLista){
            resultado = venda.getDataVenda().split("/");

            if(Integer.parseInt(resultado[2]) >= Integer.parseInt(comec[2]) && Integer.parseInt(resultado[2]) <= Integer.parseInt(end[2])){
                if(Integer.parseInt(resultado[1]) >= Integer.parseInt(comec[1]) && Integer.parseInt(resultado[1]) <= Integer.parseInt(end[1])){
                    if (Integer.parseInt(resultado[0]) >= Integer.parseInt(comec[0]) && Integer.parseInt(resultado[0]) <= Integer.parseInt(end[0])){
                        relatorio.add(venda);
                    }
                }
            }
        }

        System.out.println(verRelatorio(comeco,fim));


    }


    public String verRelatorio(String comeco, String fim){
        String s = "\nRelatorio do periodo: " + comeco + " - " + fim+ "\n\n";
        Venda a;
        double total = 0;
        int qtd = 0;
        Iterator it = relatorio.iterator();
        while(it.hasNext()){
            a = (Venda) it.next();

            s += a + "\n";

            total += a.getPreco();
            qtd++;
        }
        s += "\n Valor total da venda: R$" + total + " - Quantidade de Vendas: " + qtd + "\n";
        return s;
    }




}
