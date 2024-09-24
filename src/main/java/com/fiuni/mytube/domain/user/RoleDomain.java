package com.fiuni.mytube.domain.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role", nullable = false, unique = true)
    private Integer id;

    @Column(name = "str_name", nullable = false, length = 50)
    private String name;
}
