import React from "react";

interface SelecionarLocalizacaoProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}

const SelecionarLocalizacao: React.FC<SelecionarLocalizacaoProps> = ({ onChange, value }) => {
    const localizacoes = [
        { id: "0", nome: "Sua localização" },
        { id: "1", nome: "Aracaju - SE" },
        { id: "2", nome: "Belém - PA" },
        { id: "3", nome: "Belo Horizonte - MG" },
        { id: "4", nome: "Boa Vista - RR" },
        { id: "5", nome: "Brasília - DF" },
        { id: "6", nome: "Campo Grande - MS" },
        { id: "7", nome: "Cuiabá - MT" },
        { id: "8", nome: "Curitiba - PR" },
        { id: "9", nome: "Florianópolis - SC" },
        { id: "10", nome: "Fortaleza - CE" },
        { id: "11", nome: "Goiânia - GO" },
        { id: "12", nome: "João Pessoa - PB" },
        { id: "13", nome: "Macapá - AP" },
        { id: "14", nome: "Maceió - AL" },
        { id: "15", nome: "Manaus - AM" },
        { id: "16", nome: "Natal - RN" },
        { id: "17", nome: "Palmas - TO" },
        { id: "18", nome: "Porto Alegre - RS" },
        { id: "19", nome: "Porto Velho - RO" },
        { id: "20", nome: "Recife - PE" },
        { id: "21", nome: "Rio Branco - AC" },
        { id: "22", nome: "Rio de Janeiro - RJ" },
        { id: "23", nome: "Salvador - BA" },
        { id: "24", nome: "São Luís - MA" },
        { id: "25", nome: "São Paulo - SP" },
        { id: "26", nome: "Teresina - PI" },
        { id: "27", nome: "Vitória - ES" }
    ];
    return (
        <select value={value} onChange={onChange}>
            {localizacoes.map(localizacao => (
                <option key={localizacao.id} value={localizacao.id}>
                    {localizacao.nome}
                </option>
            ))}
        </select>
    );
};

export default SelecionarLocalizacao;