package com.fiuni.mytube.domain.user;

import jakarta.persistence.*;
import java.util.Date;
import com.fiuni.mytube.domain.base.BaseDomain;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain implements BaseDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", nullable = false, unique = true)
	private Integer id;

	@Column(name = "str_username", nullable = false, length = 50)
	private String username;

	@Column(name = "str_email", nullable = false, length = 100)
	private String email;

	@Column(name = "str_password", nullable = false)
	private String password;

	@Column(name = "date_registration_date")
	private Date registrationDate;

	@Column(name = "str_avatar_url")
	private String avatarUrl;

	@Column(name = "str_bio")
	private String bio;

	@ManyToOne
	@JoinColumn(name = "id_role", nullable = false)
	private RoleDomain role; // Cambiamos el Enum por la entidad RoleDomain

	@Column(name = "bool_deleted", nullable = false)
	private Boolean deleted;
}
