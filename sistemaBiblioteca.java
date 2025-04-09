import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class sistemaBiblioteca {
    private Queue<String> filaDeEspera;
    private Stack<Livro> historicoNavegacao;

    public sistemaBiblioteca() {
        filaDeEspera = new LinkedList<>();
        historicoNavegacao = new Stack<>();
    }

    // Fila de espera dos livros
    public void adicionarUsuarioNaFila(String nome) {
        filaDeEspera.add(nome);
        System.out.println("Usuario " + nome + "adicionado a fila.");
    }

    public void atenderUsuario() {
        if (!filaDeEspera.isEmpty()) {
            String nome = filaDeEspera.poll();
            System.out.println("Usuario " + nome + " recebeu o livro.");
        } else {
            System.out.println("Nenhum usuario na fila.");
        }
    }

    public void exibirFilaDeEspera() {
        System.out.println("Fila de espera: " + filaDeEspera);
    }
    // Historico de navegacao
    public void visualizarLivro(Livro livro) {
        historicoNavegacao.push(livro);
        System.out.println("Usuário visualizou: " + livro.getTitulo());
    }
    public void exibirHistoricoNavegacao() {
        System.out.println("\nHistórico de navegação:");
        Stack<Livro> copia = (Stack<Livro>) historicoNavegacao.clone();
        int i = 1;
        while (!copia.isEmpty()) {
            System.out.println(i + ". " + copia.pop());
            i++;
        }
}
}
