/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.pkg1_progra2_andreaescobar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class AdministradorCorreos {
    ArrayList<Personas> personas = new ArrayList();
    private File archivo = null;
    
    public AdministradorCorreos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(Personas p) {
        this.personas.add(p);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Personas listaPersona : personas) {
                bw.write(listaPersona.getNombre()+ ";");
                bw.write(listaPersona.getApellido()+ ";");
                bw.write(listaPersona.getCorreo()+ ";");
                bw.write(listaPersona.getFechanacimiento()+";");
                bw.write(listaPersona.getPais()+";");
                bw.write(listaPersona.getTel()+";");
                bw.write(listaPersona.getPass()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        if (archivo.exists()) {
            System.out.println("entre cargar");
            Scanner sc = null;
            personas = new ArrayList();

            try {
                sc = new Scanner(archivo.getPath());
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    personas.add(new Personas(sc.next(),sc.next(),sc.next(), new SimpleDateFormat("dd/MM/yyyy").parse(sc.next()),sc.next(), sc.nextInt(),sc.next()));
                    System.out.println(personas.size());
                    System.out.println("entre cargar 2");
                }
            } catch (Exception e) {
            }
            sc.close();
        } // fin if 
    }
}
