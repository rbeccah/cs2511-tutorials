package restaurant;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;

public class JSONHelper {
    public static JSONArray readInData(String filename) {
        try {
            return new JSONArray(new String(Files.readAllBytes(Paths.get(filename))));
        } catch (IOException e) {
            return null;
        }
    }
}