package com.ifood.api.resource.dto;

import javax.validation.constraints.Size;

public class AdicionarRestauranteDTO {
    public String proprietario;
    public String cnpj;
    @Size(min = 3, max = 30)
    public String nome;
    public LocalizacaoDTO localizacao;
}
