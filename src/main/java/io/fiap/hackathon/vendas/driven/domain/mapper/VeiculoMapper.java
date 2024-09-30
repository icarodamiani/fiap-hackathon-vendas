package io.fiap.hackathon.vendas.driven.domain.mapper;

import io.fiap.hackathon.vendas.driven.domain.Veiculo;
import io.fiap.hackathon.vendas.driver.controller.dto.VeiculoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VeiculoMapper extends BaseMapper<VeiculoDTO, Veiculo> {
}
