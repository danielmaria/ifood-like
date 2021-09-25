package com.ifood.business.entity.dto.mapper;

import com.ifood.api.resource.dto.AdicionarPratoDTO;
import com.ifood.api.resource.dto.AtualizarPratoDTO;
import com.ifood.business.entity.Prato;
import com.ifood.business.entity.dto.PratoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "cdi")
public interface PratoMapper {

    PratoDTO toDTO(Prato p);

    Prato toPrato(AdicionarPratoDTO dto);

    void toPrato(AtualizarPratoDTO dto, @MappingTarget Prato prato);

}