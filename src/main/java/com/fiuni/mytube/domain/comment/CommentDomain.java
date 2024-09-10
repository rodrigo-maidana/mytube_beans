package com.fiuni.mytube.domain.comment;

import java.io.Serial;
import java.util.Date;

import jakarta.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;
import com.fiuni.mytube.domain.video.VideoDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDomain implements BaseDomain {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comment", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @ManyToOne
    @JoinColumn(name = "fk_id_video", referencedColumnName = "id_video", nullable = false)
    private VideoDomain video;

    @ManyToOne
    @JoinColumn(name = "id_parent_comment")
    private CommentDomain parentComment;

    @Column(name = "str_content", length = 255, nullable = false)
    private String content;

    @Column(name = "date_comment_date")
    private Date commentDate;

    @Column(name = "bool_deleted", nullable = false)
    private Boolean deleted;
}
