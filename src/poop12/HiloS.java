/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;
/**
 *
 * @author Dell S
 */
public class HiloS {
    private Sincronizado recurso;  // Objeto compartido entre los hilos

    // Constructor que recibe el recurso compartido
    public HiloS(Sincronizado recurso) {
        this.recurso = recurso;
    }

    public void run() {
        // Llama al método sincronizado en el recurso compartido
        recurso.metodoSincronizado(Thread.currentThread().getName());
    }
}
