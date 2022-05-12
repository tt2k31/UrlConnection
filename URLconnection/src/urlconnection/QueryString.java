/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package urlconnection;

/**
 *
 * @author Admin
 */
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import static java.net.URLEncoder.encode;

public class QueryString {

    private StringBuilder query = new StringBuilder();

    public QueryString() {
    }

    public synchronized void add(String name, String value) throws UnsupportedEncodingException {
        query.append('&');
        encode(name, value);

    }
}
