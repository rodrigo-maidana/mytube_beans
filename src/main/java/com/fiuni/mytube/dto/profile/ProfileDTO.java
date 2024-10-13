package com.fiuni.mytube.dto.profile;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class ProfileDTO extends BaseDTO {
    private static final long serialVersionUID = 1L;

    private Integer idUser;
    private Date date_registration;
    private String avatarUrl;
    private String bio;
    private Date birthday;
}
