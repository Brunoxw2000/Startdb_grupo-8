import React, { useState } from 'react';
import SelecionarLocalizacao from "../components/SelecionarLocalizacao";
import ListaDeAtividades from '../components/ListaAtividades';
import SelecionarTags from '../components/SelecionarTags';
import SelecionarTipoEncontro from '../components/SelecionarTipoEncontro';
import Button from "../components/Button";

const Atividades: React.FC = () => {

    const [tag, setTag] = useState("");
    const [tipoEncontro, setTipoEncontro] = useState("");
    const [localizacao, setLocalizacao] = useState("");
    const [filtros, setFiltros] = useState({
        modo: "",
        localizacao: "",
        tag: "",
    }
    );
    //h minusculo porque é uma função
    const handleAtividades = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
        setFiltros({ modo: tipoEncontro, localizacao: localizacao, tag: tag });
    }

    const handleResetForm = () => {
        setFiltros({ modo: "", localizacao: "", tag: "" });
        setTag("");
        setTipoEncontro("");
        setLocalizacao("");
    }
    return (
        <div>
            <h1>Buscar Atividades</h1>
            <p><a href="/criar">Criar atividade</a></p>
            <h2>Filtros</h2>

            <form onSubmit={handleAtividades} onReset={handleResetForm}>
                <div style={{ display: 'flex' }}>
                    <SelecionarTags
                        value={tag}
                        onChange={event => setTag(event.target.value)}
                    />
                    &emsp;
                    <SelecionarTipoEncontro
                        value={tipoEncontro}
                        onChange={event => setTipoEncontro(event.target.value)}
                    />
                    &emsp;
                    <SelecionarLocalizacao
                        value={localizacao}
                        onChange={event => setLocalizacao(event.target.value)}
                    />
                </div>
                <Button type="submit" onClick={() => { }}>Buscar</Button>
                &emsp;
                <Button type="reset" onClick={() => { }}>Limpar</Button>

                <ListaDeAtividades filtros={filtros} />
            </form>

        </div>
    );
};

export default Atividades;


















