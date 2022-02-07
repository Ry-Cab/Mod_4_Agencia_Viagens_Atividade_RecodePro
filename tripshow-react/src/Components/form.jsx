import React from 'react';

function Form(){
    return(
        <>
        <h1>Fale conosco!</h1>
        <form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4"> Seu Email:</label>
      <input type="email" class="form-control" id="inputEmail4" placeholder="Email"/>
    </div>
   
  </div>
  <div class="form-group">
    <label for="inputAddress">Assunto:</label>
    <input type="text" class="form-control" id="inputAddress" placeholder='Digite o assunto da sua mensagem'/>
  </div>
  <div class="form-group">
    <label for="inputAddress2">Mensagem:</label>
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <textarea class="form-control" name="" id="" cols="30" rows="10"></textarea>
    </div>
  </div>
  <div class="form-group">
  </div>
  <button type="submit" class="btn btn-primary" placeholder='Digite a sua mensagem'>Enviar</button>
</form>
        </>
    );
}

export default Form;