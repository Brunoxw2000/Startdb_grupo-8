import { useState, useEffect } from 'react';
import api from './services/api';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    const fetchMessage = async () => {
      try {
        const response = await api.get('/');
        setMessage(response.data as string); // ou response.data.message se o backend enviar um objeto com a mensagem
      } catch (error) {
        console.error("Erro ao buscar mensagem:", error);
        setMessage("Erro ao conectar com o servidor.");
      }
    };

    fetchMessage();
  }, []); // Certifique-se de que o array de dependências esteja vazio para executar o useEffect apenas uma vez

  return (
    <div className="App">
      <h1>{message}</h1>
    </div>
  );
}

export default App;