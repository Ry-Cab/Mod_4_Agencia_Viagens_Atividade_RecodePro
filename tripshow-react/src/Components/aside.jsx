import React from "react";

export default function Aside(){
    return(
        <>
<div class="jumbotron jumbotron-fluid jumbotron-img">        

<div className="form-card">
    
<form>

  <div className="row">
      <div class="form-group col">
        <label for="exampleInputEmail1">Destino</label>
        <select name="" id="" className="form-control">
                    <option value="">Selecione</option>
                    <option value="">Rio de Janeiro - RJ</option>
                    <option value="">São Paulo - SP</option>
                    <option value="">Salvador - BA</option>
                    <option value="">Recife - PE</option>
                    <option value="">Maringá - PR</option>
                    <option value="">Natal - RN</option>
                    <option value="">Belém - PA</option>
                    <option value="">Blumenau - SC</option>
                    <option value="">Porto Alegre - RS</option>
                </select>
      </div>
      
  </div>
  <div className="row">
  <div class="col">
        <label for="exampleInputEmail1">Data de ida</label>
        <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"/>
      </div>
      <div class="col">
        <label for="exampleInputEmail1">Data de volta</label>
        <input type="date" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" />
      </div>
  </div>
  <div className="row">
      <div className="col">
      <button type="submit" class="btn btn-primary">Buscar</button>
      </div>
  </div>
</form>
</div>  
</div>
        </>
    );
}