/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection;

import java.net.*;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ReadHeader {

    public void read() {
        try {
            URL url = new URL("http://www.oreilly.com");
            URLConnection uc = url.openConnection();
//            String contentType = uc.getContentType();
//            int contentLength = uc.getContentLength();
//            Date documentSent = new Date(uc.getDate());
//            
//            System.out.println("contentType: " + contentType);
//            System.out.println("contentLength: " + contentLength);
//            System.out.println("Date:" + documentSent);

            System.out.println("Content-type: " + uc.getContentType());
            if (uc.getContentEncoding() != null) {
                System.out.println("Content-encoding: "
                        + uc.getContentEncoding());
            }
            if (uc.getDate() != 0) {
                System.out.println("Date: " + new Date(uc.getDate()));
            }
            if (uc.getLastModified() != 0) {
                System.out.println("Last modified: "
                        + new Date(uc.getLastModified()));
            }
            if (uc.getExpiration() != 0) {
                System.out.println("Expiration date: "
                        + new Date(uc.getExpiration()));
            }
            if (uc.getContentLength() != -1) {
                System.out.println("Content-length: " + uc.getContentLength());
            }
        } catch (Exception e) {
        }
    }
}
