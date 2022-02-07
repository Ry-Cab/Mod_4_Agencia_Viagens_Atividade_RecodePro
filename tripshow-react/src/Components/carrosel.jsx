import React from "react";

export default function Carrosel(){
    return(
    <>
    <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img class="d-block w-100" src="/public/img/home_images/para.jpg" alt="Primeiro Slide"/>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/public/img/home_images/riograndedosul.jpg" alt="Segundo Slide"/>
    </div>
    <div class="carousel-item">
      <img class="d-block w-100" src="/public/img/home_images/santacatarina.jpg" alt="Terceiro Slide"/>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Anterior</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Próximo</span>
  </a>
</div>
    </>
    )
}