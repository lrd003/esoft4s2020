package aep_poo.aep;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    private String nome;
    private String email;
    private String cpf;
    private String celular;
    private String senha;
    private List<Endereco> endereços = new ArrayList<>();
    private List<Cardapio> cardapios = new ArrayList<>();
    private Endereco endereçoPrincipal;

    public Perfil(String nome, String email, String cpf, String celular, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.celular = celular;
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getSenha() {
        return senha;
    }

    public void addEndereço(Endereco novo) {
        this.endereços.add(novo);
    }

    public void addCardapio(Cardapio novo) {
        this.cardapios.add(novo);
    }

    @Override
    public  String toString() {
        String stringEndereços = "\n---------Endereços---------";
        for (Endereco e : this.endereços) {
            stringEndereços += e.toString();
        }
        
        return "\n" + "---------PERFIL---------" 
            + "\n"
            +"[Nome ="  + nome + "\n" 
            +"Email = "  + email + "\n" 
            + "CPF = "  + cpf +  "\n"
            + "Celular = "  + celular + "\n" 
            + "Senha = "  + senha +"]" + "\n"
            + stringEndereços.substring(0, stringEndereços.length()-1) 
            + "\n" + "\n---------Endereço Principal---------" + endereçoPrincipal;
    }

	public void setEndereçoPrincipal(Endereco endereçoPrincipal) {
        if (!temEndereço(endereçoPrincipal)) {
            throw new RuntimeException("O endereço informado não consta nos endereços da pessoa!");
        }
        this.endereçoPrincipal = endereçoPrincipal;
    }
    private boolean temEndereço(Endereco endereçoProcurado) {
        boolean achouEndereço = false;
        for (Endereco e : this.endereços) {
            final boolean logradouroIgual = e.getLogradouro().equals(endereçoProcurado.getLogradouro());
            final boolean númeroIgual = e.getNúmero().equals(endereçoProcurado.getNúmero());
            if (logradouroIgual && númeroIgual) {
                achouEndereço = true;
                break;
            }
        }
        return achouEndereço;
    }
    public Endereco getEndereçoPrincipal() {
        return endereçoPrincipal;
    }
}

