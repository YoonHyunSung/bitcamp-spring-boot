package com.example.demo.hiMart.controller;

import com.example.demo.hiMart.domain.PhoneApp;
import com.example.demo.hiMart.service.HiMartServiceImpl;
import com.example.demo.util.service.LambdaUtils;

import java.util.Scanner;

public class HiMartController extends LambdaUtils {
    PhoneApp app = new PhoneApp();
    private HiMartServiceImpl hiMartService;
    /*public HiMartController() {
        hiMartService = new HiMartServiceImpl();
        phoneApp = new PhoneApp();
    }*/

    public void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            print.accept("Menu 0-Exit 1-스마트폰 ");
            switch (scanner.next()) {
                case "0":
                    return;
                case "1":
                    phoneMain(scanner);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        }
    }

    public void phoneMain(Scanner scanner){
        PhoneApp.Phone phone = null;
        PhoneApp.CelPhone celPhone = null;
        PhoneApp.IPhone iPhone = null;
        PhoneApp.GalaxyNote galaxyNote = null;

        while(true){
            print.accept("[Menu] 0-종료 1-집전화 2-휴대폰 3-아이폰 4-갤럭시");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    phone = app.new Phone();
                    phone.setCall("여기 집이야 ... ");
                    phone.setCompany("금성");
                    phone.setKind("집전화");
                    print.accept(phone.toString());
                    break;
                case "2":
                    celPhone = app.new CelPhone();
                    celPhone.setCall("이동 중에 전화해");
                    celPhone.setCompany("LG");
                    celPhone.setKind("초콜릿폰");
                    celPhone.setMove("이동");
                    celPhone.isPortable();
                    print.accept(celPhone.toString());
                    break;
                case "3":
                    iPhone = app.new IPhone();
                    iPhone.setCall("아이폰으로 전화하고 있어..");
                    iPhone.setCompany("애플");
                    iPhone.setKind(PhoneApp.IPhone.BRAND);
                    iPhone.setInternet("구글에 접속하다");
                    celPhone.setMove("이동");
                    print.accept(iPhone.toString());
                    break;
                case "4":
                    galaxyNote = app.new GalaxyNote();
                    galaxyNote.setCall("갤럭시노트로 전화하고 있어..");
                    galaxyNote.setCompany("삼성");
                    galaxyNote.setKind(PhoneApp.GalaxyNote.BRAND);
                    galaxyNote.setInternet("네이버에 접속하다");
                    celPhone.setMove("이동");
                    galaxyNote.setPencil("노트펜슬을 사용하다");
                    print.accept(galaxyNote.toString());
                    break;
            }
        }
    }
}