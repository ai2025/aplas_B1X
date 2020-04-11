package org.aplas.basicapp;

public class Weight {
    private double gram;

    public Weight() {
        this.gram = 0;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public double getOunce() {
        return gram * 0.035274;
    }

    public void setOunce(double ounce) {
        this.gram = ounce / 0.0352741;
    }

    public double getPound() {
        return gram * 0.00220462;
    }

    public void setPound(double pound) {
        this.gram = pound / 0.00220462;
    }

    //    Grm,Onc, Pnd
    double convert(String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("Grm") && convUnit.equals("Onc")) {
            setGram(value);
            return getOunce();
        } else if (oriUnit.equals("Grm") && convUnit.equals("Pnd")) {
            setGram(value);
            return getPound();
        } else if (oriUnit.equals("Onc") && convUnit.equals("Grm")) {
            setOunce(value);
            return getGram();
        } else if (oriUnit.equals("Onc") && convUnit.equals("Pnd")) {
            setOunce(value);
            return getPound();
        } else if (oriUnit.equals("Pnd") && convUnit.equals("Grm")) {
            setPound(value);
            return getGram();
        } else if (oriUnit.equals("Pnd") && convUnit.equals("Onc")) {
            setPound(value);
            return getOunce();
        } else {
            return value;
        }
    }
}
