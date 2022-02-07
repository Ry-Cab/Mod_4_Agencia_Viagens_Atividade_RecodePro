import React,{useState} from 'react';

function CardDestino(props){
    const[nome,setNome]=useState('Comprar');
    
    return(
        <>
        <div class="card card_compra">
        <img class="card-img-top" src={props.img} alt="Imagem de capa do card" />
        <div class="card-body">
        <h5 class="card-title">{props.Cidade}</h5>
        <p class="card-text">{props.Estado}</p>
        </div>
        <ul class="list-group list-group-flush">
         <li class="list-group-item">Ida e volta</li>
        <li class="list-group-item">{props.Desconto}</li>
        <li class="list-group-item"><del>{props.Descontado}</del></li>
        </ul>
        <div class="card-body">
        <p class="card-link"><strong>R${props.Preco}</strong></p>
        <button id='botao' className="btn btn-primary" onClick={()=>setNome('Comprado')}>{nome}</button>
        </div>
        </div>
    </>
    );
}



export default CardDestino;

