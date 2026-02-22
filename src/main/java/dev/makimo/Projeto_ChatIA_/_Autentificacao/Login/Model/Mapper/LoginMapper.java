package dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.Mapper;

import ch.qos.logback.core.model.ComponentModel;
import dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.DTO.LoginRequest;
import dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.DTO.LoginResponse;
import dev.makimo.Projeto_ChatIA_._Autentificacao.Login.Model.LoginModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import javax.swing.*;
import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface LoginMapper {
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "senha",ignore = true)

    // Request -> Entity
    LoginModel toEntity(LoginRequest loginRequest);

    // Entity -> Response
    LoginResponse toResponse(LoginModel loginModel);

    // Lista Entity -> Lista Response
    List<LoginResponse> toResponseList(List<LoginModel> listLoginModel);
}
