//package com.ifood.business.entity.dto.mapper;
//
//@Mapper(componentModel = "cdi")
//public interface RestauranteMapper {
//
//    @Mapping(target = "nome", source = "nomeFantasia")
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "dataCriacao", ignore = true)
//    @Mapping(target = "dataAtualizacao", ignore = true)
//    @Mapping(target = "localizacao.id", ignore = true)
//    public Restaurante toRestaurante(AdicionarRestauranteDTO dto);
//
//    @Mapping(target = "nome", source = "nomeFantasia")
//    public void toRestaurante(AtualizarRestauranteDTO dto, @MappingTarget Restaurante restaurante);
//
//    @Mapping(target = "nomeFantasia", source = "nome")
//    //Exemplo de formatação.
//    @Mapping(target = "dataCriacao", dateFormat = "dd/MM/yyyy HH:mm:ss")
//    public RestauranteDTO toRestauranteDTO(Restaurante r);
//
//}
