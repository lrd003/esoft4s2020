package leonardo_oliveira_goncalves.entrega.atividade.avaliativapoo;

import java.util.ArrayList;
import java.util.List;


public class CompraEquipamento extends Equipamentos{

    private List<Pessoa> ListaDeComprador = new ArrayList<>();
    private String nome;
    private int quantidade;

	public CompraEquipamento(int qntEquipamento, String nomeEquipamento) {
        super();
        this.nome = nomeEquipamento;
        this.quantidade = qntEquipamento;
    }
    
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    

    public void addPessoaCompra(Pessoa Nome) {
        this.ListaDeComprador.add(Nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidade(int qnt){
        this.quantidade = qnt;
    }


}

   

    



    
