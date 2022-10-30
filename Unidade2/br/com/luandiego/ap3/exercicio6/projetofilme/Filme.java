package Unidade2.br.com.luandiego.ap3.exercicio6.projetofilme;

public class Filme {
    
    private String titulo;
    private int duracaoMinutos;

    public Filme(String titulo, int duracaoMinutos){
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoMinutos = duracaoEmMinutos;
    }

    public void exibirDuracaoEmHoras(){
        int horas = duracaoMinutos / 60;
        int minutos = duracaoMinutos % 60;
        System.out.println("\n O filme " + this.titulo + " possui " + horas + " horas" + " e " + minutos + " minutos");
    }
}