package leonardo_oliveira_goncalves.entrega.atividade.avaliativapoo;

public class Banda{

        private String nomeAlbum;
        private String anoAlbum;
    
        public Banda(String nomeAlbum, String  anoAlbum) {
            this.nomeAlbum = nomeAlbum;
            this.anoAlbum = anoAlbum;
        }
        public String getNomeAlbum() {
            return nomeAlbum;
        }
        public String getAnoAlbum() {
            return anoAlbum;
        }
        @Override
        public String toString() {
            return "Nome do Album: " + nomeAlbum + ", Ano de Lançamento: " + anoAlbum + "\n";
        }

}
