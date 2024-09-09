package com.fiuni.mytube.domain.subscription;

import java.util.Date;

import javax.persistence.*;

import com.fiuni.mytube.domain.base.BaseDomain;
import com.fiuni.mytube.domain.user.UserDomain;
import com.fiuni.mytube.domain.channel.ChannelDomain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "subscriptions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionDomain implements BaseDomain {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subscriptions", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user", nullable = false)
    private UserDomain user;

    @ManyToOne
    @JoinColumn(name = "id_channel", referencedColumnName = "id_channel", nullable = false)
    private ChannelDomain channel;

    @Column(name = "date_subscription_date")
    private Date subscriptionDate;
}
