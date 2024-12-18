interface SelecionarTipoUserProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}


const SelecionarTipoUser: React.FC<SelecionarTipoUserProps> = ({ onChange, value }) => {
    return (
        <div>
            <select value={value} onChange={onChange}>
                <option value="">Selecione uma das opções</option>
                <option value="voluntario">Quero ajudar</option>
                <option value="idoso">Quero receber ajuda</option>
            </select>
        </div>
    );
};

export default SelecionarTipoUser;