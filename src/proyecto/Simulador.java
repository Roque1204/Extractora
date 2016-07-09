/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Roxana
 */
public class Simulador {

    Maquina m1;

    public Simulador() {

    }

    int cantHorasporDia;
    int horasTotales;
    int cantSemanaporMes;
    int cantMesesporAnho;
    int horasProductivas;
    int randomNumber = (int) (Math.random() * 100 + 1);

//     Maquina uno metodos 
    public void calcularHoras() {

        if (cantMesesporAnho >= 1) {
            horasTotales = (cantMesesporAnho * 4) + cantSemanaporMes;
            horasTotales = (cantSemanaporMes * horasTotales) * cantHorasporDia;

        }
        if (cantMesesporAnho == 0) {
            horasTotales = (cantSemanaporMes * horasTotales) * cantHorasporDia;
        }
    }

    public void repararMaquina() {
        while (m1.garantiaMaquina > 0) {
            m1.garantiaMaquina--;
            horasTotales--;
        }

        m1.setEstadoMaquina("Buena");
        m1.setRandomNumber((int) (Math.random() * 100 + 1));
    }

    public double getProductosPorHora() {

        int totalProductos;
        double totalPrecio;
        totalProductos = (horasProductivas * m1.getCantProdporHora());
        totalPrecio = (totalProductos * m1.getPrecioProducto());

        return totalPrecio;
    }

    public void simular() {
        calcularHoras();

        while (horasTotales > 0) {

            if (m1.estadoMaquina().equals("Buena")) {
                horasProductivas++;
                horasTotales--;
            } else {
                //decir al usuario esta mala
                repararMaquina();
            }

        }

    }

//    public int productosPorHora(){
//        
//    System.out.println("prodhora 1    "+m1.getCantProdporHora());
//    int productosTotal=m1.getCantProdporHora()* calcDias();
//    
//    return productosTotal;
//    }
//    
//    public  double getProduccionPorHora() {
//        int totalHoras =0;
//     m1.estadoMaquina();
//       
//      if(getA().estadoMaquina.equals("Mala")){
//       int contadorGarantia =0;
//       int contadorGM =m1.getGarantiaMaquina();
//       
//       if (contadorGM != contadorGarantia){
//           
//       if (contadorGarantia == 0){
//          
//    //   horas trabajabas producto que lleva a esa hora, fecha, 0produccion en ese momento.
//        
//       contadorGarantia++;
//   
//       
//       } 
//       else{
//           
//        contadorGarantia++; 
//        }
//       
//     
//   } 
//       
//      m1.estadoMaquina = "Buena";
//       totalHoras= calcDias()-m1.getGarantiaMaquina();
//       
//       
//    } 
//   
//   return totalHoras ;
//     
//    // MAQUINA ESTA BUENA Y ARRANCA PRODUCCION TIEMPO QUE DURO MALA FECHA Q SE ARREGLO
//    
//    
//    }
//    
//
//
//
//// Maquina dos Metodos
////    public String EstadoMaquina2()
////
////        int numer = GenerarAleatorio();
////        if (b.probabilidadFallo >= numer) {
////            b.estadoMaquina = "Mala";
////            System.out.println(b.probabilidadFallo);
////            System.out.println("Fallo" + b.estadoMaquina);
////        }
////        if (b.probabilidadFallo < numer) { //else
////            b.estadoMaquina = "Buena";
////            System.out.println(b.probabilidadFallo);
////        }
////
////        return "Estado de  Maquina " + b.estadoMaquina;
////    }
//    public String simular() {
//        if (getA().estadoMaquina().equals("Buena") ) {
//        int horas = calcDias();
//        double x=1;
//        double total1 =0;
//        
//        total1= x * getA().cantProdporHora + total1;    
//            
//        }
//        
//        return "";
//    }
////        int horas = calcDias();
////        double x=1;
////        double total1 =0;
////        while (horas > 0 & getA().EstadoMaquina().equals("Buena") ) {
////             total1= x*getA().cantProdporHora + total1;
////             
////             System.out.println("----"+getA().cantProdporHora);
////            getA().EstadoMaquina();
////            x++;
////        
////            //total1 += a.getProduccionPorHora();
////            //total2 += b.getProduccionPorHora();
////            
////          horas--;
////        }
//////        if(horas > 0 & getA().estadoMaquina.equals("Mala") ){
//////            System.out.println("ML");
//////            getA().EstadoMaquina();
//////        }
////        return "Resultaos "+ total1+getA().EstadoMaquina();
//    
//
//    // Mostraremos si comprar o no la maquina
    public String decisionCompra() {
        return ("");
    }

    public int getCantHorasporDia() {
        return cantHorasporDia;
    }

    public void setCantHorasporDia(int cantHorasporDia) {
        this.cantHorasporDia = cantHorasporDia;
    }

    public int getCantDiasporSem() {
        return horasTotales;
    }

    public void setCantDiasporSem(int cantDiasporSem) {
        this.horasTotales = cantDiasporSem;
    }

    public int getCantSemanaporMes() {
        return cantSemanaporMes;
    }

    public void setCantSemanaporMes(int cantSemanaporMes) {
        this.cantSemanaporMes = cantSemanaporMes;
    }

    public int getCantMesesporAnho() {
        return cantMesesporAnho;
    }

    public void setCantMesesporAnho(int cantMesesporAnho) {
        this.cantMesesporAnho = cantMesesporAnho;
    }

    public Maquina getA() {
        return m1;
    }

    public void setA(Maquina m1) {
        this.m1 = m1;
    }

}
