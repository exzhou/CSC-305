import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Award {
  private String name;
  private int year;

  public Award(){

  }

  @JsonCreator // constructor can be public, private, whatever
  public Award(@JsonProperty("name") String name,
                   @JsonProperty("year") int year)
  {
    this.name = name;
    this.year = year;
  }

  @Override
  public String toString() {
    return new StringBuilder("\t" + name + ", " + year).toString();
  }
}
