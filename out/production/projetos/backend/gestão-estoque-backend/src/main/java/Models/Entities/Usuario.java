package Models.Entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;


@Data
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, message = "O nome precisa ter mais de 3 caracteres")
    @Column(nullable = false)
    private String nome;


    @Pattern(regexp = ".+@.+\\..+", message = "O formato de email precisa ser válido ")
    @Column(nullable = false)
    private String email;

    @Size(min = 8, message ="A senha precisa ter mais de 8 caracteres" )
    @Column(nullable = false)
    private String senha;
}
