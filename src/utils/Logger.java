package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.io.PrintWriter;

public class Logger {

    private static Logger instance;

    private Logger() {
        try (FileWriter fw = new FileWriter(Constants.LOGGER_FILE, true); PrintWriter pw = new PrintWriter(fw)) {
            LocalDateTime now = LocalDateTime.now();
            pw.println("[" + now + "] Logger initialized! Logging to: " + Constants.LOGGER_FILE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        try (FileWriter fw = new FileWriter(Constants.LOGGER_FILE, true); PrintWriter pw = new PrintWriter(fw)) {
            LocalDateTime now = LocalDateTime.now();
            pw.println("[" + now + "] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
