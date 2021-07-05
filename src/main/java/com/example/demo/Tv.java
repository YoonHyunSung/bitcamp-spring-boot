package com.example.demo;
class TvControl{
    public static void main(String[] args) {
        Tv a1 = new Tv("lg");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP",2048);
        hTv.current_channel =11;
        System.out.println(hTv.resolution);
        // Tv on
        // 볼륨 키우기
        // 채널 바꾸기
    }
}



 class Tv {
     //속성
     String model_Name;
     int[] channel;
     int current_channel;
     int resolution;
     boolean power;
     String tv_name;

     Tv(String tv_name) {
         model_Name = "lgtv";
         resolution = 1024;
         power = false;
         current_channel = 0;
         channel = new int[100];
         for (int i = 0; i < channel.length; i++) {
             channel[i] = i + 1;

         }
     }//빈값일때 디폴트 생성자가 잡힌다 안에 코드입력시 디폴트가 풀림.
     Tv(String tv_name, int resolution){

     }
     //기능

     class TvAttribute {

     }
 }
