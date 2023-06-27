package com.example.lmservice.benefit;

import javax.persistence.*;

@Entity
@Table
public class Benefit {
    @Id
    @SequenceGenerator(
            name = "benefit_sequence",
            sequenceName = "benefit_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "benefit_sequence"
    )
    private long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String link;
    private String imageurl;

    public Benefit() {
    }

    public Benefit(long id,
                   String name,
                   String description,
                   String link,
                   String imageurl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.imageurl = imageurl;
    }

    public Benefit(String name,
                   String description,
                   String link,
                   String imageurl) {
        this.name = name;
        this.description = description;
        this.link = link;
        this.imageurl = imageurl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImageUrl() {
        return imageurl;
    }

    public void setImageUrl(String imageurl) {
        this.imageurl = imageurl;
    }

}
