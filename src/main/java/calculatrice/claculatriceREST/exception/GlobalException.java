package calculatrice.claculatriceREST.exception;

import calculatrice.claculatriceREST.exception.CalculatriceException;
import calculatrice.claculatriceREST.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(CalculatriceException.class)
    public ResponseEntity<ErrorResponse> catchCalculatriceException(CalculatriceException e) {
        ErrorResponse error = new ErrorResponse(e.getMessage(), 400);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> handleTypeMismatch(MethodArgumentTypeMismatchException e) {
        ErrorResponse error = new ErrorResponse(
                "Paramètre invalide : veuillez entrer un nombre !",
                400
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}