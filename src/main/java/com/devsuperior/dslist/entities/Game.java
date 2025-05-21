package com.devsuperior.dslist.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name= "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUUrl;
    private String shortDescription;
    private String Longdescription;

    public Game() {

    }

    public Game( long id, String title, Integer year, String genre, String platform, String imgUUrl, String shortDescription, String Longdescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platform = platform;
        this.imgUUrl = imgUUrl;
        this.shortDescription = shortDescription;
        this.Longdescription = Longdescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getYear() {

        return year;

    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getPlatform() {
        return platform;
    }
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    public String getImgUUrl() {
        return imgUUrl;
    }
    public void setImgUUrl(String imgUUrl) {
        this.imgUUrl = imgUUrl;
    }
    public String getShortDescription() {

        return shortDescription;

    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getLongdescription() {
        return Longdescription;
    }
    public void setLongdescription(String longdescription) {
        Longdescription = longdescription;
    }
    public int hashCode(){
        return Objects.hash(id);    }
    public boolean equals(Object obj){
         if (this == obj)
             return true;
         if(obj == null)
             return false;
         if(getClass() != obj.getClass())
             return false;
         Game other = (Game) obj;
         return Objects.equals(id, other.id);
    }

}
