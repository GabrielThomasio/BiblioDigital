package br.edu.atitus.bibliodigital.services;

import br.edu.atitus.bibliodigital.entities.Livro;
import br.edu.atitus.bibliodigital.repositories.Livrorepository;

import java.util.List;

public class LivroService {
    private final Livrorepository repository = new Livrorepository();

    public void inserir(Livro livro) {
        if (livro == null)
            throw new RuntimeException("Objeto Nulo");
        if (livro.getTitulo() == null || livro.getTitulo().isBlank())
            throw new RuntimeException("Titulo Invalido");
        livro.setTitulo((livro.getTitulo()).trim());
        repository.inserir(livro);
    }
    public List<Livro> findAll() {
        return repository.findAll();
    }

    public List<Livro> findByTitulo(String parametro) {
        if (parametro == null || parametro.isBlank())
            throw new RuntimeException("Parametro invalido");
        return repository.findByTitulo(parametro);
    }
}
