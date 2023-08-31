package org.secuso.privacyfriendlypausinghealthily.exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;


public final class ExerciseLocale {

    private ExerciseLocale() {}

    private static final HashSet<String> AVAILABLE_LOCALE = new HashSet<>();

    static {
        AVAILABLE_LOCALE.addAll(
                Arrays.asList(
                        "en", "de"
                )
        );
    }


    public static String getLocale() {
        String locale = Locale.getDefault().getLanguage();
        return AVAILABLE_LOCALE.contains(locale) ? locale : "en";
    }
}
