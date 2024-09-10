package com.fiuni.mytube.dto.comment;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import com.fiuni.mytube.dto.user.UserDTO;
import com.fiuni.mytube.dto.video.VideoDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private UserDTO user;
    private VideoDTO video;
    private CommentDTO parentComment; // Relación con el comentario padre
    private String content;
    private Date commentDate;
    //Quitamos boolean deleted;
}
