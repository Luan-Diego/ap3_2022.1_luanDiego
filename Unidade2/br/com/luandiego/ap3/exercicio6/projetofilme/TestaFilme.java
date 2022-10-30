package Unidade2.br.com.luandiego.ap3.exercicio6.projetofilme;

public class TestaFilme {
    public static void main(String[] args) throws Exception {
        Filme umFilmeQualquer = new Filme("Psicopata Americano", 144);
        umFilmeQualquer.exibirDuracaoEmHoras();

        Filme meuFilmeFavorito = new Filme("South Park Bigger Longer & Uncut", 121);
        meuFilmeFavorito.setDuracaoEmMinutos(121);
        meuFilmeFavorito.exibirDuracaoEmHoras();

        System.out.println("\n Os filmes no catálogo são " + umFilmeQualquer.getTitulo() + " e " + meuFilmeFavorito.getTitulo());
    }
}