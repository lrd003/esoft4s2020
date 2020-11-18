package aep_poo.aep;

public class Endereco {
    private String logradouro;
    private String número;
    private String cidade;
    private String bairro;
    private String país;
    private String estado;

    public Endereco(String logradouro, String número, String cidade, String bairro, String país, String estado) {
        this.logradouro = logradouro;
        this.número = número;
        this.cidade = cidade;
        this.bairro = bairro;
        this.país = país;
        this.estado = estado;

    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNúmero() {
        return número;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }   
    public String getBairro() {
        return bairro;
    }
    public String getPaís() {
        return país;
    }

    @Override
    public String toString() {
        return "\n"
        +"[logradouro = " + logradouro + "\n" 
        +"número = " + número + "\n"
        +"Cidade = " + cidade + "\n"
        +"Bairro = " + bairro + "\n"
        +"Estado = " + estado + "\n"
        +"País = " + país + "]\n";
    }

}