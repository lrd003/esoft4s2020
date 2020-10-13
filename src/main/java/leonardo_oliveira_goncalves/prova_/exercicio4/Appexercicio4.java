package leonardo_oliveira_goncalves.prova_.exercicio4;

public class Appexercicio4 {
    
    public static void main(String[] args) {
        Pastelaria Pastelao = new Pastelaria("Casa do Pastela");
        Pastelao.aberto();

        boolean aberto = Pastelao.isAberto();
        Pastelaria nome = Pastelao;
        
		System.out.println("A pastelaria" + nome + ", esta aberta? " + aberto);
    }
    
    



}
