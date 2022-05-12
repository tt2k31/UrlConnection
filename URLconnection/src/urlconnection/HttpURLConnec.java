/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class HttpURLConnec {

    public void read() {
        //thời gian khi một URL được thay đổi lần cuối
        try {
            
            URL u = new URL("http://www.ibiblio.org/xml/");
            HttpURLConnection http = (HttpURLConnection) u.openConnection();
            http.setRequestMethod("HEAD");
            System.out.println(u + " was last modified at "
                    + new Date(http.getLastModified()));
        } catch (MalformedURLException ex) {
            System.err.println(" is not a URL I understand");
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println();
    }

}
