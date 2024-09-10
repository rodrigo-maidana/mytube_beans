package com.fiuni.mytube.dto.playlistvideo;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaylistVideoResult extends BaseResult<PlaylistVideoDTO> {

    private static final long serialVersionUID = 1L;

    public List<PlaylistVideoDTO> getPlaylistVideos() {
        return get_dtos();
    }

    public void setPlaylistVideos(List<PlaylistVideoDTO> dtos) {
        set_dtos(dtos);
    }
}
