package springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
