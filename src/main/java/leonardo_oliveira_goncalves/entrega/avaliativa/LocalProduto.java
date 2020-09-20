package leonardo_oliveira_goncalves.entrega.avaliativa;

public class LocalProduto {
   
private String localProduto;
private int QuantidadeDeProduto;

public LocalProduto(){

}

public LocalProduto(String localProduto, int QuantidadeDeProduto) {
    setLocalProduto(QuantidadeDeProduto);
    this.localProduto = localProduto;
}

public String getLocalProduto(){
    return localProduto;
}

public void setLocalProduto(String localProduto){
    this.localProduto = localProduto;
}

public int getQuantidadeDeProduto() {
    return QuantidadeDeProduto;
}

public void setLocalProduto(int QuantidadeDeProduto) {
    if(QuantidadeDeProduto <= 0){
        throw new RuntimeException("Este local precisa de novos produtos");
    }
    this.QuantidadeDeProduto = QuantidadeDeProduto;
}

@Override
public String toString(){
    return "Local do Produto: " + localProduto +
    ",  Quantidade de Produto: " + QuantidadeDeProduto;
}

}
