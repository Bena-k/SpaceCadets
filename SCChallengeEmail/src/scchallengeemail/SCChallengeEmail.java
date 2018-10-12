/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scchallengeemail;
import java.util.Scanner;
import java.net.*;
import java.io.*;
/**
 *
 * @author Lamptington
 */
public class SCChallengeEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String emailID = sc.nextLine();
        URL url = new URL("https://www.ecs.soton.ac.uk/people/" + emailID);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(url.openStream()));
        String inputLine;
        String nameLine = "";
        int line = 0;
        while ((inputLine = in.readLine()) != null && line < 9){
            if(line == 8){
                nameLine = inputLine;                
            }
            line++;
        }
        in.close();
        //System.out.println(nameLine.substring(11));
        //System.out.println(nameLine.substring(11).split("\\|").length);
        String name = (nameLine.substring(11).split("\\|"))[0];
        System.out.println(name);
        
    }
    
}
