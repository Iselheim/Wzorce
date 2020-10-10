package pl.bolka.aleksander.constuction.factory;

public class MapperFactory {

  public Mapper<? extends Entity, ? extends Dto> getMapper(Type type){
    switch (type){
      case USER:
        return  new UserMapper();
      case CAR:
        return new CarMapper();
    }
    throw new RuntimeException("Not implemented yet! Type: " + type);
  }

}
