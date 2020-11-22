package leonardo_oliveira_goncalves.entrega.atividade.avaliativapoo;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nomePessoa;
    private List<Banda> Bandas = new ArrayList<>();
    private List<Equipamentos> ListaDeEquipamento = new ArrayList<>();
    private Banda AlbumPreferido;
    private Equipamentos equipamentos;

    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void addBanda(Banda novaBanda) {
        this.Bandas.add(novaBanda);
    }

    public void addEquipamento(Equipamentos novoEquipamento){
        this.ListaDeEquipamento.add(novoEquipamento);
    }

    @Override
    public  String toString() {
        String stringBandas = "\n";
        for (Banda e : this.Bandas) {
            stringBandas += e.toString();
        }
        
        return "------------------------------------------------------------------"
            +"\nPessoa: \nNome: " + nomePessoa 
            + stringBandas.substring(0, stringBandas.length()-1) 
            + "\nAlbum Preferido: " + AlbumPreferido 
            + "\nEquipamento Comprado: " + equipamentos + "\n"
            + "------------------------------------------------------------------";
    }

	public void setAlbumPrincipal(Banda AlbumPreferido) {
        if (temBanda(AlbumPreferido)){
            throw new RuntimeException("O Album procurado não se encontra!!!");
        }
        this.AlbumPreferido =  AlbumPreferido;
    }
    private boolean temBanda (Banda BandasEscolhidas){
        boolean ExisteBanda = false;
        for (Banda e : this.Bandas) {
            final boolean BandasIgual = e.getNomeAlbum().equals(BandasEscolhidas.getAnoAlbum());
            final boolean anoIgual = e.getAnoAlbum().equals(BandasEscolhidas.getAnoAlbum());
            if (BandasIgual && anoIgual) {
                ExisteBanda = true;
                break;
            }
        }
        return ExisteBanda;
    }

    public Banda getAlbumPreferido() {
        return AlbumPreferido;
    }
}
