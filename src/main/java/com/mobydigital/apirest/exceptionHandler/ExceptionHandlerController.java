package com.mobydigital.apirest.exceptionHandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class ExceptionHandlerController {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler({
		NotFoundException.class,
		
		})
	@ResponseBody
	public ErrorMessage notFoundRequest(HttpServletRequest request, Exception exception) {
		return new ErrorMessage(exception, request.getRequestURI());
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({
		BadRequestException.class,
		org.springframework.web.HttpRequestMethodNotSupportedException.class,
		org.springframework.dao.DuplicateKeyException.class,
		org.springframework.web.bind.MethodArgumentNotValidException.class,
		org.springframework.web.bind.MissingRequestHeaderException.class,
		org.springframework.web.bind.MissingServletRequestParameterException.class,
		org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class,
		org.springframework.http.converter.HttpMessageNotReadableException.class
	})
	@ResponseBody
	public ErrorMessage badRequest(HttpServletRequest request, Exception exception) {
		return new ErrorMessage(exception, request.getRequestURI());
	}
	
	@ResponseStatus(HttpStatus.FORBIDDEN)
	@ExceptionHandler({
		ForbiddenException.class
	})
	@ResponseBody
	public ErrorMessage forbiddenRequest(HttpServletRequest request, Exception exception) {
		return new ErrorMessage(exception, request.getRequestURI());
	}
	
	@ResponseStatus(HttpStatus.UNAUTHORIZED)
	@ExceptionHandler({
		UnauthorizedException.class,
		org.springframework.security.access.AccessDeniedException.class
	})
	public void unauthorized() {
		
	}

	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({
		Exception.class
	})
	@ResponseBody
	public ErrorMessage fatalError(HttpServletRequest request, Exception exception) {
		return new ErrorMessage(exception, request.getRequestURI());
	}


}
