package org.amm.design.functional.validations.validation;

import org.amm.design.functional.validations.model.ValidationResult;

import java.util.function.Predicate;

public class SimpleValidation<T> implements Validation<T> {

    private Predicate<T> predicate;
    private String onErrorMessage;

    private SimpleValidation(Predicate<T> predicate, String onErrorMessage) {
        this.predicate = predicate;
        this.onErrorMessage = onErrorMessage;
    }

    public static <T> SimpleValidation<T> from (Predicate<T> predicate, String onErrorMessage) {
        return new SimpleValidation<T>(predicate, onErrorMessage);
    }

    @Override
    public ValidationResult executeValidation(T value) {
        return predicate.test(value) ? ValidationResult.ok() : ValidationResult.fail(onErrorMessage);
    }

    public static class Factory {

        public static Validation<String> notNull = SimpleValidation.from( s ->  s != null,
                "must not be null.");

        public static Validation<String> moreThan (int size) {
            return SimpleValidation.<String>from(s -> s.length() >= size,
                    String.format("must have more than %s chars.", size));
        }

        public static Validation<String> lessThan (int size) {
            return SimpleValidation.<String>from(s -> s.length() <= size,
                    String.format("must have less than %s chars.", size));
        }

        public static Validation<String> between (int minSize,int maxSize) {
            return moreThan(minSize).and(lessThan(maxSize));
        }

        public static Validation<String> contains(String characters){
            return SimpleValidation.<String>from((s) -> s.contains(characters),
                    String.format("must contain %s", characters));
        }

    }

}
