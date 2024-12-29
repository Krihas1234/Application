
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringJoiner;

public class Log {
    private static Log instance;
    private StringJoiner logEntries = new StringJoiner("\n");

    private Log() {
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }

        return instance;
    }

    public void addEvent(String event) {
        this.logEntries.add(event);
    }

    public void writeLogToFile(String filename) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(this.logEntries.toString());
        }

    }
}
