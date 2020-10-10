package pl.bolka.aleksander.constuction.factory;

public class UserMapper implements Mapper<User, UserDto> {

  @Override
  public UserDto toDto(User entity) {
    return new UserDto();
  }

  @Override
  public User fromDto(UserDto dto) {
    return new User();
  }
}
