package com.example.musicalstructureapp;

public class Songs  {

    // Each object of Songs has three properties: song name, album name and images.
    private  String msongName;
    private String malbumName;
    private  int malbumImages;

    // New object for Songs

    public Songs(String name, String albumName, int images) {
        msongName = name;
        malbumName = albumName;
        malbumImages = images;
    }
    /*
    *  Get the song name, album name and image of the album.
    */
    public String getSongName() {
        return msongName;
    }

    public String getAlbumName() {
        return malbumName;
    }

    public int getAlbumImages() {
        return malbumImages;
    }

}

