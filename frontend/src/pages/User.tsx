import React, { useEffect, useState } from "react";
import axios from "axios";
import Button from "../components/Button";
import "./User.css";
import { Link } from "react-router-dom";
import logo from "../assets/logo.png";

type User = {
  name: string;
  email: string;
  endereco: string;
  papel: string
}

const UserPage: React.FC = () => {
  const [user, setUser] = useState<User | null>(null);

  useEffect(() => {
    axios.get<User>("http://localhost:8080/usuarios")
      .then(response => {
        setUser(response.data);
      })
      .catch(error => {
        console.error("Erro ao buscar o usuário", error);
      });
  }, []);

  return (
    <div className="page-container">
      <nav className="navbar">
        <Link to="/"><img src={logo} alt="Logo" className="logo" /></Link>
        <Button variant= "reset" type="button" onClick={() => { window.location.href = '/login'; }}>Sair</Button>
      </nav>
      <div className="informacoes-container">
        <h1>Informações do Usuário</h1>
        {user ? (
          <div>
            <p><strong>Nome:</strong> {user.name}</p>
            <p><strong>Email:</strong> {user.email}</p>
            <p><strong>Localização:</strong> {user.endereco}</p>
            <p><strong>Você é:</strong> {user.papel}</p>
            <p><a href="/busca">Voltar</a></p>
          </div>
        ) : (
          <p>Carregando informações do usuário...</p>
        )}
      </div>
    </div>
  );
};

export default UserPage;