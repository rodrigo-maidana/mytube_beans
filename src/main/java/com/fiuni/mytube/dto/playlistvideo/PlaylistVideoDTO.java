package com.fiuni.mytube.dto.playlistvideo;

import com.fiuni.mytube.dto.base.BaseDTO;
import com.fiuni.mytube.dto.playlist.PlaylistDTO;
import com.fiuni.mytube.dto.video.VideoDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlaylistVideoDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private PlaylistDTO playlist;
    private VideoDTO video;
}
