package com.company;

public class dog {
        private String name;
        private int age;
        public dog(String n) {
            name = n;
            age = 3;
        }
        public dog() {
            name = "Baron";
            age = 3;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getName(String name) {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String toString(){
            return this.name+",age "+this.age;
        }
        public void intoHumanAge () {
            System.out.println(name + "'s age in human years is " + age * 7 + " years");
        }
}
