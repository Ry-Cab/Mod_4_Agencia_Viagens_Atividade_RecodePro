import React from "react";
import Form from '../Components/form.jsx'

export default function Contato() {
    return (
        <>
        <main className="container">
          
        <Form></Form>
        <address>
            <h5>Contato</h5>
            <div>
            <p>Email: tripshow@contato.com</p>
            <p>SAC: 0800-250-636</p>
            <p>Atendimento: 4698-6525</p>
            </div>
        </address>
    </main>
        </>
    );
}