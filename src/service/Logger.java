package service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import utils.Constants;
import utils.LogLevel;

public class Logger {

    private static Logger instance;

    private Logger() {
        try (FileWriter fw = new FileWriter(Constants.LOGGER_FILE, false); PrintWriter pw = new PrintWriter(fw)) {
            LocalDateTime now = LocalDateTime.now();
            pw.println("[" + now + "] Logger initialized to: " + Constants.LOGGER_FILE);
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

    public void log(LogLevel level, String message) {
        try (FileWriter fw = new FileWriter(Constants.LOGGER_FILE, true); PrintWriter pw = new PrintWriter(fw)) {
            LocalDateTime now = LocalDateTime.now();
            pw.println("[" + now + "] [" + level + "] " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARN, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }
}
