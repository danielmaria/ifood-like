package com.ifood.api.resource.dto;

import javax.validation.constraints.Size;

public class RestauranteDTO {
    public Long id;
    public String proprietario;
    public String cnpj;
    public String nome;
    public LocalizacaoDTO localizacao;
}
