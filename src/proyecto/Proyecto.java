/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Maquina m1 = new Maquina();
       Maquina m2 = new Maquina();
       Simulador s = new Simulador();
       String menu = "1.Máquinas \n "
               + "2.Simulador \n" 
               + "3.Resultados \n"
               + "4.Salir \n";
       String menuMaquina = "1.Primera Máquina \n"
               + "2.Segunda Máquina \n"
               + "3.Regresar";
        String subMenuMaquina = "1.Introducir datos \n"
               + "2.Modificar datos \n"
               + "3.Regresar";
         String menuModificarDatos = "1.Precio de producto\n"
               + "2.Cantidad de producto por hora\n"
                  + "3.Costo de operación de máquina por hora\n" 
                  + "4.Grantía Máquina\n" 
                + "5.Estado de la máquina\n"
                + "6.Probabilidad de Fallo\n" 
               + "7.Regresar";
         
          String menuEstadoMaquina = "1.Buena \n"
               + "2.Mala \n"
               + "3.Regresar";
       
       String menuSubSimulador = 
               "1.Digite la cantidad de horas por dia en funcionamiento\n"
                 + "2.Digite la cantidad de dias por semana en funcionamiento \n" 
              + "3.Digite la cantidad de semanas en funcionamiento \n"
                 + "4.Digite la cantidad de meses por año en funcionamiento \n"
              + "5.Regresar \n" ;
         
         String menuSimulador = "1.Introducir datos \n"
               + "2.Modificar datos \n"
                 + "3.Simular trabajo\n"
               + "4.Regresar";
       
         
          
          
          
           int dato;
       do{
    dato = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" + menu));
    switch (dato){
        case 1:// Seria del menu principal maquinas
          // Caso 1 del Menu selecciona 1.maq 2.simu 3. salir 4.resul
           int dato1 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" + menuMaquina));
           int dato2;
          
           switch (dato1){
               
               case 1:// Caso del menu primera maquina
                   dato2 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" + subMenuMaquina));      
          switch (dato2){
              case 1:// introduce parametros a maquina  1
                   int info = Integer.parseInt(JOptionPane.showInputDialog("Digite precio producto"));
                  m1.setPrecioProducto(info);
                   info = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad producto por hora"));
                  m1.setCantProdporHora(info);
                   info = Integer.parseInt(JOptionPane.showInputDialog("Digite el costo de operación de la máquina por hora"));
                  m1.setCostoOperporHora(info);
                   info = Integer.parseInt(JOptionPane.showInputDialog("Digite la probabilidad de fallo"));
                  m1.setProbabilidadFallo(info); 
                   info = Integer.parseInt(JOptionPane.showInputDialog("Digite la garantía de la máquina en horas"));
                  m1.setGarantiaMaquina(info);
                 
//                  s.setA(m1);
                  break;
              case 2: // Modifica Parametros maquina 1
                   int dato4 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n" + menuModificarDatos));
                  switch(dato4){
                      case 1:
                          int info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite precio del producto"));
                  m1.setPrecioProducto(info1);
//                     s.setA(m1);
                           break;
                      case 2:
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad producto por hora"));
                  m1.setCantProdporHora(info1);
     //                s.setA(m1);
                           break;
                      case 3:
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el costo de operación de la máquina por hora"));
                  m1.setCostoOperporHora(info1);
//                     s.setA(m1);
                           break;
                           case 4:
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la garantia de la máquina"));
                  m1.setGarantiaMaquina(info1);
//                     s.setA(m1);
                           break;
                      
                     
                      case 5:// entraria a decidir si la maquina esta buena o mala
                   int dato5 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n" + menuEstadoMaquina));
                  switch(dato4){
                      case 1:
                    m1.estadoMaquina = "Buena";
                        break;
                       case 2:
                    m1.estadoMaquina = "Mala";
                    break;
                  }
                  break;
                      case 6 :
                          
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la probabilidad de fallo de la maquina"));
                  m1.setProbabilidadFallo(info1);
                           break;
                          
                 
                  }  
//             s.setA(m1);
          } 
               case 2: // Caso del menu segunda maquina
            int  dato3 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción:\n" + subMenuMaquina)); 
         switch(dato3){
             case 1:// Introduce datos a maquina 2
                 int info = Integer.parseInt(JOptionPane.showInputDialog("Digite precio del producto"));
                  m2.setPrecioProducto(info);
                  info = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad producto por hora"));
                  m2.setCantProdporHora(info);
                  info = Integer.parseInt(JOptionPane.showInputDialog("Digite el costo de operación de la máquina por hora"));
                  m2.setCostoOperporHora(info);
                   info = Integer.parseInt(JOptionPane.showInputDialog("Digite la garantía de la máquina en horas"));
                  m2.setGarantiaMaquina(info);
                   info= Integer.parseInt(JOptionPane.showInputDialog("Digite la probabilidad de fallo de la máquina"));
                  m2.setProbabilidadFallo(info);
                  
              
                    
                 break;
             case 2:// Modifica datos a maquina 2
                 int dato4 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n" + menuModificarDatos));
                  switch(dato4){
                       case 1:
                          int info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite precio producto"));
                  m2.setPrecioProducto(info1);
                
                           break;
                      case 2:
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad producto por hora"));
                  m2.setCantProdporHora(info1);
                 
                           break;
                      case 3:
                   info1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el costo de operación de la máquina por hora"));
                  m2.setCostoOperporHora(info1);
                  
                           break;
                     
                      case 4:
                   info1= Integer.parseInt(JOptionPane.showInputDialog("Digite la garantía de la máquina en horas"));
                  m2.setGarantiaMaquina(info1);
                 
                           break;
                          
                      case 5:// entraria a decidir si la maquina esta buena o mala
                   int dato5 = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción\n" + menuEstadoMaquina));
                  switch(dato4){
                      case 1:
                    m2.estadoMaquina = "Buena";
                        break;
                       case 2:
                    m2.estadoMaquina = "Mala";
                    break;
                  }
                      break;
                      case 6:
                 info1= Integer.parseInt(JOptionPane.showInputDialog("Digite la probabilidad de fallo de la maquina"));
                  m2.setProbabilidadFallo(info1);
                          
                  
                  }
                 break;
                 
                
           }
                   
             break;
           } 
           break;
           
        case 2:// Seria del menu principal simulador
            int dato6 = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción." + menuSimulador ));
        switch(dato6){
            case 1:// perdir datos meses dias y semanas
                 int info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de horas de operacion de la maquina"));
                s.setCantHorasporDia(info2);
                  info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de dias de operacion de la maquina"));
                  s.setCantDiasporSem(info2);
                  info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de semanas de operacion de la maquina"));
                  s.setCantSemanaporMes(info2);
                    info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de meses de operacion de la maquina"));
                  s.setCantMesesporAnho(info2);
                   
                 
                break;
            case 2://Modificar datos simulador
               int dato7  = Integer.parseInt(JOptionPane.showInputDialog("Digite el número que quiere modificar" + menuSubSimulador));
               
               switch (dato7){
             case 1: // Mpdificar datos simulador horas
               info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de horas de operacion de la maquina"));
                s.setCantHorasporDia(info2);
                break;
             case 2:
                  info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de dias de operacion de la maquina"));
                  s.setCantDiasporSem(info2);
                  break;
             case 3:
                  info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de semanas de operacion de la maquina"));
                  s.setCantSemanaporMes(info2);
                  break;
             case 4:
                    info2 = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de meses de operacion de la maquina"));
                  s.setCantMesesporAnho(info2);
                  break;
             
         
          }
            break;
            
            case 3: // Simulador trabajo
                System.out.println("Maquina 1");
                s.setA(m1);
                s.simular();
                System.out.println(s.getProductosPorHora());
                s.setA(m2);
                s.simular();
                System.out.println(s.getProductosPorHora());
                break;
        }
            break;
        case 3:
       
            break;
        
    }
    }while (dato != 4);
      
    }
}
