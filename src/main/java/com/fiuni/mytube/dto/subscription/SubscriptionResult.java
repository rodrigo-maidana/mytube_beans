package com.fiuni.mytube.dto.subscription;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubscriptionResult extends BaseResult<SubscriptionDTO> {

    private static final long serialVersionUID = 1L;

    public List<SubscriptionDTO> getSubscriptions() {
        return get_dtos();
    }

    public void setSubscriptions(List<SubscriptionDTO> dtos) {
        set_dtos(dtos);
    }
}
