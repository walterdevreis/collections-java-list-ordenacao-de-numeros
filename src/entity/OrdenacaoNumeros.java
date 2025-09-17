package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

    List<Integer> listaDeNumeros;

    public OrdenacaoNumeros(){
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaDeNumeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(listaDeNumeros);

        System.out.println("Ordena os números da lista em ordem ascendente: " + listaDeNumeros);
    }

    public void ordenarDescendente(){
        Collections.sort(listaDeNumeros.reversed());

        System.out.println("Ordena os números da lista em ordem descendente: " + listaDeNumeros);
    }
}
