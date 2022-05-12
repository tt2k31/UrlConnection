/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package urlconnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class URLconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            menu();
            System.out.println("nhap lua chon");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    OpenConnect openConnect = new OpenConnect();
                    openConnect.open();
                    break;
                case 2:
                    ReadWeb rw = new ReadWeb();
                    rw.read();
                    break;
                case 3:
                    ReadHeader rh = new ReadHeader();
                    rh.read();
                    break;
                case 4:
                    ConfiguringConnection cc = new ConfiguringConnection();
                    cc.read();
                    break;
                case 5:
                    HttpURLConnec connec = new HttpURLConnec();
                    connec.read();
                    break;
                case 6:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
        } while (n != 5);

    }

    private static void menu() {
        System.out.println("\n ********************* ");

        System.out.println("1. Mở URLConnection");
        System.out.println("2. Đọc dữ liệu từ máy chủ");
        System.out.println("3. Truy xuất các trường tiêu đề");
        System.out.println("4. Cấu hình kết nối");
        System.out.println("5. HttpURLConnection");
        System.out.println("6. Thoát");
    }

}
