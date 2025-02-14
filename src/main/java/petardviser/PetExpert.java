package petardviser;

import java.util.ArrayList;

public class PetExpert {
    ArrayList<String> recomendacion;
    String petType;
    public PetExpert(String petType) {
        recomendacion = new ArrayList<>();
        this.petType = petType;
    }
    public ArrayList<String> getPets(){

        switch(petType){
            case "Retrievers":
                recomendacion.add("Labrador Retriever");
                recomendacion.add("Golden Retriever");
                recomendacion.add("Chesapeake Bay Retriever");
                recomendacion.add("Flat-Coated Retriever");
                break;
            case "Terriers":
                recomendacion.add("Jack Russell Terrier");
                recomendacion.add("Bull Terrier");
                recomendacion.add("Fox Terrier");
                recomendacion.add("Scottish Terrier");
                break;
            case "Pastores":
                recomendacion.add("Pastor catalán");
                recomendacion.add("Pastor alemán");
                recomendacion.add("Komodor");
                recomendacion.add("Pastor Australiano");
                break;
            case "Pinscher":
                recomendacion.add("Dobermann");
                recomendacion.add("Pinscher alemán");
                recomendacion.add("Pinscher miniatura");
                recomendacion.add("Schnauzer");
                break;
        }
        return recomendacion;
    }
}
