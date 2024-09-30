package io.fiap.hackathon.vendas.driven.domain.mapper;

import io.fiap.hackathon.vendas.driven.domain.Pessoa;
import io.fiap.hackathon.vendas.driver.controller.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper extends BaseMapper<PessoaDTO, Pessoa> {
}
