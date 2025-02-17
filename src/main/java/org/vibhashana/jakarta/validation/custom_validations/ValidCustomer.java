package org.vibhashana.jakarta.validation.custom_validations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidCustomerCheck.class)
public @interface ValidCustomer {
	String message() default "Customer is not valid";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	// Can have additional members also if needed.

}
