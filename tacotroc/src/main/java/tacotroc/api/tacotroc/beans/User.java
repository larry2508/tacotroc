package tacotroc.api.tacotroc.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "twp_user")

public class User {
@Id
private int id;

private String prenom;
private String nom ;
private String pseudo;
private String mail;
private String tel;
private String mdp;
private String token;
private LocalDate date_creation;
private String interbet_protocol;
private boolean identity_card;
private LocalDate anniv;
private Nationalite nation ;
private Pays pays;

}
