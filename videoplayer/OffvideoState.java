package com.j2.state.videoplayer;  
public class OffvideoState implements State {  
  VideoPlayer videoplayer;  
  public OffvideoState(VideoPlayer videoplayer) {  
    this.videoplayer = videoplayer;  
     }  
  public void onVideoState(){
    System.out.println("video on");
  } 
  public void offVideoState(){
    System.out.println("video off");
  }  
  public void playVideoState(){
    System.out.println("play video");}
  public void stopplayVideoState(){
    System.out.println("already video stop"); }
  public void display(){
    System.out.println("display is the end");}  
} 