package com.fiuni.mytube.dto.viewinghistory;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ViewingHistoryResult extends BaseResult<ViewingHistoryDTO> {

    private static final long serialVersionUID = 1L;

    public List<ViewingHistoryDTO> getViewingHistories() {
        return get_dtos();
    }

    public void setViewingHistories(List<ViewingHistoryDTO> dtos) {
        set_dtos(dtos);
    }
}
