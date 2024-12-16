import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import Cadastro from "./pages/Cadastro";
import Login from "./pages/Login";
import User from "./pages/User";
import CriarAtividade from "./pages/CriarAtividade";


function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Navigate to="/criar" />} />
        <Route path="/criar" element={<CriarAtividade />} />
        <Route path="/login" element={<Login />} />
        <Route path="/cadastro" element={<Cadastro />} />
        <Route path="/user" element={<User />} />
      </Routes>

    </BrowserRouter>
  );
}

export default App;