package com.example.assigmant2;

public class Data {
    private int image;
    private String fName;
    private String detiles;

    public Data(int image, String fName, String detiles) {
        this.image = image;
        this.fName = fName;
        this.detiles = detiles;
    }

    public int getImage() {
        return image;
    }

    public String getfName() {
        return fName;
    }

    public String getDetiles() {
        return detiles;
    }
}
