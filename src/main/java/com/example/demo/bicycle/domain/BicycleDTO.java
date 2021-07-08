package com.example.demo.bicycle.domain;
//접근제어자 public 어떤 클래스에서도 접근이 가능하다.
public class Bicycle{
    private int gear;//variable 변수
    private String company;
    private int speed;

    public void setGear(int gear){
        this.gear = gear;
    }
    public int  getGear(){
        return this.gear;
    }
    public void setCompany(String company){
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    public void setSpeed(int speed){//controller패키지에서 받은speed값을 Bicycle클래스에 멤버 변수에 값을 저장하기 위하여 동일한 이름이기 때문에 this로 구분.
        this.speed = speed;
    }
    //getter 에서는 출력 값의 타입을 지정해준다.
    public int getSpeed(){
        return this.speed;
    }

    @Override//
    public String toString() {//model
        return String.format( "기어갯수 : %d,회사 : %s, 최고속력 : %d",gear,company,speed);
    }
}