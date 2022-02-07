import React, { useState } from 'react';
import { Link } from 'react-router-dom'; 

function Menu (props){
    return(
       <>
       <header>
        <aside className='aside-nav-top'><a>Consulte aqui as atualizações sobre o coronavírus.</a></aside>
        <nav>
            
            <Link to="/" className="a_nav"  href=''>Home</Link>

            <Link to="/Destinos" className="a_nav" >Destinos</Link>

            <Link to="/Promocoes" className="a_nav" >Promoções</Link>

            <Link to="/Contato" className="a_nav" >Contato</Link>
        </nav>
    </header>
       </>
    );
}

export default Menu;