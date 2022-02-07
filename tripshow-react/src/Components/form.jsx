import React from 'react';
import '../Layout/css/Contato.css'
function Form(){
    return(
        <>
        
        <form className='formcontato'>
    <div class="form-group">
      <label className='labelcontato' for="inputEmail4"> Seu Email:</label>
      <input className='inputcontato' type="email" class="form-control" id="inputEmail4" placeholder="Email"/>
    </div>
  
  <div class="form-group">
    <label className='labelcontato' for="inputAddress">Assunto:</label>
    <input className='inputcontato' type="text" class="form-control" id="inputAddress" placeholder='Digite o assunto da sua mensagem'/>
  </div>
    <div class="form-group">
      <label className='labelcontato'>Mensagem:</label>
      <textarea class="form-control" name="" id="" cols="30" rows="10"></textarea>
      <button type="submit" class="btn btn-primary" placeholder='Digite a sua mensagem'>Enviar</button>
    </div>
 
</form>
        </>
    );
}

export default Form;