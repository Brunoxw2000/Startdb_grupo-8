import axios from 'axios';

const api = axios.create({
    baseURL: 'http://localhost:8080', // URL do backend Spring Boot. A porta 8080 é a porta padrão do Spring Boot. Se configurou uma porta diferente, ajuste-o aqui.
});

export default api;