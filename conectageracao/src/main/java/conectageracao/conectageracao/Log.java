package conectageracao.conectageracao;

public class Log {

    private String email;
    private String senha;
    
    public Log(String email,String senha){
        this.email=email;
        this.senha=senha;
    }

    public String getemail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
