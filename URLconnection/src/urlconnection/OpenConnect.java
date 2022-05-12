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
public class OpenConnect {
    public void open() {
        try {
            URL url = new URL("https://www.google.com.vn/");
            URLConnection uc = url.openConnection();
            System.out.println("URL is " + url.toString());
            System.out.println("protocol is "
                    + url.getProtocol());
            System.out.println("authority is "
                    + url.getAuthority());
            System.out.println("file name is " + url.getFile());
            System.out.println("host is " + url.getHost());
            System.out.println("path is " + url.getPath());
            System.out.println("port is " + url.getPort());
            System.out.println("default port is "
                    + url.getDefaultPort());
            System.out.println("query is " + url.getQuery());
            System.out.println("ref is " + url.getRef());
// read from the URL...

            
        } catch (MalformedURLException ex) {
            System.err.println(ex);
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
