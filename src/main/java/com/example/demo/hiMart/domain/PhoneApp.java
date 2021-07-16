package com.example.demo.hiMart.domain;


import com.example.demo.util.service.LambdaUtils;
import lombok.Data;

public class PhoneApp extends LambdaUtils {


    @Data public class Phone{

        protected String kind,company, call;
        @Override
        public String toString() {
            return "집전화기{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    '}';
        }
    }
    @Data public class CelPhone extends Phone{
        protected boolean portable;
        protected String move;

        @Override
        public String toString() {
            return "CelPhone{" +
                    "폰종류='" + kind + '\'' +
                    ", 제조사='" + company + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 이동='" + move + '\'' +
                    '}';
        }
    }
    @Data public class IPhone extends CelPhone{
        public final static String BRAND="아이폰";
        protected String internet;

        @Override
        public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    '}';
        }
    }
    @Data public class GalaxyNote extends IPhone{
        public final static String BRAND="갤럭시폰";
        protected String pencil;


        @Override
        public String toString() {
            return "스마트폰{" +
                    "폰종류='" + BRAND + '\'' +
                    ", 이동='" + move + '\'' +
                    ", 통화='" + call + '\'' +
                    ", 검색='" + internet + '\'' +
                    ", pencil='" + pencil + '\'' +
                    '}';
        }
    }
    //celPhone
    //IPhone
    //GalaxyNote
}
