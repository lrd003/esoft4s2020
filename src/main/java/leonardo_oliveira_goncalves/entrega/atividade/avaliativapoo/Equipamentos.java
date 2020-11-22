package leonardo_oliveira_goncalves.entrega.atividade.avaliativapoo;

public class Equipamentos {
    
    private String nomeEquipamento;
    private int qntDeEquipamento;

    public void Equipamento(int qntDeEquipamento, String nomeEquipamento) {
        this.qntDeEquipamento = qntDeEquipamento;
        this.nomeEquipamento = nomeEquipamento;
    }

    public int getQntDeEquipamento() {
        return qntDeEquipamento;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setQuantidadeEquipamnto(int qntDeEquipamento) {
        if (qntDeEquipamento < 0) {
            throw new RuntimeException("Quantidade de Equipamento não pode ser 0!!!");
        }
        this.qntDeEquipamento = qntDeEquipamento;
    }

    @Override
    public String toString() {
         return "Quantidade Equipamento: " + qntDeEquipamento + ", Nome do Equipamento: " + nomeEquipamento + "\n";
     }


}
