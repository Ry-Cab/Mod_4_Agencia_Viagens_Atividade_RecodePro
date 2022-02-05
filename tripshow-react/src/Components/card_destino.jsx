import React from 'react';


function CardDestino(props){
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
        <li class="list-group-item">{props.Descontado}</li>
        </ul>
        <div class="card-body">
        <p class="card-link">{props.Preco}</p>
        <button className="btn btn-primary">Comprar</button>
        </div>
        </div>
    </>
    );
}

export default CardDestino;