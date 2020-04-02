package springframework.petclinic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Vet extends  Person{

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
