

import React, { useState } from 'react';
import SelecionarLocalizacao from "../Components/SelecionarLocalizacao";
import ListaDeAtividades from '../Components/ListaAtividades';
import SelecionarTags from '../Components/SelecionarTags';
import SelecionarTipoEncontro from '../Components/SelecionarTipoEncontro';
import Button from "../Components/Button";

    const Atividades: React.FC = () => {

    
    const [tag,setTag ] = useState("");
    const [tipoEncontro,setTipoEncontro ] = useState("");
    const [localizacao, setLocalizacao] = useState("");

    
    
 

       
    const HandleAtividades = async (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault();

        try {
            const filtros = {
                tag,
                tipoEncontro,
                localizacao,
            };

            
        } catch (error) {
            console.error(error); 
        }
    }
    return (
        <div>
            <h1>Buscar Atividades</h1> 
            <p><a href="/CriarAtividade">Criar atividade</a></p>
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











    






