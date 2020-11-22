package leonardo_oliveira_goncalves.entrega.atividade.avaliativapoo;

public class Apphome {

    public static void main(String[] args) {
        
    Pessoa Leonardo = new Pessoa("Leonardo de Oliveira Gonçalves");
    Pessoa Lucas = new Pessoa("Lucas Marcelo Dias");

    Banda ACDC = new Banda("Album High Voltage", "1976");
    Banda LedZeppelin = new Banda ("Album Physical Graffiti", "1975");
    Banda BlackSabbath = new Banda ("Paranoid", "1970");

    CompraEquipamento Guitarra = new CompraEquipamento(3, "Guitarra Camuflada Verde Oliva");
    CompraEquipamento CaixaDeSom = new CompraEquipamento(2, "Bombox Preta");

    Leonardo.addBanda(ACDC);
    Leonardo.addBanda(LedZeppelin);
    Leonardo.setAlbumPrincipal(ACDC);

    Lucas.addBanda(BlackSabbath);
    Lucas.addBanda(ACDC);
    Lucas.addBanda(LedZeppelin);
    Lucas.setAlbumPrincipal(LedZeppelin);

    Leonardo.addEquipamento(Guitarra);
    Lucas.addEquipamento(CaixaDeSom);

    System.out.println(Leonardo);
    System.out.println(Lucas);






    }


}
