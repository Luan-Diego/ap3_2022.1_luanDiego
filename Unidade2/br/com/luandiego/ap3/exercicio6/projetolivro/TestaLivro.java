package Unidade2.br.com.luandiego.ap3.exercicio6.projetolivro;


public class TestaLivro {
    public static void main(String[] args) throws Exception {
        Livro narutoShippuden = new Livro("Naruto Manga 72");
        narutoShippuden.setQtdPaginas(205);

        System.out.println("\n O livro "+ narutoShippuden.getTitulo() +" possui "+ narutoShippuden.getQtdPaginas()+" páginas");

        narutoShippuden.setPaginasLidas(34);
        narutoShippuden.verificarProgresso();

        narutoShippuden.setPaginasLidas(34);
        narutoShippuden.verificarProgresso();

        Livro meuLivro = new Livro("O diario do Chaves", 172, 48);
        System.out.println("\n O livro "+ meuLivro.getTitulo() +" possui "+ meuLivro.getQtdPaginas()+" páginas");

        meuLivro.setPaginasLidas(48);
        meuLivro.verificarProgresso();
    }
}