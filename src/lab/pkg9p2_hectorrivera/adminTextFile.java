/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg9p2_hectorrivera;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hriverav
 */
public class adminTextFile {
    private File filetxt = null;
    private String txt = "";

    public adminTextFile() {
    }
    public adminTextFile(String filepath) {
        this.filetxt = new File(filepath);
    }

    public File getFiletxt() {
        return filetxt;
    }

    public void setFiletxt(File filetxt) {
        this.filetxt = filetxt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    

    
    public void addTofile() throws IOException {
        FileWriter fw = null;
        BufferedWriter bfw = null;
        
        try {
            fw = new FileWriter(filetxt,false);
            bfw = new BufferedWriter(fw);

            
            bfw.write(txt);
            bfw.newLine();
                

            bfw.flush();
        } catch (IOException e) {
        }
        bfw.close();
        fw.close();
        
    }
    
    public void readFile(){
        Scanner sc = null;
        txt = "";
        try {
            if (filetxt.exists()) {
                sc = new Scanner(filetxt);
                
                while (sc.hasNextLine()) {
                    String Line = sc.nextLine();
                    txt = txt + Line +"\n";
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }

    @Override
    public String toString() {
        return "adminTextFile{" + "filetxt=" + filetxt + ", txt=" + txt + '}';
    }
    
    
}
