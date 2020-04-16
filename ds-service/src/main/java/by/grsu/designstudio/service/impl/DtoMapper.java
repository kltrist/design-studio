package by.grsu.designstudio.service.impl;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


// T - Entity
// K - DTO

public class DtoMapper<T, K> {

    private ModelMapper modelMapper;
    private Class<T> tClass;
    private Class<K> kClass;

    public DtoMapper(Class<T> tClass, Class<K> kClass) {
        this.tClass = tClass;
        this.kClass = kClass;
        modelMapper = getModelMapper();
    }

    private static ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.createTypeMap(String.class, Timestamp.class);
        modelMapper.createTypeMap(Timestamp.class, String.class);

        return modelMapper;
    }


    public K convertToDto(T obj) {
        return modelMapper.map(obj, kClass);
    }

    public Set<K> convertToDto(Set<T> subscriptions) {
        return subscriptions.stream()
                .map(this::convertToDto)
                .collect(Collectors.toSet());
    }

    public List<K> convertToDto(List<T> subscriptions) {
        return subscriptions.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public T convertToEntity(K dto) {
        return modelMapper.map(dto, tClass);
    }

    public void copyToEntity(K dto, T entity) {
        modelMapper.map(dto, entity);
    }
}
