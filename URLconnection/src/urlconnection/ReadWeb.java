/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection;

import java.io.*;
import java.net.*;

/**
 *
 * @author Admin
 */
public class ReadWeb {

    public void read() {
        try {
// Open the URLConnection for reading 
            URL u = new URL("https://www.google.com.vn/");
            URLConnection uc = u.openConnection();
            try ( InputStream raw = uc.getInputStream()) {
// autoclose
                InputStream buffer = new BufferedInputStream(raw);
// chain the InputStream to a Reader
                Reader reader = new InputStreamReader(buffer);
                int c;
                while ((c = reader.read()) != -1) {
                    System.out.print((char) c);
                }
            }
        } catch (MalformedURLException ex) {
            System.err.println(" is not a parseable URL");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
