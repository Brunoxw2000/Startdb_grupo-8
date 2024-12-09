package conectageracao.conectageracao;

public class Pessoa {
    
    private String nome;
    private String email;
    private String senha; 
    private String endereco;
    private String papel;
    
    public Pessoa (String nome ,String email,String senha,String endereco,String papel){
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

}
