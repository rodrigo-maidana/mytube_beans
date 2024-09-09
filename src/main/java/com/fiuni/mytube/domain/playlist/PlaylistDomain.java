package com.fiuni.mytube.domain.playlist;

import java.util.Date;

import javax.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "playlists")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistDomain implements BaseDomain {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playlists", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @Column(name = "str_playlist_name", length = 100, nullable = false)
    private String playlistName;

    @Column(name = "date_creation_date")
    private Date creationDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "enum_visibility", nullable = false)
    private PlaylistVisibility visibility;

    @Column(name = "bool_deleted", nullable = false)
    private Boolean deleted;
}
