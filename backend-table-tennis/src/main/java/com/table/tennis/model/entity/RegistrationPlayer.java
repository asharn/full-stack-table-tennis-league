package com.table.tennis.model.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;

@Data
@Entity
@Table(
        name = "registration_player",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"registration_id","player_id"})}
)
@IdClass(RegistrationPlayerId.class)
public class RegistrationPlayer  implements Serializable {
    @ManyToOne
    @JoinColumn(name = "registration_id")
    @Id
    private Registration registration;

    @ManyToOne
    @JoinColumn(name = "player_id")
    @Id
    private Player player;

}
