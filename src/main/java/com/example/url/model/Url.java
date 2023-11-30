package com.example.url.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Entity
public class Url {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Lob
    private String originUrl;

    private String shortLink;

    private LocalDate creationDate;

    private LocalDateTime expirationDate;

    public Url(long id, String originUrl, String shortLink, LocalDate creationDate, LocalDateTime expirationDate) {
        this.id = id;
        this.originUrl = originUrl;
        this.shortLink = shortLink;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
    }

    public Url() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", originUrl='" + originUrl + '\'' +
                ", shortLink='" + shortLink + '\'' +
                ", creationDate=" + creationDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
