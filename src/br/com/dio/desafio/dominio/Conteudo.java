package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;
    private NivelDeDificuldade nivelDeDificuldade;
    private Set<Tecnologias> tecnologias = new LinkedHashSet<>();

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public NivelDeDificuldade getNivelDeDificuldade() {
        return nivelDeDificuldade;
    }

    public void setNivelDeDificuldade(NivelDeDificuldade nivelDeDificuldade) {
        this.nivelDeDificuldade = nivelDeDificuldade;
    }
}
