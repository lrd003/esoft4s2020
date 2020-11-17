package aep_poo.aep;

public class Endereco {
    private String logradouro;
    private String número;

    public Endereco(String logradouro, String número) {
        this.logradouro = logradouro;
        this.número = número;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNúmero() {
        return número;
    }
    @Override
    public String toString() {
        return "Endereço [logradouro=" + logradouro + ", número=" + número +"]";
    }

}