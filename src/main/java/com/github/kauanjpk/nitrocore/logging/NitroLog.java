package com.github.kauanjpk.nitrocore.logging;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.kauanjpk.nitrocore.Tags;

/**
 * Centralized logger used by NitroCore.
 *
 * <p>
 * All log messages should pass through this class to keep
 * the output consistent and make future logging improvements
 * easier (Forge logger, Log4j, file logs, etc.).
 * </p>
 *
 * @author PowerKup
 */
public final class NitroLog {

    private static final String PREFIX = "[NitroCore]";
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

    private NitroLog() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * Prints the NitroCore startup banner.
     */
    public static void banner() {

        System.out.println();
        System.out.println("==============================================================");
        System.out.println(" _   _ _ _             _____                     ");
        System.out.println("| \\ | (_) |           / ____|                    ");
        System.out.println("|  \\| |_| |_ _ __ ___| |     ___  _ __ ___       ");
        System.out.println("| . ` | | __| '__/ _ \\ |    / _ \\| '__/ _ \\ ");
        System.out.println("| |\\  | | |_| | | (_) | |___| (_) | | |  __/     ");
        System.out.println("|_| \\_|_|\\__|_|  \\___/ \\_____\\___/|_|  \\___|");
        System.out.println();
        System.out.println(" Version : " + Tags.VERSION);
        System.out.println(" Author  : PowerKup");
        System.out.println(" GitHub  : github.com/KauanJPK");
        System.out.println(" Motto   : Performance Without Compromise.");
        System.out.println("==============================================================");
        System.out.println();

    }

    /**
     * Prints an INFO message.
     *
     * @param message Message to print.
     */
    public static void info(String message) {
        log("INFO", message);
    }

    /**
     * Prints a WARN message.
     *
     * @param message Message to print.
     */
    public static void warn(String message) {
        log("WARN", message);
    }

    /**
     * Prints an ERROR message.
     *
     * @param message   Message to print.
     * @param exception
     */
    public static void error(String message, IOException exception) {
        log("ERROR", message);
    }

    /**
     * Prints a DEBUG message.
     *
     * @param message Message to print.
     */
    public static void debug(String message) {
        log("DEBUG", message);
    }

    /**
     * Internal logger.
     */
    private static void log(String level, String message) {

        System.out.printf("[%s] %s [%s] %s%n", TIME_FORMAT.format(new Date()), PREFIX, level, message);

    }

}
