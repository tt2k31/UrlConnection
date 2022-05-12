/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection;

import java.io.*;
import java.net.*;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ConfiguringConnection {

    public void read() {
        // Initialize a Date object with the current date and time
        Date today = new Date();
        long millisecondsPerDay = 24 * 60 * 60 * 1000;

        try {
            URL u = new URL("http://www.oreilly.com/");
            URLConnection uc = u.openConnection();
            System.out.println(uc.getURL());

            //truy suất tài liệu từ bao giờ
            System.out.println("Original if modified since: "
                    + new Date(uc.getIfModifiedSince()));
            uc.setIfModifiedSince((new Date(today.getTime()
                    - millisecondsPerDay)).getTime());
            System.out.println("Will retrieve file if it's modified since "
                    + new Date(uc.getIfModifiedSince()));
            try ( InputStream in = new BufferedInputStream(uc.getInputStream())) {
                Reader r = new InputStreamReader(in);
                int c;
                while ((c = r.read()) != -1) {
                    System.out.print((char) c);
                }
                System.out.println();
            }

            //yêu cầu thời gian chờ kết nối 30 giây và thời gian chờ đọc 45 giây
            uc.setConnectTimeout(30000);
            uc.setReadTimeout(45000);

        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
