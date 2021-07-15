package com.example.demo.math.domain;
public class CalculatorDTO {//domain에서는 변수선언.
    private int num1;
    private int num2;
    private  String opcode;

    public void setNum1(int num1){//
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
    }
    public int getNum2(){
        return num2;
    }
    public void setOpcode(String opcode){
        this.opcode = opcode;
    }
    public String getOpcode(){
        return opcode;
    }

    @Override
    public String toString() {
        return String.format("%d + %d = %d",num1,num2,num1+num2);
    }
}
