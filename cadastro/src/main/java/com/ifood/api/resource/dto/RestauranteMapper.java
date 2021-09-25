package com.ifood.api.resource.dto;

import com.ifood.business.entity.Restaurante;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "cdi")
public interface RestauranteMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "dataCriacao", ignore = true)
    @Mapping(target = "dataAtualizacao", ignore = true)
    @Mapping(target = "localizacao.id", ignore = true)
    Restaurante toEntity(AdicionarRestauranteDTO restauranteDTO);

    RestauranteDTO toDTO(Restaurante i);

    void toRestaurante(AtualizarRestauranteDTO dto, @MappingTarget Restaurante restaurante);
}
