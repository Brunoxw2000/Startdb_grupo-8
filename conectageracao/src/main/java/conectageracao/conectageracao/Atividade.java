package conectageracao.conectageracao;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "atividades")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 1000)
    private String descricao;

    @ElementCollection
    @CollectionTable(name = "atividades_tags", joinColumns = @jakarta.persistence.JoinColumn(name = "atividade_id"))
    @Column(name = "tags")
    private Set<String> tags;

    @Column(nullable = false)
    private String localizacao;

    @Column(nullable = false)
    private boolean modo;

    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Atividade() {
    }

    public Atividade(String nome, String descricao, Set<String> tags, String localizacao, boolean modo, LocalDate data,
            Pessoa pessoa) {
        this.nome = nome;
        this.descricao = descricao;
        this.tags = tags;
        this.localizacao = localizacao;
        this.modo = modo;
        this.data = data;
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<String> getTags() {
        return tags;
    }

    public Set<String> getNecessidades() {
        return tags;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isModo() {
        return modo;
    }

    public LocalDate getData() {
        return data;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Atividade orElse(Object object) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'orElse'");
    }
}