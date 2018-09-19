import java.lang.management.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Pid: " + ManagementFactory.getRuntimeMXBean().getName());
        printAllProcesses();
    }

    private static void printAllProcesses() throws Exception{
        Process process = Runtime.getRuntime().exec("ps aux");
        BufferedReader r =  new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line = null;

        while((line=r.readLine())!=null) {
            System.out.println(line);
        }
    }
}

