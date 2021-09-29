package com.sphinx.test;

public class Student {
    int pops = Integer.parseInt(null);
    public int rollNo = 90;
    private String names = "";
    protected int marks = 89;

}
class Thoth extends Student{
    public void show(){
        System.out.println("thoth class" + rollNo);
    }
}