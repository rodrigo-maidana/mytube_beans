package com.fiuni.mytube.domain.user;

import com.fiuni.mytube.domain.channel.ChannelDomain;
import jakarta.persistence.*;

import java.io.Serial;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.fiuni.mytube.domain.base.BaseDomain;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDomain implements BaseDomain, UserDetails {
	@Serial
	private static final long serialVersionUID = 1L;

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


	@ManyToOne
	@JoinColumn(name = "id_role", nullable = false)
	private RoleDomain role; // Cambiamos el Enum por la entidad RoleDomain

	@Column(name = "bool_deleted", nullable = false)
	private Boolean deleted;


	// Relación muchos a muchos con canales, a través de suscripciones
	@ManyToMany
	@JoinTable(
			name = "subscriptions", // Tabla intermedia
			joinColumns = @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user"),
			inverseJoinColumns = @JoinColumn(name = "fk_id_channel", referencedColumnName = "id_channel")
	)
	private Set<ChannelDomain> subscribedChannels;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority((role.getName())));
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
