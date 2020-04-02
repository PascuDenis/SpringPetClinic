package springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private String firstName;
    private String lastName;

}
