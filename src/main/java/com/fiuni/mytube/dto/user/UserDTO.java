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
	private Date registrationDate;
	private String avatarUrl;
	private String bio;
	private String roleName; //RoleName para reflejar la entidad Role
}
