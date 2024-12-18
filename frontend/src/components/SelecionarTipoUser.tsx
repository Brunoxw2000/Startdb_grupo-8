interface SelecionarTipoUserProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}
//o tipo de usuário precisa ser para diferenciar idoso e voluntário
//vamos utilizar no momento?

const SelecionarTipoUser: React.FC<SelecionarTipoUserProps> = ({ onChange, value }) => {
    return (
        <div>
            <select value={value} onChange={onChange}>
                <option value="">Selecione uma das opções</option>
                <option value="2">Quero ajudar</option>
                <option value="3">Quero receber ajuda</option>
            </select>
        </div>
    );
};

export default SelecionarTipoUser;