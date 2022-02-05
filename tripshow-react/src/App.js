import './Layout/css/App.css'
import Footer from './Components/footer.jsx';
import Menu from './Components/menu.jsx';
import './Layout/css/menu_footer.css'
import { BrowserRouter, Routes, Route } from "react-router-dom";

import Home from './Views/Home.jsx'
import Contato from './Views/Contato.jsx'
import Destinos from './Views/Destinos.jsx'
import Promocoes from './Views/Promocoes';

function App() {
  return (
    <>
    <BrowserRouter>
      <Menu />
 
     <Routes>
 
       <Route path="/" element={<Home/>} exact/>
       
       <Route path="/Contato" element={<Contato />}/>
 
       <Route path="/Destinos" element={<Destinos />}/>
 
       <Route path="/Promocoes" element={<Promocoes />}/>
 
     </Routes>
 
      <Footer />
     </BrowserRouter>
    </>
  );
}

export default App;
