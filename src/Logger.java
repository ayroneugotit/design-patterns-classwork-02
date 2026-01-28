import java.util.List;

public class Logger {
    public <T> void logList(List<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
