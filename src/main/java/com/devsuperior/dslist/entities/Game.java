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
    private String platforms;
    private  Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Game() {

    }

    public Game( long id, String title, Integer year, String genre, String platform,Double score, String imgUUrl, String shortDescription, String Longdescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platform;
        this.score = score;
        this.imgUrl = imgUUrl;
        this.shortDescription = shortDescription;
        this.longDescription = Longdescription;
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
        return platforms;
    }
    public void setPlatform(String platform) {
        this.platforms = platform;
    }
    public void  setScore(Double score) {
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public String getImgUUrl() {
        return imgUrl;
    }
    public void setImgUUrl(String imgUUrl) {
        this.imgUrl = imgUUrl;
    }
    public String getShortDescription() {

        return shortDescription;

    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public String getLongdescription() {
        return longDescription;
    }
    public void setLongdescription(String longdescription) {
        longDescription = longdescription;
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
