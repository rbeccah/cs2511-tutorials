package youtube;

import java.util.ArrayList;
import java.util.List;

// ? Who is the Observer?

// ? Who is the Subject?

public class Producer {
    private String name;
    private List<Video> videos = new ArrayList<Video>();

    public Producer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
