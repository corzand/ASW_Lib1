package asw1009;

import java.io.*;
import java.net.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class HTTPClient {

    private URL base = null;
    private String sessionId = null;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setBase(URL base) {
        this.base = base;
    }

    public URL getBase() {
        return base;
    }

    public String execute(String address, String data) throws IOException, MalformedURLException {

        HttpURLConnection connection = (HttpURLConnection) new URL(base, address).openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        if (sessionId != null) {
            connection.setRequestProperty("Cookie", "JSESSIONID=" + sessionId);
        }
        
        connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
        connection.setRequestProperty("Accept", "application/json");
        connection.connect();
        
        OutputStream os = new BufferedOutputStream(connection.getOutputStream());
        os.write(data.getBytes());
        os.flush();
        
        int status = connection.getResponseCode();

        String json = "";
        switch (status) {
            case 200:
            case 201:
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line).append("\n");
                }
                br.close();
                json = sb.toString();
        }
        
        String setCookie = connection.getHeaderField("Set-Cookie");
        if (setCookie != null && !setCookie.equals("") && (setCookie.substring(0, setCookie.indexOf("=")).equals("JSESSIONID"))) {
            sessionId = setCookie.substring(setCookie.indexOf("=") + 1, setCookie.indexOf(";"));
        }
        
        connection.disconnect();
        return json;
    }

    public Document execute(String address, Document data) throws TransformerException, ParserConfigurationException, SAXException, IOException, MalformedURLException {
        ManageXML manageXML = new ManageXML();
        
        HttpURLConnection connection = (HttpURLConnection) new URL(base, address).openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);

        if (sessionId != null) {
            connection.setRequestProperty("Cookie", "JSESSIONID=" + sessionId);
        }
        connection.setRequestProperty("Accept", "text/xml");
        connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        connection.connect();
        
        try (OutputStream out = connection.getOutputStream()) {
            manageXML.transform(out, data);
        }
        Document answer;
        try (InputStream in = connection.getInputStream()) {
            answer = manageXML.parse(in);
        }

        String setCookie = connection.getHeaderField("Set-Cookie");
        if (setCookie != null && !setCookie.equals("") && (setCookie.substring(0, setCookie.indexOf("=")).equals("JSESSIONID"))) {
            sessionId = setCookie.substring(setCookie.indexOf("=") + 1, setCookie.indexOf(";"));
        }

        connection.disconnect();
        return answer;
    }

}
