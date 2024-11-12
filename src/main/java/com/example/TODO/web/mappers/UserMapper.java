package com.example.TODO.web.mappers;

import com.example.TODO.domain.user.User;
import com.example.TODO.web.dto.user.UserDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto(User user);

    User toEntity(UserDto dto);

}
