package pl.bolka.aleksander.constuction.factory;

public class Main {

  public static void main(String[] args) {

    User user = new User();

    Mapper mapper = new MapperFactory().getMapper(Type.USER);
    Dto dto = mapper.toDto(user);


  }

}
