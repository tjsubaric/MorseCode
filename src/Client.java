import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args){

        Socket socket = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            socket = new Socket("localhost", 1234);

            isr = new InputStreamReader(socket.getInputStream());
            osw = new OutputStreamWriter(socket.getOutputStream());

            br = new BufferedReader(isr);
            bw = new BufferedWriter(osw);

            Scanner scan = new Scanner(System.in);

            while (true) {
                String message = scan.nextLine();
                bw.write(message);
                bw.newLine();
                bw.flush();

                System.out.println("Server: " + br.readLine());

                if (message.equalsIgnoreCase("-1"))
                    break;

            }
        }catch (IOException e){
            e.printStackTrace();
        } finally{
            try {
                if(socket != null) {
                    socket.close();
                }
                if(isr != null ){
                    isr.close();
                }
                if(osw != null){
                    osw.close();
                }
                if(br != null){
                    br.close();
                }
                if(bw != null){
                    bw.close();
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
