package pl.pjatk.RentalService.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BadGatewayException extends RuntimeException{
    @ExceptionHandler(BadGatewayException.class)
    public ResponseEntity<Object> handlerRuntimeException(BadGatewayException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_GATEWAY);
    }
}
