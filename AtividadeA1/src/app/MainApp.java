/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Marca;
import entity.Modelo;
import entity.Veiculo;
import java.util.Scanner;

/**
 *
 * @author mpisching
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Marca m1 = new Marca();
        System.out.print("Id.......: ");
        m1.setId(entrada.nextInt());
        System.out.print("Nome.....: ");
        m1.setNome(entrada.next());
        
        Marca m2 = new Marca();
        System.out.print("Id.......: ");
        m2.setId(entrada.nextInt());
        System.out.print("Nome.....: ");
        m2.setNome(entrada.next());
        
        Modelo md1 = new Modelo();
        System.out.print("Id.......: ");
        md1.setId(entrada.nextInt());
        System.out.print("Descricao: ");
        md1.setDescricao(entrada.next());
        md1.setMarca(m2);
        
        Modelo md2 = new Modelo();
        System.out.print("Id.......: ");
        md2.setId(entrada.nextInt());
        System.out.print("Descricao: ");
        md2.setDescricao(entrada.next());
        md2.setMarca(m1);
        
        Veiculo v1 = new Veiculo();
        System.out.print("id......: ");
        v1.setId(entrada.nextInt());
        System.out.print("Placa...: ");
        v1.setPlaca(entrada.next());
        v1.setModelo(md2);
        
        Veiculo v2 = new Veiculo();
        System.out.print("id......: ");
        v2.setId(entrada.nextInt());
        System.out.print("Placa...: ");
        v2.setPlaca(entrada.next());
        v2.setModelo(md2);        
        
        Veiculo v3 = new Veiculo();
        System.out.print("id......: ");
        v3.setId(entrada.nextInt());
        System.out.print("Placa...: ");
        v3.setPlaca(entrada.next());
        v3.setModelo(md1);

        imprimir(v1);
        imprimir(v2);
        imprimir(v3);
        
    }
    
    private static void imprimir(Veiculo v) {
        System.out.println("**** Dados do veículo **** ");
        System.out.println("Id...........: " + v.getId());
        System.out.println("Placa........: " + v.getPlaca());
        System.out.println("Modelo.......: " + v.getModelo().getDescricao());
        System.out.println("Marca........: " + v.getModelo().getMarca().getNome());
        System.out.println("===========================\n");
    }
}
