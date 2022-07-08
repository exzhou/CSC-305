import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Ningen {
  private String name;
  private ArrayList<String> knownFor;
  private ArrayList<Award> awards;

  public Ningen(@JsonProperty("awards") ArrayList<Award> awards, @JsonProperty("name") String name, @JsonProperty("knownFor") ArrayList<String> knownFor) {
     this.awards = awards;
     this.name = name;
     this.knownFor = knownFor;
  }

  @JsonIgnore
  public String getName() { return this.name; }

  @JsonIgnore
  public ArrayList<String> getKnownFor() { return this.knownFor; }

  @JsonIgnore
  public ArrayList<Award> getAwards() { return this.awards; }

  @Override
  public String toString() {
    return new StringBuilder("\t" + name + "\nKnown For: " + knownFor.toString() + "\nAwards: " + awards.toString()).toString();
  }

}
