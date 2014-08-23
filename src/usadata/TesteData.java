/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package usadata;

import data.Data;        
import data.DataHora;
import data.Hora;

        
/**
 *
 * @author MEUS DOCUMENTOS
 */

public class TesteData {
    
public static void main(String[] args){
    
    Data data=new Data(12,12,2014);
    Hora hora= new Hora(1,30);
    
    Data data2=new Data(12,12,2014);
    Hora hora2= new Hora(1,30);

    
    
    DataHora dataHora= new DataHora(data,hora);
    DataHora dataHora2= new DataHora(data2,hora2);
    
    
    System.out.println(String.format("Data e Hora:%s", dataHora.toString()));
    
    if(dataHora.equals(dataHora2)){
        System.out.println("DataHora iguais");
    }else{
        System.out.println("DataHora diferentes");
    }
    
}
    
}
