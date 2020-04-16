package by.grsu.designstudio.exception.controller;

import by.grsu.designstudio.exception.domain.ErrorModel;
import by.grsu.designstudio.exception.domain.JwtAuthenticationException;
import by.grsu.designstudio.exception.domain.ObjectNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.NoResultException;

@ControllerAdvice
public class GlobalControllerAdvice extends ResponseEntityExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobalControllerAdvice.class);


    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity handleNotFound(ObjectNotFoundException e) {
        String message = "Resource not found";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({JwtAuthenticationException.class, AuthenticationException.class})
    public ResponseEntity handleAuthException(AuthenticationException e) {
        String message = "Failed when authenticate";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.FORBIDDEN, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity handleAuthException(BadCredentialsException e) {
        String message = "Bad credentials";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(UsernameNotFoundException.class)
    public ResponseEntity handle(UsernameNotFoundException e) {
        String message = "Username not found";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoResultException.class)
    public ResponseEntity handle(NoResultException e) {
        String message = "No result";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity handle(IllegalArgumentException e) {
        String message = "Illegal argument";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.BAD_REQUEST, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity handle(NullPointerException e) {
        String message = "Not all data was transferred";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.BAD_REQUEST, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity handle(Exception e) {
        String message = "Server error";
        log.error(message, e);
        ErrorModel error = new ErrorModel(HttpStatus.INTERNAL_SERVER_ERROR, message, e.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
