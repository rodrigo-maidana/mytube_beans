package com.fiuni.mytube.dto.reaction;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReactionResult extends BaseResult<ReactionDTO> {

    private static final long serialVersionUID = 1L;

    public List<ReactionDTO> getReactions() {
        return get_dtos();
    }

    public void setReactions(List<ReactionDTO> dtos) {
        set_dtos(dtos);
    }
}
