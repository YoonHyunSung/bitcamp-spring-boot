package com.example.demo.tv;
class TvControl {
    public static void main(String[] args){
        Tv lgTv = new Tv("LG");
        Tv sTv = new Tv("samsung");
        Tv hTv = new Tv("HP", 2048);
        System.out.println(hTv.current_channel);
        hTv.setCurrent_channel(11);
        System.out.println(hTv.getCurrent_channel());
        System.out.println(hTv.resolution);


        System.out.println(hTv.add(10));


// Tv 켜기
// 볼륨 키우기
// 채널 바꾸기
    }
}
public class Tv {
    // 속성
    String model_name;
    int[] channel;
    int current_channel;
    int resolution;
    boolean power;

    Tv(String tv_name) {
        model_name = tv_name;
        resolution = 1024;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for (int i = 0; i < channel.length; i++) {
            channel[i] = i + 1;
        }
    }

    Tv(String tv_name, int resolution) {
        model_name = tv_name;
        this.resolution = resolution;
        power = false;
        current_channel = 0;
        channel = new int[100];
        for (int i = 0; i < channel.length; i++) {
            channel[i] = i + 1;
        }
    }

    public int[] getChannel() {
        return channel;
    }

    public void setChannel(int[] channel) {
        this.channel = channel;
    }

    // Getter Setter
    public int getCurrent_channel() {
        return current_channel;
    }

    public void setCurrent_channel(int current_channel) {
        if (current_channel > 100){
            System.out.println("입력오류 : 없는 채널입니다.");
        }else {
            this.current_channel  = current_channel;
        }
    }

    public int add(int num){
        int result = num + 10;
        return  result;
    }
    class Speaker {
        int dolby;

    }

}
// 기능