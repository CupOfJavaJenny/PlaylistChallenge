package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        Integer n = playList.length;
        Integer nextSong = (-1 - startIndex + n) %n;
        Integer previousSong = (startIndex + 1 + n) %n;
        if (nextSong>previousSong){
            return nextSong;
        }else{

        return previousSong;
        }
    }
}
