package dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.Repository;

import dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.LoginModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginModel,Long> {
}
