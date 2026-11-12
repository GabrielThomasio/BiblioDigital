import br.edu.atitus.bibliodigital.LivroDigital;
import br.edu.atitus.bibliodigital.entities.Livro;
import br.edu.atitus.bibliodigital.entities.LivroFisico;

<Livro> void main() {
    List<Livro> livros = new ArrayList<>();

    int opcao;
    do {
        mostrarMenu();
        opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));
        switch (opcao) {
            case 1 -> cadastrar((List<br.edu.atitus.bibliodigital.entities.Livro>) livros);
            case 2 -> imprimirLivros((List<br.edu.atitus.bibliodigital.entities.Livro>) livros);
            case 0 -> IO.println("Até logo!!!");
            default -> IO.println("Opção Inválida");
        }
        IO.readln("Pressione Enter para Continuar...");
    } while (opcao != 0);
}

void mostrarMenu() {
    IO.println("""
            ========== BIBLIODIGITAL ==========
            1 - Cadastrar livro
            2 - Listar livros
            0 - Sair
            ===================================
            """);
}

void cadastrar(List<Livro> livros) {
    String tipoLivro = """
            Qual tipo de livro deseja cadastrar?
            1 - Livro físico
            2 - Livro digital
            3 - Audiolivro

            Escolha uma opção:
            """;
    int opcao = Integer.parseInt(IO.readln(tipoLivro));
    if (opcao <1 || opcao >3) {
        IO.println("Opção de tipo de livro inválida");
        return;
    }
    Livro novoLivro;
    String titulo = IO.readln("Digite o título do livro: ");
    String autor = IO.readln("Digite o autor do livro: ");
    int anoPublicacao = Integer.parseInt(IO.readln("Digite o ano de publicação do livro: "));
    if (opcao == 1) {
        int quantidadeExemplares = Integer.parseInt(IO.readln("Digite o número de exemplares: "));
        String localizacao = IO.readln("Digite a localização: ");
        novoLivro = new LivroFisico(titulo, autor, anoPublicacao, quantidadeExemplares, localizacao);
    } else if (opcao == 2) {
        String formato = IO.readln("Digite o formato do arquivo: ");
        double tamanhoArquivo = Double.parseDouble(IO.readln("Digite o tamanho do arquivo: "));        
        novoLivro = new LivroDigital(titulo, autor, anoPublicacao, formato, tamanhoArquivo);
    } else {
        int duracao = Integer.parseInt(IO.readln("Digite a duração do audiolivro: "));
        String narrador = IO.readln("Digite o nome do narrador: ");
        novoLivro = new AudioLivro(titulo, autor, anoPublicacao, duracao, narrador);
    }  
    livros.add(novoLivro);
}

void imprimirLivros(List<Livro> livros) {
    if (livros.isEmpty()) {
        IO.println("Não existe nenhum livro cadastrado");
    } else {
        for (Livro livro : livros) {
            IO.println(livro);
            IO.println("Tipo: " + livro.getTipo());
        }
    }
}