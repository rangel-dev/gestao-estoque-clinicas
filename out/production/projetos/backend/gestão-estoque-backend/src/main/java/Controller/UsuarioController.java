package Controller;

import Exceptions.ErrorResponses;
import Exceptions.GlobalExceptionHandler;
import Models.Entities.Usuario;
import Repositories.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Optional;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;



    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Usuario usuario, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
            return ResponseEntity.badRequest().body(new ErrorResponses(errorMessage));
        } else if (!isValidEmail(usuario.getEmail())) {
            return ResponseEntity.badRequest().body(new ErrorResponses("Email invalido"));
        } else if (usuario.getNome().length() < 3) {
            return ResponseEntity.badRequest().body(new ErrorResponses("O nome precisa ter mais de 3 caracteres"));
        }
        Optional<Usuario> usuarioExistente = usuarioRepository.findByEmail(usuario.getEmail());
        if (usuarioExistente.isPresent()) {
            throw new GlobalExceptionHandler.DuplicateDataException(" Já existe um usuário com esse E-mail.");
        }


        Usuario savedUsuario = usuarioRepository.save(usuario);
        return ResponseEntity.ok(savedUsuario);
    }

    private boolean isValidEmail(String email) {
        return email.matches(".+@.+\\..+");
    }
}

