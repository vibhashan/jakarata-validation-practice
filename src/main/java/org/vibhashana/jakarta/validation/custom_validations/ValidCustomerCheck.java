package org.vibhashana.jakarta.validation.custom_validations;

import org.vibhashana.jakarta.validation.models.Customer;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCustomerCheck implements ConstraintValidator<ValidCustomer, Customer> {

	@Override
	public boolean isValid(Customer value, ConstraintValidatorContext context) {
		return value.getTaxId().startsWith(value.getCountryCode());
	}

}
