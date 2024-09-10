package com.fiuni.mytube.dto.subscription;

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
public class SubscriptionDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private UserDTO user;
    private ChannelDTO channel;
    private Date subscriptionDate;
}
