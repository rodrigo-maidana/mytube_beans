package com.fiuni.mytube.domain.video;

import java.io.Serial;
import java.util.Date;

import jakarta.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;
import com.fiuni.mytube.domain.channel.ChannelDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoDomain implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_video", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @ManyToOne
    @JoinColumn(name = "fk_id_channel", referencedColumnName = "id_channel", nullable = false)
    private ChannelDomain channel;

    @Column(name = "str_tittle", length = 255)
    private String title;

    @Column(name = "str_description", length = 255)
    private String description;

    @Column(name = "str_video_url", length = 255)
    private String videoUrl;

    @Column(name = "str_thumbnail_url", length = 255)
    private String thumbnailUrl;

    @Column(name = "str_format", length = 10)
    private String format;

    @Column(name = "str_tags", length = 255)
    private String tags;

    @Column(name = "date_upload_date")
    private Date uploadDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "enum_visibility", nullable = false)
    private VideoVisibility visibility;

    @Column(name = "int_duration")
    private Integer duration;

    @Column(name = "bool_deleted", nullable = false)
    private Boolean deleted;
}
