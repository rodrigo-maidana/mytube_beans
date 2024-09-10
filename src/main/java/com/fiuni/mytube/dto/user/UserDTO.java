package com.fiuni.mytube.dto.user;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
public class UserDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;

	private String username;
	private String email;
	//Quitamos contraseña por seguridad
	private Date registrationDate;
	private String avatarUrl;
	private String bio;
	private String userType; // Usamos String para evitar acoplar con el enum directamente
	//Quitamos boolean deleted;
}
