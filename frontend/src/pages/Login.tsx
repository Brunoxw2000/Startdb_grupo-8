import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../services/api";

//definição do componente Login
const Login: React.FC = () => {
    //Hook useNavigate permite redirecionar o usuário 
    const navigate = useNavigate();

    //estados para armazenar o email e senha do usuário
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");

    //função assincrona para lidar com o login
    const handleLogin = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();      // Previne o comportamento padrão do formulário de recarregar a página.

        try {
            //Cria um objeto com os dados do usuário
            const usuario = { email, senha };

            //Faz a requisição POST para a rota /login da API, enviando o objeto com os dados do usuário
            const response = await api.post<{ token: string }>("/login", usuario);

            //Armazena o token retornado pela API no localStorage
            localStorage.setItem("token", response.data.token);

            //Redireciona o usuário para a rota /dashboard
            navigate("/dashboard");
        } catch (error) {
            //tratamento de erros durante o login
            console.error("Erro ao fazer login:", error);
        }
    };

    return (
        <div>
            <h1>Login</h1>
            <form onSubmit={handleLogin}> {/* Formulário de login que chama handleLogin ao ser submetido. */}
                <input
                    type="email"
                    placeholder="E-mail"
                    value={email}     /* Valor do input vinculado ao estado 'email'. */
                    onChange={(e) => setEmail(e.target.value)} /* Atualiza o estado 'email' quando o input muda. */
                />
                <input
                    type="password"
                    placeholder="Senha"
                    value={senha}  /* Valor do input vinculado ao estado 'senha'. */
                    onChange={(e) => setSenha(e.target.value)} /* Atualiza o estado 'senha' quando o input muda. */
                />
                <button type="submit">Entrar</button>
            </form>
            <p>Não possui cadastro? <a href="/Cadastro">Cadastre-se</a></p>
        </div>
    );
};

export default Login;