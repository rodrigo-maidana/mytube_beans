package com.fiuni.mytube.domain.playlistvideo;

import javax.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.playlist.PlaylistDomain;
import com.fiuni.mytube.domain.video.VideoDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "playlist_videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistVideoDomain implements BaseDomain {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playlist_video", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_playlist", referencedColumnName = "id_playlists", nullable = false)
    private PlaylistDomain playlist;

    @ManyToOne
    @JoinColumn(name = "id_video", referencedColumnName = "id_video", nullable = false)
    private VideoDomain video;
}
