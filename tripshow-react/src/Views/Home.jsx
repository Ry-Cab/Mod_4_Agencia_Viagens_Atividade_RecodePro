import React from "react";
import Card from '../Components/card.jsx';
import '../Layout/css/card_home.css'
import '../Layout/css/home.css'

import Aside from "../Components/aside.jsx";



export default function Home() {
    return (
        <>
            <Aside></Aside>
            
            
            <main className="container_home">
                <div className="texto-main"><h1>Aqui você encontra os melhores destinos!</h1>
            <p>Dê uma olhada :)</p></div>
            
            <div className="row">
            <Card class="col" titulo_card="Pará" img="https://www.aprendizdeviajante.com/wp-content/uploads/2019/11/66FCDE49-9347-4713-AB17-7CD4B9F68063.jpeg" />

            <Card class="col" titulo_card="Manaus" img="https://static.mundoeducacao.uol.com.br/mundoeducacao/2021/06/vista-do-teatro-amazonas-em-manaus.jpg"/>

            <Card class="col" titulo_card="Bahia" img="https://s2.glbimg.com/fc3QkvjkgggUPxZAl3xXKmYZi0Y=/0x0:1195x815/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_63b422c2caee4269b8b34177e8876b93/internal_photos/bs/2021/5/A/HN3MSLRSWTJ9Sb6NAwuw/centrohist.jpg"/>
            </div>
            <div className="row">
            <Card class="col" titulo_card="São Paulo" img="https://visitesaopaulo.com/wp-content/uploads/2021/06/AS00106-Ponte-Estaiada-scaled.jpg" />

            <Card class="col" titulo_card="Rio de Janeiro" img="https://exame.com/wp-content/uploads/2021/07/INFRA-2-2.jpg"/>

            <Card class="col" titulo_card="Rio Grande do Sul" img="https://media.istockphoto.com/photos/gramado-rio-grande-do-sul-brazil-in-christmas-picture-id1157041336?k=20&m=1157041336&s=170667a&w=0&h=5coikzQh7k018Uw5Cn2jcbuRp0YbybqOhJV3U5ZZnp8="/>
            </div>
            
            </main>
        </>
    );
}