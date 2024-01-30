@Tabela(nome = "ExemploTabela")
public class MinhaClasse {

    public static void main(String[] args) {
        Class<?> minhaClasse = MinhaClasse.class;

        // Verifica se a anotação está presente na classe
        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação
            Tabela tabelaAnnotation = minhaClasse.getAnnotation(Tabela.class);

            // Obtém o nome da tabela da anotação
            String nomeDaTabela = tabelaAnnotation.nome();

            // Imprime o nome da tabela no console
            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A anotação @Tabela não está presente nesta classe.");
        }
    }
}
