package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro = new Livro("Abra Cadabra", 300);

        System.out.println(livro);
        System.out.println(gato);

/*        int a = 8;
        int b = 4;
        System.out.println("Hello Word!" + (a+b));*/
    }

    static class Livro{
        private String nome;
        private Integer numpag;

        public Livro(String nome, Integer numpag) {
            this.nome = nome;
            this.numpag = numpag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumpag() {
            return numpag;
        }

        public void setNumpag(Integer numpag) {
            this.numpag = numpag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numpag=" + numpag +
                    '}';
        }
    }
}
