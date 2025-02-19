package co.edu.unipiloto;

import java.util.ArrayList;

public class Razas {
    private final ArrayList<String> Pastores;
    private final ArrayList<String> Schnauzer;
    private final ArrayList<String> Terriers;
    private final ArrayList<String> Mastines;

    public Razas(){
        Pastores = new ArrayList<>();
        Pastores.add("Alemán");
        Pastores.add("Catalán");
        Pastores.add("Australiano");
        Pastores.add("Belga");
        Pastores.add("Blanco Suizo");

        Schnauzer = new ArrayList<>();
        Schnauzer.add("Gigante");
        Schnauzer.add("Mediano");
        Schnauzer.add("Miniatura");

        Terriers = new ArrayList<>();
        Terriers.add("Yorkshire");
        Terriers.add("Bull");
        Terriers.add("Fox");
        Terriers.add("Airedale");
        Terriers.add("Border");

        Mastines = new ArrayList<>();
        Mastines.add("Español");
        Mastines.add("Napolitano");
        Mastines.add("Tibetano");
        Mastines.add("Inglés");
        Mastines.add("Tosa Inu");
    }

    public ArrayList<String> getBrands(String nombre){
        switch (nombre){
            case "Pastores":
                return Pastores;
            case "Schnauzer":
                return Schnauzer;
            case "Terriers":
                return Terriers;
            case "Mastines":
                return Mastines;
            default:
                return null;
        }
    }
}
