//package com.poly.datn.exception;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//@RestControllerAdvice
//public class ExceptionHandle extends ResponseEntityExceptionHandler {
//    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleUnwantedException(Exception e) {
//        LOGGER.error(e.getMessage());
//
//        return ResponseEntity.status(500).body("Server error");
//    }
//}
