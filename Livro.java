public class Livro{
    String titulo;
    String autor;
    int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;

    }
    @Override
    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\n-----------------------";
    }
    public String getTitulo() {
        return titulo;
    }
}
