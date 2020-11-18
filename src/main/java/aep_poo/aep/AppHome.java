package aep_poo.aep;

public class AppHome {
    public static void main(String[] args) {
        
        Perfil exemplo = new Perfil("Leonardo", "leonardo@gmail.com", "1235223525", "99999999","bababab");
        Perfil exemplo2 = new Perfil("Rodrigues", "Rodrigues@gmail.com", "012355555", "10000000","senha");

        Endereco enderecoVitima = new Endereco("Rua leopoldino sei la do que", "1007", "Cianorte", "Zona - 1 ", "Brasil", "PR");
        Endereco enderecoFamiliar = new Endereco("Barão da bisadinha", "200", "Maringá", "Zona - 5 ", "Brasil", "PR");
        Endereco endereçoRodrigues = new Endereco("Algum lugar de Maringá", "222", "Maringá", "Zona Leste", "Brasil", "PR");

        exemplo.addEndereço(enderecoVitima);
        exemplo.addEndereço(enderecoFamiliar);
       
        exemplo.setEndereçoPrincipal(enderecoVitima);

        exemplo2.addEndereço(endereçoRodrigues);

        System.out.println(exemplo);
        System.out.println(exemplo2);
    }
}
