package com.fiuni.mytube.domain.profile;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileDomain implements BaseDomain{

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile", nullable = false, unique = true)
    private Integer id;

    @OneToOne
    @JoinColumn(name="fk_id_user", nullable=false, unique = true)
    private UserDomain user;

    @Column(name = "date_registration_date")
    private Date registrationDate;

    @Column(name = "str_avatar_url")
    private String avatarUrl;

    @Column(name = "str_bio")
    private String bio;

    @Column(name="date_birthday")
    private Date birthday;
}
