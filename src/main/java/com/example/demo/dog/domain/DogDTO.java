package com.example.demo.dog.domain;

public class Dog {
        private String name;
        private String color;
        private String breed;
        private String hungry;


        public void setName(String name){//Consumer
            this.name = name;
        }
        public String getName(){//Supplier
            return this.name;
        }
        public void setColor(String color){
            this.color = color;
        }
        public String getColor(){
            return this.color;
        }
        public void setBreed(String breed){
            this.breed = breed;
        }
        public String getBreed(){
            return this.breed;
        }
        public void setHungry(String hungry){
            this.hungry = hungry;
        }
        public String getHungry(){
            return this.hungry;
        }

        @Override
        public String toString() {
            return String.format("이름%s 색깔%s 품종%s 배고픈여부%s",name,color,breed,hungry);
        }
    }
