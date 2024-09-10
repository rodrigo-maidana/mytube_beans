package com.fiuni.mytube.dto.channel;

import java.util.List;

import com.fiuni.mytube.dto.base.BaseResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChannelResult extends BaseResult<ChannelDTO> {

    private static final long serialVersionUID = 1L;

    public List<ChannelDTO> getChannels() {
        return get_dtos();
    }

    public void setChannels(List<ChannelDTO> dtos) {
        set_dtos(dtos);
    }
}
