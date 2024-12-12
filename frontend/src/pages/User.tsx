import React, { useEffect, useState } from "react";
import axios from "axios";

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
    <div style={{ padding: "20px", maxWidth: "600px", margin: "0 auto" }}>
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
  );
};

export default UserPage;