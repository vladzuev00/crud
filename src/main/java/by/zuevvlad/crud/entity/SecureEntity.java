package by.zuevvlad.crud.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class SecureEntity<ID> extends Entity<ID> {

    @Column(name = "encrypted_password")
    private String password;
}
