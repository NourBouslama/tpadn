package com.example.moviehorizental;

public class Movie {
    private String tiltle;
    private Integer imgURL;

    public Movie(String tiltle, Integer imgURL) {
        this.tiltle = tiltle;
        this.imgURL = imgURL;
    }

    public String getTiltle() {
        return tiltle;
    }

    public Integer getImgURL() {
        return imgURL;
    }
}
