package aep_poo.aep;

public class AppHome {
    public static void main(String[] args) {
        
        //----------------------Adicionando Informações no Perfil-------------------------------------
        Perfil exemplo = new Perfil("Leonardo", "leonardo@gmail.com", "1235223525", "99999999","bababab");
        Perfil exemplo2 = new Perfil("Rodrigues", "Rodrigues@gmail.com", "012355555", "10000000","senha");
        //----------------------Adicionando Informações no Perfil-------------------------------------

        //---------------------------------Adicionando Informações de Endereço----------------------------
        Endereco enderecoVitima = new Endereco("Rua leopoldino sei la do que", "1007", "Cianorte", "Zona - 1 ", "Brasil", "PR");
        Endereco enderecoFamiliarVitima = new Endereco("Barão da bisadinha", "200", "Maringá", "Zona - 5 ", "Brasil", "PR");
        Endereco endereçoRodrigues = new Endereco("Algum lugar de Maringá", "222", "Maringá", "Zona Leste", "Brasil", "PR");
        //---------------------------------Adicionando Informações de Endereço----------------------------

        Realizarpedido Pizza = new Realizarpedido (2, "Pizza de Calabresa");
        exemplo.addCardapio(Pizza);


        //Adicionando Endereço no Perfil do Usuário--------------------------------
        exemplo.addEndereço(enderecoVitima);
        exemplo.addEndereço(enderecoFamiliarVitima);
        exemplo2.addEndereço(endereçoRodrigues);
        //Adicionando Endereço no Perfil do Usuário--------------------------------
 
        //Salvando Endereço no Usuário---------------------------------------------
        exemplo.setEndereçoPrincipal(enderecoVitima);
        //Salvando Endereço no Usuário---------------------------------------------

        System.out.println(exemplo);
        System.out.println(exemplo2);
    }
}
