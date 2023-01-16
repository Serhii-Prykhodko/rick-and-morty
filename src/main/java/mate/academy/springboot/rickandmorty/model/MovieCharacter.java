package mate.academy.springboot.rickandmorty.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "movie_character")
public class MovieCharacter {
    @Id
    private Long id;
    private String name;
    private Status status;
    private Gender gender;
}
