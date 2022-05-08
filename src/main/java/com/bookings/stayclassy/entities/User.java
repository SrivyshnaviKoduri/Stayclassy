package com.bookings.stayclassy.entities;

import lombok.*;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Entity
@ToString
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    Integer userId;

    @Column(name="user_name")
    String userName;

    @Column(name="email")
    String email;

    @Column(name="password")
    String password;

}
