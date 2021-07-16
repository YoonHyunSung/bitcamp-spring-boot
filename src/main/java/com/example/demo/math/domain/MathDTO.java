package com.example.demo.math.domain;

import lombok.Data;

@Data
public class MathDTO {//domain에서는 변수선언.
    private int num1;
    private int num2;
    private int result;
    private  String opcode;

   /* public void setNum1(int num1){//
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
*/
    @Override
    public String toString() {
        return String.format("%d %s %d = %d",num1,opcode,num2,result);
    }
}
