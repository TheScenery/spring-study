package io.thescenery.pojo;

public class Hello {
    private String str;

    public Hello() {
        System.out.println("Hello created");
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
