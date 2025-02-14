package beeradviser;

import java.util.ArrayList;
public class BeerExpert {
    ArrayList <String> recomendacion;
    String beerType;
    public BeerExpert(String beerType) {
        recomendacion = new ArrayList<>();
        this.beerType = beerType;
    }
    public ArrayList<String> getBrands(){

        switch(beerType){
            case "Light":
                recomendacion.add("Jail Pale Ale");
                recomendacion.add("Gout Stout");
                break;
            case "Amber":
                recomendacion.add("Jack Amber");
                recomendacion.add("Red Moose");
                break;
            case "Brown":
                recomendacion.add("Rogue Hazelnut Brown Nectar");
                recomendacion.add("Bell’s Best Brown Ale");
                break;
            case "Dark":
                recomendacion.add("Ayinger Celebrator Doppelbock ");
                recomendacion.add("Baltika 6 Porter");
                break;
        }
        return recomendacion;
    }
}
