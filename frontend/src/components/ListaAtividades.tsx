
import { useState, useEffect } from 'react';
import api from "../services/api";


function ListaDeAtividades(filtros: any) {
    // Estado para armazenar a lista de Atividades
    const [Atividades, setAtividades] = useState<string[]>([]);
    // Estado para gerenciar o carregamento
    const [carregando, setCarregando] = useState<boolean>(true);
    // Estado para gerenciar erros
    const [erro, setErro] = useState<string | undefined> (undefined);
    

    // useEffect para fazer a requisição à API assim que o componente for montado
    useEffect(() => {
        // Fazendo a requisição GET para o backend usando axios
            api.post('/busca/atividades',filtros).then((response) => {
                setAtividades(response.data as string[])  // Armazena os dados recebidos no estado
                setCarregando(false);         // Finaliza o carregamento
            })
            .catch((error) => {
                setErro("Erro ao carregar as Atividades");
                setCarregando(false);         // Finaliza o carregamento, mesmo em erro
            });
    }, []);  // O array vazio garante que a requisição seja feita apenas uma vez, na montagem do componente

    // Exibe um indicador de carregamento enquanto os dados não são carregados
    if (carregando) {
        return <div>Carregando...</div>;
    }

    // Exibe uma mensagem de erro caso ocorra um erro
    if (erro) {
        return <div>{erro}</div>;
    }

    

    return (
        <div>
            <h1>Lista de Atividades</h1>
            <ul>
                {Atividades.map((Atividade) => (
                    <li key={Atividade}>
                        {Atividade}  
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default ListaDeAtividades;