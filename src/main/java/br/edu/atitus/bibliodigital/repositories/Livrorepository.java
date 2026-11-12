package br.edu.atitus.bibliodigital.repositories;

import br.edu.atitus.bibliodigital.entities.Livro;
import java.util.ArrayList;
import java.util.List;


public class Livrorepository {
    private List<Livro> acervo = new ArrayList<>();

    public List<Livro> findAll() {
        return acervo;
    }

    public void inserir(Livro livro) {
        acervo.add(livro);
    }

    public List<Livro> findByTitulo(String parametro) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro: acervo) {
            if (Livro.getTitulo().toUpperCase().contains(parametro.toUpperCase()) ) {
                resultado.add(livro);
            }
        }
        return resultado;
    }
}

