package pl.coderslab.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String email;
    private String password;
    private boolean ban;
    private LocalDateTime devotionDate;
    @Column(nullable = false)
    private double penalty;

    public User() {
    }
}
