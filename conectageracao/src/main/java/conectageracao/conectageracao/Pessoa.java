package conectageracao.conectageracao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String nome;
    @Column(length = 30, nullable = false)
    private String email;
    @Column(length = 30, nullable = false)
    private String senha;
    @Column(length = 50, nullable = false)
    private String endereco;
    @Column(nullable = false)
    private String papel;
<<<<<<< HEAD

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String senha, String endereco, String papel) {
=======
    
    protected Pessoa(){ }

    public Pessoa (String nome ,String email,String senha,String endereco,String papel){
>>>>>>> 8afbd3f2f7b3ecadd0fc9e3fab0a6c4d5faf6448
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPapel() {
        return papel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public void setId(Integer pessoaId) {
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }

}
