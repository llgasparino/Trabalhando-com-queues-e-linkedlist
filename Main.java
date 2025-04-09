import java.util.LinkedList;

    public class Main {
        public static void main(String[] args) {
            sistemaBiblioteca sistema = new sistemaBiblioteca();

            Livro l1 = new Livro("O Investidor Inteligente", "Benjamin Graham", 1949);
            Livro l2 = new Livro("Ações Comuns, Lucros Extraordinários", "Philip Fisher", 1958);
            Livro l3 = new Livro("Os Ensaios de Warren Buffett", "Warren Buffett", 1997);
            Livro l4 = new Livro("Pai Rico, Pai Pobre", "Robert Kiyosaki", 1997);
            Livro l5 = new Livro("O Homem Mais Rico da Babilônia", "George S. Clason", 1926);
            Livro l6 = new Livro("Do Mil ao Milhão", "Thiago Nigro", 2018);
            Livro l7 = new Livro("O Jeito Peter Lynch de Investir", "Peter Lynch", 1989);
            Livro l8 = new Livro("Investimentos – Os Segredos de George Soros e Warren Buffett", "Mark Tier", 2005);
            Livro l9 = new Livro("Os Axiomas de Zurique", "Max Gunther", 1985);
            Livro l10 = new Livro("Antifrágil", "Nassim Nicholas Taleb", 2012);

            sistema.adicionarUsuarioNaFila("Samara");
            sistema.adicionarUsuarioNaFila("Luiz");
            sistema.atenderUsuario();
            sistema.exibirFilaDeEspera();

            //Historico de navegacao
            sistema.visualizarLivro(l6);
            sistema.visualizarLivro(l10);
            sistema.exibirHistoricoNavegacao();
            }
        }

