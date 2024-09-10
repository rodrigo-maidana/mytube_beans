package com.fiuni.mytube.domain.playlistvideo;

import jakarta.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.playlist.PlaylistDomain;
import com.fiuni.mytube.domain.video.VideoDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serial;

@Entity
@Table(name = "playlist_videos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistVideoDomain implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_playlist_video", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_playlist", referencedColumnName = "id_playlists", nullable = false)
    private PlaylistDomain playlist;

    @ManyToOne
    @JoinColumn(name = "fk_id_video", referencedColumnName = "id_video", nullable = false)
    private VideoDomain video;
}
