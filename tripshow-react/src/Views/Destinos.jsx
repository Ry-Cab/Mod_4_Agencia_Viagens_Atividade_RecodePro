import React from 'react';

import CardDestino from  '../Components/card_destino.jsx';
import CardDestinoCss from '../Layout/css/CardDestino.css';


export default function Destinos(){
    return(
        <>
        <link rel="stylesheet" href={CardDestinoCss}></link>
        <main className="container container_compra">
            <CardDestino Estado="RJ" Cidade="Rio de Janeiro" Preco="289.00" img="http://2.bp.blogspot.com/-RThEwEqQrtc/Uk2l9uuty4I/AAAAAAAAnE0/ZsPTiyseI_A/s1600/Rio-de-Janeiro.jpg" />
            <CardDestino Estado="RS" Cidade="Blumenau" Preco="494.70" img="https://i.pinimg.com/originals/fb/11/97/fb1197f0cbc1d61ff7bcbc146f317c16.jpg"/>
            <CardDestino Estado="RN" Cidade="Rio de Janeiro" Preco="289.00" img="https://i0.wp.com/blog.clubecandeias.com/wp-content/uploads/2020/02/cinco-praias-maravilhosas-para-conhecer-no-rio-grande-do-sul.jpg?w=680&ssl=1"/>
            <CardDestino Estado="RN" Cidade="Rio Grande do Norte" Preco="319.89" img="https://www.coladaweb.com/wp-content/uploads/2014/12/Rio-Grande-do-Norte.png"/>
            
            <CardDestino Estado="RJ" Cidade="Rio de Janeiro" Preco="289.00" img="https://cdn.folhape.com.br/img/c/1200/900/dn_arquivo/2021/03/afogados-da-ingazeira-pernambuco.jpg"/>
            <CardDestino Estado="PR" Cidade="Maringá" Preco="478.50" img="https://s2.glbimg.com/Z8uoqOyhqG7E33Uh0iMoOnygXBE=/0x0:680x452/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2019/J/z/ly7VkgQeG3AAXvcPNdzg/maringa-quer-se-tornar-a-capital-nacional-do-associativismo.jpeg"/>
            <CardDestino Estado="PA" Cidade="Belém do Pará" Preco="459.13" img="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/13/a8/32/90/as-vistas-sao-muito-legais.jpg?w=500&h=400&s=1"/>
            <CardDestino Estado="SP" Cidade="São Paulo" Preco="199.29" img="https://exame.com/wp-content/uploads/2020/05/sao-paulo-vazia-quarentena-1.jpg"/>
        </main>
        </>
    );
}