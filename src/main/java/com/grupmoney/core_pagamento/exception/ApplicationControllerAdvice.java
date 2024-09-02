package com.grupmoney.core_pagamento.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Slf4j
@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(BAD_REQUEST)
    @ResponseBody
    public ApiErros handleBadRequestException(MethodArgumentNotValidException e) {

        List<ObjectError> allErrors = e.getBindingResult().getAllErrors();
        List<String> errorsList = allErrors.stream().filter(erro -> Objects.nonNull(erro.getDefaultMessage()))
                .map(erro -> erro.getDefaultMessage()).collect(Collectors.toList());

        return ApiErros.builder()
                .erros(errorsList)
                .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ApiErros handleGeneralException(Exception e) {
        log.error(e.getMessage(), e);

        return new ApiErros("Sistema Indisponivel, por favor tente mais tarde ou contate um administrador!");
    }
}
