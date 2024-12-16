interface SelecionarTagsProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}

const SelecionarTags: React.FC<SelecionarTagsProps> = ({ onChange, value }) => {
    const Tags = [
        { id: "0", tag: "Passeio" },
        { id: "1", tag: "Exercício" },
        { id: "2", tag: "Animais" },
        { id: "3", tag: "Cozinha" },
        { id: "4", tag: "Afazeres" },
        { id: "5", tag: "Conversa" }
       
        
    ];
    return (
        <select value={value} onChange={onChange}>
            {Tags.map(tag => (
                <option key={tag.id} value={tag.id}>
                    {tag.tag}
                </option>
            ))}
        </select>
    );
};

export default SelecionarTags;