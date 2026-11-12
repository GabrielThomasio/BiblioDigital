package br.edu.atitus.bibliodigital.entities;

public class LivroFisico extends Livro {
    
    private int quantidadeExemplares;
    private String localizacao;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int quantidadeExemplares, String localizacao) {
        super(titulo, autor, anoPublicacao);
        this.quantidadeExemplares = quantidadeExemplares;
        this.localizacao = localizacao;
    }

    public int getQuantidadeExemplares() {
        return quantidadeExemplares;
    }

    public void setQuantidadeExemplares(int quantidadeExemplares) {
        this.quantidadeExemplares = quantidadeExemplares;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override 
    public String getTipo() {
        return "Livro Físico";
    }

    @Override 
    public String toString() {
        return super.toString() + " - Quantidade de Exemplares: %d - Localização: %s".formatted(quantidadeExemplares, localizacao);
    }
}