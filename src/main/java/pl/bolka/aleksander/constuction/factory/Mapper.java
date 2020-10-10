package pl.bolka.aleksander.constuction.factory;

public interface Mapper<T extends Entity, U extends Dto> {

  U toDto(T entity);

  T fromDto(U dto);

}
