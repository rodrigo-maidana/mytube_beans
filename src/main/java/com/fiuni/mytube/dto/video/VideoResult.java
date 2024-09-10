package com.fiuni.mytube.dto.video;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoResult extends BaseResult<VideoDTO> {

    private static final long serialVersionUID = 1L;

    public List<VideoDTO> getVideos() {
        return get_dtos();
    }

    public void setVideos(List<VideoDTO> dtos) {
        set_dtos(dtos);
    }
}
