package org.example.models;

public class Divisa {
    private String divisaOriginal;
    private String divisaConvertir;
    private Double valorConversion;

    public Divisa() {
    }

    public Divisa(String divisaOriginal, String divisaConvertir, Double valorConversion) {
        this.divisaOriginal = divisaOriginal;
        this.divisaConvertir = divisaConvertir;
        this.valorConversion = valorConversion;
    }

    public String getDivisaOriginal() {
        return this.divisaOriginal;
    }

    public void setDivisaOriginal(String divisaOriginal) {
        this.divisaOriginal = divisaOriginal;
    }

    public String getDivisaConvertir() {
        return this.divisaConvertir;
    }

    public void setDivisaConvertir(String divisaConvertir) {
        this.divisaConvertir = divisaConvertir;
    }

    public Double getValorConversion() {
        return this.valorConversion;
    }

    public void setValorConversion(Double valorConversion) {
        this.valorConversion = valorConversion;
    }
}