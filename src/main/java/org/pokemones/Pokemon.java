package org.pokemones;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
    @JsonProperty("id")
    private String id;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("nivel")
    private int nivel;
    @JsonProperty("hp")
    private int hp;
    @JsonProperty("ataque")
    private double ataque;
    @JsonProperty("defensa")
    private double defensa;
    @JsonProperty("ataqueEspecial")
    private double ataqueEspecial;
    @JsonProperty("defensaEspecial")
    private double defensaEspecial;
    @JsonProperty("velocidad")
    private double velocidad;
    @JsonProperty("esMacho")
    private boolean macho;
    @JsonProperty("entrenador")
    private String entrenador;
    @JsonProperty("ubicacion")
    private String ubicacion;
    @JsonProperty("tipo")
    private String tipo;

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isMacho() {
        return macho;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public double getDefensa() {
        return defensa;
    }

    @Override
    public String toString() {
        final String multilinea = """
                {
                  id : %s,
                  nombre : %s,
                  nivel : %d,
                  hp : %d,
                  ataque : %.2f,
                  defensa : %.2f,
                  ataqueEspecial : %.2f,
                  defensaEspecial : %.2f,
                  velocidad : %.2f,
                  esMacho : %s,
                  entrenador : %s
                  ubicacion : %s
                  tipo : %s
                  }
                """;
        return String.format(multilinea,
                id,
                nombre,
                nivel, hp, ataque, defensa, ataqueEspecial, defensaEspecial, velocidad, macho, entrenador, ubicacion, tipo);
    }
}
