package com.fiuni.mytube.dto.comment;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CommentDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer videoId;
    private Integer parentCommentId; // Relación con el comentario padre
    private String content;
    private Date commentDate;
    //Quitamos boolean deleted;
}
