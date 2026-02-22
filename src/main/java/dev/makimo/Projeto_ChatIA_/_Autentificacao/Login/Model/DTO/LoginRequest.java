package dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(

        @NotBlank(message = "nome é obrigatorio")
        @Size(min = 6,max = 30,message = "nome deve ter pelo menos 6 letras")
        String nome,

        @Email(message = "email invalido")
        @NotBlank(message = "É obrigatorio colocar o email")
        String email,

        @Size(min = 16, max = 128, message = "a sua senha deve ter entre 16 a 128 caracteres,exemplos: 1,A,v ou $,#,*...")
        @NotBlank(message = "É obrigatorio colocar a senha")
        String senha
) {
    
}
