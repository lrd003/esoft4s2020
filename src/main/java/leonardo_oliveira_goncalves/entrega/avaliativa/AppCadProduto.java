package leonardo_oliveira_goncalves.entrega.avaliativa;

public class AppCadProduto {
    
   public static void main(String[] args) {
       
    Produto feijao = new Produto(5, "Feijao Barcelos");
    Produto Sabonete = new Produto(3, "Sabonete dove");

    LocalProduto Alimentos = new LocalProduto("Area de Alimentação", 1);
    LocalProduto Limpeza = new LocalProduto("Area de Limpeza", 5);
    
    feijao.addLocal(Alimentos);
    Sabonete.addLocal(Limpeza);

    System.out.println(feijao.getNomeProduto());
    System.out.println(Alimentos.toString());

    System.out.println(Sabonete.getNomeProduto());
    System.out.println(Limpeza.toString());
   } 
}
