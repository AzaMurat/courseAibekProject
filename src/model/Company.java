package model;

public class Company {
    String nameCompany;
    String adressCompany;

    public Company(String nameCompany, String adressCompany) {
        this.nameCompany = nameCompany;
        this.adressCompany = adressCompany;
    }

    public Company() {
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getAdressCompany() {
        return adressCompany;
    }

    public void setAdressCompany(String adressCompany) {
        this.adressCompany = adressCompany;
    }

    @Override
    public String toString() {
        return "nameCompany : " + nameCompany + "\n" +
                "adressCompany : " + adressCompany + "\n";
    }
}
