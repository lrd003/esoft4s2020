package leonardo_oliveira_goncalves.entrega.avaliativa;


import java.util.ArrayList;
import java.util.List;


public class Produto extends LocalProduto {

private String nomeProduto;
private List<LocalProduto> locais = new ArrayList<>();


public Produto(){
    super();
}

public Produto(int QuantidadeDeProduto, String NomeProduto){
    super();
    this.nomeProduto = NomeProduto;

}

@Override
public void setLocalProduto(int localProduto) {
    super.setLocalProduto(localProduto +1);
}

public String getNomeProduto(){
    return nomeProduto;
}

public void setNomeProduto(String NomeProduto){
    this.nomeProduto = NomeProduto;
}

public void addLocal(LocalProduto alimentos) {
    this.locais.add(alimentos);
}

}
