package com.fiuni.mytube.dto.reaction;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReactionDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer videoId;
    private String reactionType;
    private Date reactionDate;
}
