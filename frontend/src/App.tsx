import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import Cadastro from "./Pages/Cadastro";
import Login from "./Pages/Login";
import User from "./Pages/User";
import CriarAtividade from "./Pages/CriarAtividade";
import Atividades from "./Pages/Atividades";


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navigate to="/CriarAtividade" />} />
        <Route path="/CriarAtividade" element={<CriarAtividade />} />
        <Route path="/login" element={<Login />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/user" element={<User />} />
        <Route path="/busca" element={<Atividades/>} />
      </Routes>

    </BrowserRouter>
  );
}

export default App;