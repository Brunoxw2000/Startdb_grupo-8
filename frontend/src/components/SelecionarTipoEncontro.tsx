import React from "react";

interface SelecionarTipoEncontroProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}

const SelecionarTipoEncontro: React.FC<SelecionarTipoEncontroProps> = ({ onChange, value }) => {
    const encontros = [
        
        { id: "0", tipo: "Presencial" },
        { id: "1", tipo: "Remoto" }
        
    ];
    return (
        <select value={value} onChange={onChange}>
            {encontros.map(encontro => (
                <option key={encontro.id} value={encontro.id}>
                    {encontro.tipo}
                </option>
            ))}
        </select>
    );
};

export default SelecionarTipoEncontro;