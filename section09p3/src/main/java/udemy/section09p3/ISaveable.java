package udemy.section09p3;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> values);
}
