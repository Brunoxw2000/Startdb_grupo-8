import React from "react";
import api from "../services/api";
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import SelecionarTipoUser from "../components/SelecionarTipoUser";
import SelecionarLocalizacao from "../components/SelecionarLocalizacao";
import Button from "../components/Button";

const Cadastro: React.FC = () => {
    const navigate = useNavigate();

    const [nome, setNome] = useState("");
    const [email, setEmail] = useState("");
    const [senha, setSenha] = useState("");
    const [tipoUsuario, setTipoUsuario] = useState("");
    const [localizacao, setLocalizacao] = useState("");

    const handleCadastro = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();

        try {
            const novoUsuario = {
                nome,
                email,
                senha,
                tipoUsuario,
                localizacao,
            };

            await api.post("/usuarios", novoUsuario);
            navigate("/login");
        } catch (error) {
            console.error(error);
        }
    };
    return (
        <div>
            <h1>Cadastro</h1>
            <form onSubmit={handleCadastro}>
                <input
                    type="text"
                    placeholder="Nome"
                    value={nome}
                    onChange={event => setNome
                        (event.target.value)}
                />
                <input
                    type="email"
                    placeholder="E-mail"
                    value={email}
                    onChange={event => setEmail
                        (event.target.value)}
                />
                <SelecionarTipoUser
                    value={tipoUsuario}
                    onChange={event => setTipoUsuario(event.target.value)}
                />
                <SelecionarLocalizacao
                    value={localizacao}
                    onChange={event => setLocalizacao(event.target.value)}
                />
                <input
                    type="password"
                    placeholder="Senha"
                    value={senha}
                    onChange={event => setSenha(event.target.value)}
                />
                <Button type="submit" onClick={() => { }}>Cadastrar</Button>
            </form>
            <p>Já possui cadastro? <a href="/login">Faça login</a></p>

        </div>
    );
};

export default Cadastro;
