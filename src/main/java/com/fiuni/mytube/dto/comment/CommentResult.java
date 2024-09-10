package com.fiuni.mytube.dto.comment;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentResult extends BaseResult<CommentDTO> {

    private static final long serialVersionUID = 1L;

    public List<CommentDTO> getComments() {
        return get_dtos();
    }

    public void setComments(List<CommentDTO> dtos) {
        set_dtos(dtos);
    }
}
