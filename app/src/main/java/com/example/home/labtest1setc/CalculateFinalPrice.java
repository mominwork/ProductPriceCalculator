package com.example.home.labtest1setc;

/**
 * Created by home on 6/20/2016.
 */
public class CalculateFinalPrice {

    private double productPrice;
    private float vat;
    private float discount;

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public float getVat() {
        return vat;
    }

    public float getDiscount() {
        return discount;
    }

    public double finalPriceCalculation(){

        double absoluteVAT = getProductPrice()*(getVat()/100);
        double absoluteDiscount = getProductPrice()*(getDiscount()/100);

        double finalPrice =(getProductPrice()+absoluteVAT)-absoluteDiscount;

        return finalPrice;

    }
}
