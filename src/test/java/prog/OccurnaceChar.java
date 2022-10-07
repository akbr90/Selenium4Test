package prog;

public class OccurnaceChar {

	public static void main(String[] args) {
		
		String str = "xyzabcsx cbxc";  
        int[] freq = new int[str.length()];  
        int i, j;
        char ch[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(ch[i] == ch[j]) {  
                    freq[i]++;     
                    ch[j] = '0';  //Set string[j] to 0 to avoid printing visited character
                }  
            }  
        }
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(ch[i] != ' ' && ch[i] != '0')  
                System.out.println(ch[i] + "-" + freq[i]);  
        }  
    }  

}
