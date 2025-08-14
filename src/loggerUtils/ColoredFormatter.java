package loggerUtils;

import java.util.logging.*;

public class ColoredFormatter extends Formatter {

    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String BLUE = "\u001B[34m";
    private static final String PURPLE = "\u001B[35m";
    private static final String CYAN = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";

    @Override
    public String format(LogRecord record) {
        String color = switch (record.getLevel().getName()) {
            case "SEVERE" -> RED;
            case "WARNING" -> YELLOW;
            case "INFO" -> BLUE;
            case "CONFIG" -> PURPLE;
            case "FINE" -> CYAN;
            case "FINER", "FINEST" -> GREEN;
            default -> RESET;
        };

        return color + "[" + record.getLevel() + "] " + formatMessage(record) + RESET + "\n";
    }
}


