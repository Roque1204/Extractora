package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Roxana
 */
public class Maquina {

//    Simulador s = new Simulador();
    String nombreProducto = "Jugo de Naranja";
    int precioProducto;
    int cantProdporHora;
    int probabilidadFallo;
    int garantiaMaquina;
    int costoOperporHora;
    String estadoMaquina;
    int randomNumber;

    public Maquina() {
    }
    
    public Maquina(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String estadoMaquina() {
        if (probabilidadFallo >= randomNumber) {
            estadoMaquina = "Mala";
        } else {// if
            estadoMaquina = "Buena";
        }
        return estadoMaquina;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantProdporHora() {
        return cantProdporHora;
    }

    public void setCantProdporHora(int cantProdporHora) {
        this.cantProdporHora = cantProdporHora;
    }

    public int getProbabilidadFallo() {
        return probabilidadFallo;
    }

    public void setProbabilidadFallo(int probabilidadFallo) {
        this.probabilidadFallo = probabilidadFallo;
    }

    public int getGarantiaMaquina() {
        return garantiaMaquina;
    }

    public void setGarantiaMaquina(int garantiaMaquina) {
        this.garantiaMaquina = garantiaMaquina;
    }

    public int getCostoOperporHora() {
        return costoOperporHora;
    }

    public void setCostoOperporHora(int costoOperporHora) {
        this.costoOperporHora = costoOperporHora;
    }

    public String getEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(String estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

}
