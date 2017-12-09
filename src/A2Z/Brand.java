package A2Z;

import java.util.Vector;

public class Brand {
    private String Name;
    private String BrandID;
    private Vector<Model> Models;

    public Brand(){

    }

    public Brand(String name, String brandID) {
        Name = name;
        BrandID = brandID;
        Models=new Vector<>();
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrandID() {
        return BrandID;
    }

    public void setBrandID(String brandID) {
        BrandID = brandID;
    }

    public Vector<Model> getModels() {
        return Models;
    }

    public void setModels(Vector<Model> models) {
        Models = models;
    }

}