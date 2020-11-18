package aep_poo.aep;

public class Cardapio{
    
    int nívelGravidade;
    

    public Cardapio(int nívelGravidade) {
        
        setNívelGravidade(nívelGravidade);
    }

    public int getNívelGravidade() {
        return nívelGravidade;
    }


    public void setNívelGravidade(int nívelGravidade) {
        
        if(nívelGravidade <= 3)
        {
            System.out.println("Nível da gravidade é Baixa!");
        }
        else if(nívelGravidade > 3 ) || (nívelGravidade <=6){
            System.out.println("Nivel de gravidade média");
        }
        else if(nívelGravidade > 6){
            System.out.println("Nível de gravidade Alta!!!!");
        }
        this.nívelGravidade = nívelGravidade;
    }
}
