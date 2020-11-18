package aep_poo.aep;

public class Realizarpedido extends Cardapio{
    
    private String nomeProduto;
    
    public Realizarpedido(int nívelGravidade, String nomeProduto){
        super(nívelGravidade);
        this.nomeProduto = nomeProduto;
    }

    @Override
    public void setNívelGravidade(int nívelGravidade) {
        super.setNívelGravidade(nívelGravidade+1);
    }

    public String getNomeProduto() {
       return nomeProduto;
    }
    
    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }
    
    @Override
    public String toString() {
        return "Pedido: [" + nomeProduto + "]";
    }
  





}
