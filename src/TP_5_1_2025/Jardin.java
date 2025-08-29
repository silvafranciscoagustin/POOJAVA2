package TP_5_1_2025;

import java.util.ArrayList;

public class Jardin {
     private ArrayList<Planta> plantas;

     public Jardin() {
          this.plantas = new ArrayList<>();
     }

     public void addPlanta(Planta p){
          plantas.add(p);
     }

     public String mostrarTodos() {
          if (plantas.isEmpty()) return "No hay plantas en el jardín";
          String resultado = "";
          for (Planta p : plantas) {
               resultado += p + "\n--------------------\n"; // toString() se llama automáticamente
          }
          return resultado;
     }

     public ArrayList<Planta> getPlantas() {
          return new ArrayList<>(plantas);
     }

     public void setPlantas(ArrayList<Planta> plantas) {
          this.plantas = new ArrayList<>(plantas);
     }
}
