package br.edu.atitus.bibliodigital.entities;

public abstract class Livro {

    private static String titulo;
    private String autor;
    private int anoPublicacao;

    private final int anoPublicacaoMinimo = 1450;

    // Método construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public static String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao < anoPublicacaoMinimo) {
            System.out.println("Ano de publicação inválido. O ano mínimo é " + anoPublicacaoMinimo);
            return;
        }
        this.anoPublicacao = anoPublicacao;
    }

    public abstract String getTipo(); 
    


    @Override 
    public String toString() {
        return "Título: %s - Autor: %s - Ano de Publicação: %d".formatted(titulo, autor, anoPublicacao);
    }

    public final int calcularIdade() {
        return java.time.Year.now().getValue() - anoPublicacao;
    }
}