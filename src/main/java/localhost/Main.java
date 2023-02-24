package localhost;

import java.util.Set;
import java.util.TreeSet;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

public class Main {

  public static void main(String[] args) {
    Set<Person> personSet = new TreeSet<>();
    personSet.add(new Person(4, "Denis"));
    personSet.add(new Person(2, "Maksim"));
    personSet.add(new Person(1, "Ivan"));
    personSet.add(new Person(3, "Petr"));
    System.out.println(personSet);
  }
}

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
class Person implements Comparable<Person> {

  private int id;
  private String name;

  @Override
  public int compareTo(Person person) {
    if (this.id > person.getId()) {
      return 1;
    }
    if (this.id < person.getId()) {
      return -1;
    }
    return 0;
  }
}
