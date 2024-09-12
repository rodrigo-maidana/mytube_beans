package com.fiuni.mytube.dto.playlistvideo;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlaylistVideoDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer playlistId;
    private Integer videoId;
}
