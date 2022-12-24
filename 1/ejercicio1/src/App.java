import java.io.*;

import java.util.*;
    
import java.util.stream.*;
    
import static java.util.stream.Collectors.toList;
    
public class App {
    
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    #hola
            int n = Integer.parseInt(bufferedReader.readLine().trim());
    
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    
            
    
            bufferedReader.close();
        }
    }
    

