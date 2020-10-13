package leonardo_oliveira_goncalves.prova_.exercicio4;

public class Pastelaria {

    private boolean aberto = false;
    private String nome;
}
public void nome(String nome, boolean aberto){

    this.nome = nome;
    this.aberto = aberto;

}
public void aberto()
{
    aberto = true;
}
public boolean isAberto(){
    return aberto;
}

public String getNome(){
    return nome;
}

