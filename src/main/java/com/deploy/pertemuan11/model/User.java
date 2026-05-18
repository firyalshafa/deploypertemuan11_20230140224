package com.deploy.pertemuan11.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@Table(name = "users") // Disarankan 'users' karena 'user' adalah reserved keyword di beberapa DB
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private String id;
    private String username;
    private String password;

    // AMAN: Menggunakan tipe data Profile, bukan String
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Profile profile;
}