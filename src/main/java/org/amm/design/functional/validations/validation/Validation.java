package org.amm.design.functional.validations.validation;

import org.amm.design.functional.validations.model.ValidationResult;

@FunctionalInterface
public interface Validation<T> {

    ValidationResult executeValidation (T value);

    default Validation<T> and (Validation<T> other) {
        // we are calling to the only abstract method and fill it
        return ( value ) -> {
            ValidationResult firstResult = this.executeValidation(value);
            return !firstResult.isvalid() ? firstResult : other.executeValidation(value);
        };
    };

    default Validation<T> or (Validation<T> other) {
        return (value) -> {
            ValidationResult firstResult = this.executeValidation(value);
            return firstResult.isvalid() ? firstResult : other.executeValidation(value);
        };
    };

}
