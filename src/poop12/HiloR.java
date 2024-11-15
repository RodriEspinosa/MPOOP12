/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo03alu20
 */
// Definición de la clase HiloR que implementa la interfaz Runnable para crear un hilo
public class HiloR implements Runnable {
    // Sobrescribe el método run(), que define el código que ejecutará el hilo
    @Override
    public void run() {
        // Bucle para realizar 10 iteraciones
        for (int i = 0; i < 10; i++) {
            // Imprime el número de iteración y el nombre del hilo actual
            System.out.println("Iteracion " + i + " " + Thread.currentThread().getName());
        }
        // Imprime un mensaje indicando que el hilo ha terminado
        System.out.println("Termina el " + Thread.currentThread().getName());
    }
    
}
