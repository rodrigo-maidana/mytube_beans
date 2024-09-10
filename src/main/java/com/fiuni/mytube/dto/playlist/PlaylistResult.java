package com.fiuni.mytube.dto.playlist;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaylistResult extends BaseResult<PlaylistDTO> {

    private static final long serialVersionUID = 1L;

    public List<PlaylistDTO> getPlaylists() {
        return get_dtos();
    }

    public void setPlaylists(List<PlaylistDTO> dtos) {
        set_dtos(dtos);
    }
}
