package az.perfect.msbookingapp.mapper;

import az.perfect.msbookingapp.domain.entity.UserEntity;
import az.perfect.msbookingapp.model.dto.request.CreateUserRequest;
import az.perfect.msbookingapp.model.dto.request.UpdateUserRequest;
import az.perfect.msbookingapp.model.dto.response.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, UserDto> {

    @Override
    public UserEntity toEnt(UserDto userDto) {
        return UserEntity.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .role(userDto.getRole())
                .phoneNumber(userDto.getPhoneNumber())
                .dateOfBirth(userDto.getDateOfBirth())
                .nationality(userDto.getNationality())
                .build();
    }

    @Override
    public UserDto toDto(UserEntity userEntity) {
        return UserDto.builder()
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .role(userEntity.getRole())
                .phoneNumber(userEntity.getPhoneNumber())
                .dateOfBirth(userEntity.getDateOfBirth())
                .nationality(userEntity.getNationality())
                .build();
    }

    public UserEntity toEnt(CreateUserRequest request) {
        return UserEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .role(request.getRole())
                .phoneNumber(request.getPhoneNumber())
                .dateOfBirth(request.getBirthDay())
                .nationality(request.getNationality())
                .status(request.getStatus())
                .build();
    }
    public UserEntity toEnt(UpdateUserRequest request) {
        return UserEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .role(request.getRole())
                .phoneNumber(request.getPhoneNumber())
                .dateOfBirth(request.getDateOfBirth())
                .nationality(request.getNationality())
                .status(request.getStatus())
                .build();
    }
}
