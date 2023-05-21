package com.sastaticket.hackathon.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capital")
    private String capital;

    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
    @JsonIgnore
    private CountryDetails details;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<CountryImages> images;

    @OneToOne(mappedBy = "country",cascade = CascadeType.ALL)
    @JsonIgnore
    private Visa visa;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<FAQ> faq;

    @ManyToMany(mappedBy = "country")
    @JsonIgnore
    private List<Document> document;
}
