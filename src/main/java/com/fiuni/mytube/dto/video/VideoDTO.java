package com.fiuni.mytube.dto.video;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import com.fiuni.mytube.dto.user.UserDTO;
import com.fiuni.mytube.dto.channel.ChannelDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class VideoDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private UserDTO user;
    private ChannelDTO channel;
    private String title;
    private String description;
    private String videoUrl;
    private String thumbnailUrl;
    private String format;
    private String tags;
    private Date uploadDate;
    private String visibility;
    private Integer duration;
    //Quitamos boolean deleted;
}
