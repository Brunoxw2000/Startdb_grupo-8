interface SelecionarTipoUserProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}

const SelecionarTipoUser: React.FC<SelecionarTipoUserProps> = ({ onChange, value }) => {
    return (
        <select value={value} onChange={onChange}>
            <option value="">Selecione uma das opções</option>
            <option value="2">Quero ajudar</option>
            <option value="3">Quero receber ajuda</option>
        </select>
    );
};

export default SelecionarTipoUser;