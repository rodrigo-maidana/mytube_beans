package com.fiuni.mytube.dto.viewinghistory;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import com.fiuni.mytube.dto.user.UserDTO;
import com.fiuni.mytube.dto.video.VideoDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ViewingHistoryDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private UserDTO user;
    private VideoDTO video;
    private Date viewDate;
}
