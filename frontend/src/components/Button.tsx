import React from 'react';

interface ButtonProps {
    onClick: () => void;
    type?: 'button' | 'submit' | 'reset';
    children: React.ReactNode;
    disabled?: boolean;
}

const Button: React.FC<ButtonProps> = ({ onClick, children, disabled }) => {
    return (
        <button onClick={onClick} disabled={disabled}>
            {children}
        </button>
    );
};

export default Button;