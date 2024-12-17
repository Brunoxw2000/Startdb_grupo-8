

import React, { useState } from 'react';
import SelecionarLocalizacao from "../components/SelecionarLocalizacao";
import ListaDeAtividades from '../components/ListaAtividades';
import SelecionarTags from '../components/SelecionarTags';
import SelecionarTipoEncontro from '../components/SelecionarTipoEncontro';
import Button from "../components/Button";

    const Atividades: React.FC = () => {

    
    const [tag,setTag ] = useState("");
    const [tipoEncontro,setTipoEncontro ] = useState("");
    const [localizacao, setLocalizacao] = useState("");

    
    
 

       
    const HandleAtividades = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();
    }
    return (
        <div>
            <h1>Buscar Atividades</h1> 
            <p><a href="/criar">Criar atividade</a></p>
            <h2>Filtros</h2>
             
            
            <form onSubmit={HandleAtividades}>
                <SelecionarTags
                    value={tag} 
                    onChange={event => setTag(event.target.value)}
                                        
                />
                <SelecionarTipoEncontro
                    value={tipoEncontro}
                    onChange={event =>setTipoEncontro(event.target.value)}
                />
                
                <SelecionarLocalizacao
                    value={localizacao}
                    onChange={event => setLocalizacao(event.target.value)}
    
                />
                <Button type="submit" onClick={() => { }}>Buscar</Button>
                
                <ListaDeAtividades
                filtros = {[tag,tipoEncontro, localizacao,"",""]} 
                />
    
            </form>

            

        </div>
    );

};
    
export default Atividades;











    






