package br.edu.atitus.bibliodigital.entities;

public class AudioLivro extends Livro {
    private int duracao;
    private String narrador;

    public AudioLivro(String titulo, String autor, int anoPublicacao, int duracao, String narrador) {
        super(titulo, autor, anoPublicacao);
        this.duracao = duracao;
        this.narrador = narrador;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    @Override 
    public String getTipo() {
        return "Audiolivro";
    }

    @Override
    public String toString() {
        return super.toString() + " - Duração: %d minutos - Narrador: %s".formatted(duracao, narrador);
    }
}