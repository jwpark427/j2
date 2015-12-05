package com.j2.state.videoplayer;  

public class StopplayvideoState implements State {  
    VideoPlayer videoplayer;  
    public StopplayvideoState(VideoPlayer videoplayer) {  
      this.videoplayer = videoplayer;  
    }  
    public void onVideoState(){
      System.out.println("video on please");
    } 
    public void offVideoState(){
      System.out.println("video off please inserted");
    }  
    public void playVideoState(){
      System.out.println("video off insert please");}
    public void stopplayVideoState(){
      System.out.println("already video end insert please"); }
    public void display(){
      System.out.println("display is off ....");}  
} 