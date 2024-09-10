package com.fiuni.mytube.dto.playlist;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import com.fiuni.mytube.dto.user.UserDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlaylistDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private UserDTO user;
    private String playlistName;
    private Date creationDate;
    private String visibility;
    //Quitamos boolean deleted;
}
