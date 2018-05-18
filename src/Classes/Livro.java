package Classes;

public class Livro {

    private Integer id = 0;
    private String titulo = "";
    private String autor = "";
    private String editora = "";

    private static Livro livro = null;

    public static Livro get() {
        if (livro == null) {
            livro = new Livro();
        }
        return livro;
    }

    public String getLivro() {
        return id + ";" + titulo + ";" + autor + ";" + editora;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
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

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
