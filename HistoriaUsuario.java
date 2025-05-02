/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga;

/**
 *
 * @author PC
 */
class HistoriaUsuario {
    String id, rol, funcionalidad, razon, criterio, contexto, evento, resultadoEsperado;

    public HistoriaUsuario(String id, String rol, String funcionalidad, String razon,
                           String criterio, String contexto, String evento, String resultadoEsperado) {
        this.id = id;
        this.rol = rol;
        this.funcionalidad = funcionalidad;
        this.razon = razon;
        this.criterio = criterio;
        this.contexto = contexto;
        this.evento = evento;
        this.resultadoEsperado = resultadoEsperado;
    }

    public void imprimir() {
    System.out.println("== Detalles de la Historia de Usuario ==");
    System.out.println("Identificador: " + id);
    System.out.println("Rol: " + rol);
    System.out.println("Funcionalidad: " + funcionalidad);
    System.out.println("Razón: " + razon);
    System.out.println("Criterio: " + criterio);
    System.out.println("Contexto: " + contexto);
    System.out.println("Evento: " + evento);
    System.out.println("Resultado esperado: " + resultadoEsperado);
    System.out.println("=========================================");
    }
}
