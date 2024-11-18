/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.*;

public class test {

    // Cuadro de tipos reducido para los tipos especificados
    private static final Map<String, Map<String, Double>> typeChart = new HashMap<>();

    static {
        // Inicialización del cuadro de tipos
        Map<String, Double> agua = new HashMap<>();
        agua.put("Fuego", 2.0);
        agua.put("Tierra", 2.0);
        agua.put("Roca", 2.0);
        agua.put("Agua", 0.5);
        agua.put("Planta", 0.5);
        agua.put("Dragón", 0.5);

        Map<String, Double> fuego = new HashMap<>();
        fuego.put("Planta", 2.0);
        fuego.put("Hielo", 2.0);
        fuego.put("Bicho", 2.0);
        fuego.put("Acero", 2.0);
        fuego.put("Agua", 0.5);
        fuego.put("Roca", 0.5);
        fuego.put("Fuego", 0.5);
        fuego.put("Dragón", 0.5);

        Map<String, Double> planta = new HashMap<>();
        planta.put("Agua", 2.0);
        planta.put("Tierra", 2.0);
        planta.put("Roca", 2.0);
        planta.put("Fuego", 0.5);
        planta.put("Planta", 0.5);
        planta.put("Veneno", 0.5);
        planta.put("Volador", 0.5);
        planta.put("Bicho", 0.5);
        planta.put("Acero", 0.5);
        planta.put("Dragón", 0.5);

        Map<String, Double> electrico = new HashMap<>();
        electrico.put("Agua", 2.0);
        electrico.put("Volador", 2.0);
        electrico.put("Tierra", 0.0);
        electrico.put("Eléctrico", 0.5);
        electrico.put("Planta", 0.5);
        electrico.put("Dragón", 0.5);

        Map<String, Double> acero = new HashMap<>();
        acero.put("Hielo", 2.0);
        acero.put("Roca", 2.0);
        acero.put("Hada", 2.0);
        acero.put("Fuego", 0.5);
        acero.put("Agua", 0.5);
        acero.put("Eléctrico", 0.5);
        acero.put("Acero", 0.5);

        Map<String, Double> dragon = new HashMap<>();
        dragon.put("Dragón", 2.0);
        dragon.put("Acero", 0.5);
        dragon.put("Hada", 0.0);

        // Asignar los cuadros de efectividad al mapa principal
        typeChart.put("Agua", agua);
        typeChart.put("Fuego", fuego);
        typeChart.put("Planta", planta);
        typeChart.put("Eléctrico", electrico);
        typeChart.put("Acero", acero);
        typeChart.put("Dragón", dragon);
    }

    /**
     * Verifica si un ataque es súper efectivo según el tipo del atacante y del defensor.
     *
     * @param ataqueTipo   El tipo del ataque (por ejemplo, "Fuego").
     * @param defensorTipo El tipo del Pokémon defensor (por ejemplo, "Planta").
     * @return Un mensaje indicando si el ataque es "Súper efectivo", "No muy efectivo", o "Sin efecto".
     */
    
    public static String validarEfectividad(String ataqueTipo, String defensorTipo) {
        // Validar si el tipo de ataque existe en el cuadro de tipos
        if (!typeChart.containsKey(ataqueTipo)) {
            return "Tipo de ataque '" + ataqueTipo + "' no reconocido.";
        }

        // Obtener el cuadro de efectividad para el tipo de ataque
        Map<String, Double> efectividades = typeChart.get(ataqueTipo);

        // Validar si el tipo defensor existe para el tipo de ataque
        if (!efectividades.containsKey(defensorTipo)) {
            return "Tipo de defensor '" + defensorTipo + "' no reconocido.";
        }

        // Obtener el modificador de daño
        double efectividad = efectividades.get(defensorTipo);

        // Determinar el resultado basado en el modificador
        if (efectividad == 2.0) {
            return "¡Es súper efectivo!";
        } else if (efectividad == 0.5) {
            return "No es muy efectivo...";
        } else if (efectividad == 0.0) {
            return "No tiene efecto.";
        } else {
            return "Es un ataque normal.";
        }
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        System.out.println(validarEfectividad("Agua", "Fuego"));   // ¡Es súper efectivo!
        System.out.println(validarEfectividad("Fuego", "Planta")); // ¡Es súper efectivo!
        System.out.println(validarEfectividad("Planta", "Agua"));  // ¡Es súper efectivo!
        System.out.println(validarEfectividad("Eléctrico", "Tierra")); // No tiene efecto.
        System.out.println(validarEfectividad("Acero", "Hada"));   // ¡Es súper efectivo!
        System.out.println(validarEfectividad("Dragón", "Hada"));  // No tiene efecto.
        System.out.println(validarEfectividad("Fuego", "Roca"));   // No es muy efectivo...
        System.out.println(validarEfectividad("Psiquico", "Dragón")); // Tipo de ataque 'Psiquico' no reconocido.
    }
}
