package com.fiuni.mytube.domain.channel;

import java.io.Serial;
import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;

import com.fiuni.mytube.domain.user.UserDomain;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "channels")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChannelDomain implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_channel", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @Column(name = "str_channel_name", length = 100, nullable = false)
    private String channelName;

    @Column(name = "str_channel_description", length = 255)
    private String channelDescription;

    @Column(name = "date_creation_date")
    private Date creationDate;

    @Column(name = "str_channel_url", length = 100, nullable = false)
    private String channelUrl;

    @Column(name = "int_subscribers_count", nullable = false)
    private Integer subscribersCount;

    @Column(name = "bool_deleted", nullable = false)
    private Boolean deleted;

    // Relación muchos a muchos con usuarios, a través de suscripciones
    @ManyToMany(mappedBy = "subscribedChannels")
    private Set<UserDomain> subscribers;
}
