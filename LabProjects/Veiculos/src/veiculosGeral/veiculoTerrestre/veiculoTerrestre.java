package veiculosGeral.veiculoTerrestre;

    public abstract class veiculoTerrestre {
        private String nome;
        private String fabricante;
        private String cor;
        private String fabricacao;
        private String ocupantes;
        private double preco;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getFabricante() {
            return fabricante;
        }

        public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public String getFabricacao() {
            return fabricacao;
        }

        public void setFabricacao(String fabricacao) {
            this.fabricacao = fabricacao;
        }

        public String getOcupantes() {
            return ocupantes;
        }

        public void setOcupantes(String ocupantes) {
            this.ocupantes = ocupantes;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public abstract void locomover();
    }
