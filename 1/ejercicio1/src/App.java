import java.io.*;

import java.util.*;
    
import java.util.stream.*;
    
import static java.util.stream.Collectors.toList;
    // mi primer commit
public class App {
    
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            int n = Integer.parseInt(bufferedReader.readLine().trim());
    
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
    
            
    
            bufferedReader.close();
        }
    }
    

