package com.j2.state.videoplayer;  

public class PlayvideoState implements State {  
  VideoPlayer videoplayer;  
  public PlayvideoState(VideoPlayer video) {  
    this.videoplayer = videoplayer;  
  }  
 public void onVideoState(){
 System.out.println("video on!");
 } 
 
 public void offVideoState(){
   System.out.println("video off ");
 }  
 
 public void playVideoState(){
   System.out.println("playing video ");
 }
 
 public void stopplayVideoState(){
   System.out.println("stop play video!"); 
 }
 
 public void display(){
   System.out.println("display is the end");}  
}  