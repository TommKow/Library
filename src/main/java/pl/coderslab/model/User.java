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
    @OneToOne
    private Book book;
    private boolean ban;
    private LocalDateTime devotionDate;
    @Column(nullable = false)
    private double penalty;

    public User() {
    }

    public User(String email, String password, Book book, boolean ban, LocalDateTime devotionDate, double penalty) {
        this.email = email;
        this.password = password;
        this.book = book;
        this.ban = ban;
        this.devotionDate = devotionDate;
        this.penalty = penalty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public LocalDateTime getDevotionDate() {
        return devotionDate;
    }

    public void setDevotionDate(LocalDateTime devotionDate) {
        this.devotionDate = devotionDate;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }
}
