import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import api from "../services/api";
import "./Auth.css";
import logo from "../assets/logo.png"

//definição do componente Login
const Login: React.FC = () => {
    //Hook useNavigate permite redirecionar o usuário 
    const navigate = useNavigate();

    //estados para armazenar o email e senha do usuário
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");
    const [emailError, setEmailError] = useState(""); //Estado para armazenar mensagens de erro
    const [senhaError, setSenhaError] = useState(""); //Estado para armazenar mensagens de erro

    //função assincrona para lidar com o login
    const handleLogin = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();      // Previne o comportamento padrão do formulário de recarregar a página.
        setEmailError("");           // Limpa a mensagem de erro do email a cada submissão.
        setSenhaError("");           // Limpa a mensagem de erro da senha

        //Validação do email
        if (!email) {
            setEmailError("O campo email é obrigatório");
            return;
        } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
            setEmailError("Digite um email válido.");
        }

        //Validação da senha
        if (!senha) {
            setSenhaError("O campo senha é obrigatório");
            return;
        }

        if(emailError || senhaError) {
            return; //impede o login se houver erros
        }

        try {
            //Cria um objeto com os dados do usuário
            const usuario = { email, senha };

            //Faz a requisição POST para a rota /login da API, enviando o objeto com os dados do usuário
            const response = await api.post<{ token: string }>("/login", usuario);

            //Armazena o token retornado pela API no localStorage
            localStorage.setItem("token", response.data.token);

            //Redireciona o usuário para a rota /busca
            navigate("/busca");
        } catch (error) {
            //tratamento de erros durante o login
            console.error("Erro ao fazer login:", error);
        }
    };

    return (
        <div className="auth-container">
            <img src={logo} alt="Logo" className=".logo-login"/>
            <h1>Login</h1>
            <form onSubmit={handleLogin} className="auth-form"> {/* Formulário de login que chama handleLogin ao ser submetido. */}
                <input
                    type="email"
                    placeholder="E-mail"
                    value={email}     /* Valor do input vinculado ao estado 'email'. */
                    onChange={(e) => setEmail(e.target.value)} /* Atualiza o estado 'email' quando o input muda. */
                />
                  {emailError && <p style={{ color: "red" }}>{emailError}</p>} {/* Exibe a mensagem de erro do email */}
                <input
                    type="password"
                    placeholder="Senha"
                    value={senha}  /* Valor do input vinculado ao estado 'senha'. */
                    onChange={(e) => setSenha(e.target.value)} /* Atualiza o estado 'senha' quando o input muda. */
                />
                {senhaError && <p style={{ color: "red" }}>{senhaError}</p>} {/* Exibe a mensagem de erro da senha */}
                <button type="submit">Entrar</button>
            </form>
            <p>Não possui cadastro? <a href="/cadastro">Cadastre-se</a></p>
        </div>
    );
};

export default Login;