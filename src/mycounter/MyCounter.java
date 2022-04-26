package mycounter;

import java.util.Enumeration;

public class MyCounter {

    public static void main(String[] args) {
        SimpleParser sp=new SimpleParser();  
        sp.Parse(args);

        //WordCounter wc=new WordCounter(null,null);
      //  WordCounter wc=new WordCounter(sp.getInFile(), null);
        WordCounter wc=new WordCounter("test.txt", null);
        wc.countWords();
        
        Enumeration keys = wc.getWords().keys();
        while(keys.hasMoreElements()){
           String w=keys.nextElement().toString(); 
           int n= (int)wc.getWords().get(w);
           System.out.print(w+"-"+n+", ");
        }             
    }
}
