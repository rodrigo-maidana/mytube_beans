package com.fiuni.mytube.domain.reaction;

import java.util.Date;

import javax.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;
import com.fiuni.mytube.domain.video.VideoDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "reactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReactionDomain implements BaseDomain {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reaction", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @ManyToOne
    @JoinColumn(name = "id_video", referencedColumnName = "id_video", nullable = false)
    private VideoDomain video;

    @Enumerated(EnumType.STRING)
    @Column(name = "enum_reaction_type", nullable = false)
    private ReactionType reactionType;

    @Column(name = "date_reaction_type")
    private Date reactionDate;
}
