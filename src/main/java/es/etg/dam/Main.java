package es.etg.dam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

    private static final String [] COMANDO = {"ls"};
    private static final String [] COMANDO1 = {"grep"};
    public static void main(String[] args) throws Exception{

        String ejecutar = execComando(COMANDO, null);
        String ejecutar1 = execComando(COMANDO1);

    }
    
    public static String execComando (String [] comm, String input)throws Exception{
        Process process = Runtime.getRuntime().exec(COMANDO);

        if(input!=null){
            try(PrintWriter pw = new PrintWriter (new OutputStreamWriter((process.getOutputStream())))){
                pw.print(input);
                pw.flush();
            } catch (Exception e) {
            }
        }
        StringBuilder builder = new StringBuilder();
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()))){
            String line;
            While((line=bf.readLine())!=null) {
                builder.append(line).append("/n");

            }
        }
        

    }
    




    }
