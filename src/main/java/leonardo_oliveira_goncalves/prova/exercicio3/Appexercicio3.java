package leonardo_oliveira_goncalves.prova.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Appexercicio3 {
    
    public static void main(String[] args) {
        Aluno leo = new Aluno();
        Aluno novo = leo;
        List<Aluno> nomes = new ArrayList<>();
        
        for (nomes = 0; nomes.size() > 200; nome++){
            nomes.add(novo);
        }
    }
   

}
