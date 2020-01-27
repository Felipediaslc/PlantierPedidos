package com.plantier.pedidos.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

// um outro tipo de erro que herda o StandardError, acrescentando a lista de FildMessage

public class ValidationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}

	//o importante é mudar o nome do método aqui
	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}
	
}
