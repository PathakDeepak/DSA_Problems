package loggerUtils;

import java.util.logging.*;

public class LogUtil {

    public static Logger getLogger(Class<?> clazz) {
        Logger logger = Logger.getLogger(clazz.getName());
        logger.setUseParentHandlers(false); // disable default

        // Prevent multiple handlers if already configured
        if (logger.getHandlers().length == 0) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setFormatter(new ColoredFormatter());
            handler.setLevel(Level.ALL);
            logger.addHandler(handler);
            logger.setLevel(Level.ALL);
        }

        return logger;
    }
}
