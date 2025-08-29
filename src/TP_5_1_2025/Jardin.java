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

     public String mostrarPlantas(){
          if(!plantas.isEmpty()){
               for (Planta p :plantas) {
                    p.toString();
               }
          }
          return "Esta vacio" ;
     }

     public ArrayList<Planta> getPlantas() {
          return new ArrayList<>(plantas);
     }

     public void setPlantas(ArrayList<Planta> plantas) {
          this.plantas = new ArrayList<>(plantas);
     }
}
