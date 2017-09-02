/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1_progra2_andreaescobar;

/**
 *
 * @author andre
 */
public class Mensajes {
    private String mensaje;
    private String destinatario;
    private String sender;

    public Mensajes() {
    }
    
    public Mensajes(String mensaje, String destinatario, String sender) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.sender = sender;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "mensaje=" + mensaje + ", destinatario=" + destinatario + ", sender=" + sender + '}';
    }
    
}
