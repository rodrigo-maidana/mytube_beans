package com.fiuni.mytube.dto.subscription;

import java.util.Date;

import com.fiuni.mytube.dto.base.BaseDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SubscriptionDTO extends BaseDTO {

    private static final long serialVersionUID = 1L;

    private Integer userId;
    private Integer channelId;
    private Date subscriptionDate;
}
