package com.ifood.business.entity.dto;

import com.ifood.business.entity.Localizacao;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;
import java.util.Date;

public class RestauranteDTO {
    public Long id;
    public String proprietario;
    public String cnpj;
    public String nome;
    public Localizacao localizacao;
    public Date dataCriacao;
    public Date dataAtualizacao;
}
