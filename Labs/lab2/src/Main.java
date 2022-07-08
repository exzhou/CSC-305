import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String [] args) throws IOException {
    for(String arg : args) {
      File f = new File(arg);
      FileInputStream is = new FileInputStream(f);
      if (is == null) {
        throw new NullPointerException("Cannot find resource file " + f);
      }
      try {
        JSONTokener jTkn = new JSONTokener(is);
        JSONObject jOBj = new JSONObject(jTkn);
        JSONArray jArr = jOBj.getJSONArray("knownFor");
        JSONArray jArr2 = jOBj.getJSONArray("awards");
        ArrayList<String> knownFor = new ArrayList<>();
        ArrayList<Award> awards = new ArrayList<>();
        for (int i = 0; i < jArr2.length(); i++) {
          JSONObject j = (JSONObject) jArr2.get(i);
          awards.add(new Award(j.getString("name"), j.getInt("year")));
        }

        for (int j = 0; j < jArr.length(); j++) {
          knownFor.add(jArr.getString(j));
        }
        String name = jOBj.getString("name");
        Ningen n = new Ningen(awards, name, knownFor);
        System.out.println(jOBj.getString("name"));
        System.out.println("Known For:");
        for (String s : knownFor) {
          System.out.println("\t" + s);
        }
        System.out.println("Awards:");
        for (Award award : awards) {
          System.out.println(award);
        }
        System.out.println();
      } catch (Exception e) {
        System.out.print(e);
        continue;
      }

      //OBJECT MAPPER
      try {
        ObjectMapper mapper = new ObjectMapper(); // create once, reuse
        FileInputStream is2 = new FileInputStream(f);
        if (is2 == null) {
          throw new NullPointerException("Cannot find resource file " + f);
        }
        Ningen ningenMap = mapper.readValue(is2, Ningen.class);
        System.out.println(ningenMap.getName());
        System.out.println("Known For:");
        for (String s : ningenMap.getKnownFor()) {
          System.out.println("\t" + s);
        }
        System.out.println("Awards:");
        for (Award award : ningenMap.getAwards()) {
          System.out.println(award);
        }
        System.out.println();
      } catch (Exception e) {
        System.out.println(e);
      }
    }
  }
}
