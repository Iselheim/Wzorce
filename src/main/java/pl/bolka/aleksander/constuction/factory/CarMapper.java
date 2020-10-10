package pl.bolka.aleksander.constuction.factory;

public class CarMapper implements Mapper<Car, CarDto> {

  @Override
  public CarDto toDto(Car entity) {
    return new CarDto();
  }

  @Override
  public Car fromDto(CarDto dto) {
    return new Car();
  }
}
