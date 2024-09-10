package com.fiuni.mytube.dto.user;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResult extends BaseResult<UserDTO> {

	private static final long serialVersionUID = 1L;

	public List<UserDTO> getUsers() {
		return get_dtos();
	}

	public void setUsers(List<UserDTO> dtos) {
		set_dtos(dtos);
	}
}
