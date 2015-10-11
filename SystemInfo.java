//Print System Information
import org.omg.SendingContext.RunTime;

import java.util.*;

public class SystemInfo{
    public static void main(String[] args){
        System.out.println(new Date());
        Properties info = System.getProperties();
        info.list(System.out);
        System.out.println(" --- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total memory:" + (rt.totalMemory() / 1024) + " Free momery:" + (rt.freeMemory() / 1024));
    }
}