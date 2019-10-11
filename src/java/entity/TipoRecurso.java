/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Raul A. Hernandez
 */
public enum TipoRecurso {

    SALON("SALÓN"),
    SALA("SALA");

    private final String label;

    private TipoRecurso(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}