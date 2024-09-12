package com.fiuni.mytube.dto.channel;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ChannelDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private String channelName;
    private String channelDescription;
    private Date creationDate;
    private String channelUrl;
    private Integer subscribersCount;
    //Quitamos boolean deleted;
}
