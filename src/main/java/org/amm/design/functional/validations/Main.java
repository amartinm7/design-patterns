package org.amm.design.functional.validations;

import org.amm.design.functional.validations.model.Person;

import static org.amm.design.functional.validations.validation.SimpleValidation.Factory.*;

public class Main {

    public static void main(String args[]){
        final Person person = new Person("name", "surname", "email", 66);
        notNull.and(between(2, 12)).executeValidation(person.getName()).throwIfInvalid("invalid name");
        notNull.or(between(2, 12)).executeValidation(person.getEmail()).throwIfInvalid("invalid email");
    }

}
