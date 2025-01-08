package dev.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "role")
public class Role extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ToString.Exclude
    @OneToMany(mappedBy = "role")
    private Set<User> users;
}
