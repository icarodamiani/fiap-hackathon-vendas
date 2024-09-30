package io.fiap.hackathon.vendas.driven.client.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.fiap.hackathon.vendas.driven.domain.Pessoa;
import io.fiap.hackathon.vendas.driven.domain.Veiculo;
import org.immutables.value.Value;

@JsonSerialize(as = ImmutableDocumentoEmitirRequestDTO.class)
@JsonDeserialize(as = ImmutableDocumentoEmitirRequestDTO.class)
@Value.Immutable
@Value.Style(privateNoargConstructor = true, jdkOnly = true)
public abstract class DocumentoEmitirRequestDTO {
    public abstract String getId();
    public abstract String getTipo();
    public abstract String getOrgao();
    public abstract Veiculo getVeiculo();
    public abstract Pessoa getPessoa();
}