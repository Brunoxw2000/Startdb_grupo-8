interface SelecionarTagsProps {
    onChange: (event: React.ChangeEvent<HTMLSelectElement>) => void;
    value: string;
}

const SelecionarTags: React.FC<SelecionarTagsProps> = ({ onChange, value }) => {
    const Tags = [
        { id: "", tag: "Selecione" },
        { id: "passeio", tag: "Passeio" },
        { id: "exercício", tag: "Exercício" },
        { id: "animais", tag: "Animais" },
        { id: "cozinha", tag: "Cozinha" },
        { id: "afazeres", tag: "Afazeres" },
        { id: "conversa", tag: "Conversa" }
    ];
    return (
        <div>
            <label>Tags</label>
            <select value={value} onChange={onChange}>
                {Tags.map(tag => (
                    <option key={tag.id} value={tag.id}>
                        {tag.tag}
                    </option>
                ))}
            </select>
        </div>
    );
};

export default SelecionarTags;