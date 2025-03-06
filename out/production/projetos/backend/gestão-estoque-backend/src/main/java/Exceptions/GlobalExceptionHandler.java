package Exceptions;

import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
        public ResponseEntity<Map<String, String>> handleGlobalException(Exception ex) {
            Map<String, String> response = new HashMap<>();
            response.put("message", "Ocorreu um erro inesperado");
            response.put("ERROR", ex.getClass().getSimpleName());

                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

