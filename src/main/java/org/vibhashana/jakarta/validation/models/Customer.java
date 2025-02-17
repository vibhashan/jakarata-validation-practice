package org.vibhashana.jakarta.validation.models;

import org.vibhashana.jakarta.validation.custom_validations.ValidCustomer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@ValidCustomer
@Data
public class Customer {
	private String name;

	@NotEmpty
	private String countryCode;

	@NotEmpty
	private String taxId;
}
