package net.axel.ticketmanagementbackend.Util;

import java.util.function.Consumer;

public class UpdateUtil {

    public static <T> void updateField(T newValue, T currentValue, Consumer<T> setter) {
        if (newValue != null && !newValue.equals(currentValue)) setter.accept(newValue);
    }
}
