package pl.bolka.aleksander.constuction.builder;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class Main {

  public static void main(String[] args) {
    final Weapon laserGun = new Weapon.Builder()
        .withDamage(123)
        .withName("LaserGun")
        .withPerks(List.of("Color:red"))
        .withDurability(50L)
        .build();

    // ----------------------------------------------------------------------------------

    User user = User.builder()
                    .age(1)
                    .city("Warszwa")
                    .lastName("Kowalski")
                    .name("Janusz")
                    .build();

    Main main = new Main();

    // ----------------------------------------------------------------------------------

    main.calculate(1, 2, User.builder().build(), new Weapon.Builder().build(), new ArrayList<>(), "Name", "Opis");

    // ----------------------------------------------------------------------------------

    CalculateParam calculateParam = CalculateParam.builder()
                                                  .number(1)
                                                  .scale(2)
                                                  .user(User.builder().build())
                                                  .weapon(new Weapon.Builder().build())
                                                  .attributes(new ArrayList<>())
                                                  .name("name")
                                                  .description("Opis")
                                                  .build();

    main.calculate2(calculateParam);

    // ----------------------------------------------------------------------------------

    CalculateParam.CalculateParamBuilder calculateParamBuilder = CalculateParam.builder()
                                                               .number(1)
                                                               .scale(2);

    if (1==1){
      calculateParamBuilder.description("1==1");
    }
    // ...

    main.calculate2(calculateParamBuilder.build());

  }

  public int calculate(int number, int scale, User user, Weapon weapon, List<String> attributes,
                       String name, String description) {
    System.out.println("Napis");
    return number * scale;
  }

  public int calculate2(CalculateParam calculateParam) {
    System.out.println("Napis");
    return calculateParam.getNumber() * calculateParam.getScale();
  }

  @Getter
  @Setter
  @Builder
  private static class CalculateParam {
    private final int number;
    private final int scale;
    private final User user;
    private final Weapon weapon;
    private final List<String> attributes;
    private final String name;
    private final String description;

  }
}
