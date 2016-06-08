package My.tomcat.test;

import java.util.*;

/**
 * Created by bukkaa on 09.06.2016.
 */

public class GuestBook {
    static public List<Map <String, String> > book = new LinkedList<>();

    public void putGuest (String name, String message) {
        Map<String, String> note = new HashMap<>();

        note.put(name, message);
        book.add(note);
    }

    public GuestBook() {
    }
}
