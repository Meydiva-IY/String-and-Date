public class str {
    
        public static void main(String[] args) {
            String text1 = "Aku Suka ";
            String text2 = " Bermain Drone";
            String text3 = text2.toUpperCase();
            String text4 = text1.trim();
           
           //System.out.println(str);
           System.out.println("");
           System.out.println("------------------------");
           System.out.println("length text1\t= " + text1.length()); //banyak hal (termasuk spasi) di dalam string
           System.out.println("compare To\t= " + text1.compareTo(text2)); //jika text1=text2 hasilnya 0, jika text1<text2 hasilnya (-), jika text1>text2 hasilnya (+)
           System.out.println("sebelum trim\t="+text1+text2);
           System.out.println("setelah trim\t= " + text1.trim()+text2);
           System.out.println("equals\t\t =" + text1.equals(text2));
           System.out.println("equalsIgnoreCase= "+ text1.equalsIgnoreCase(text2));
           System.out.println("toUppercase\t =" + text1.toUpperCase());
           System.out.println("toLowercase\t =" + text1.toLowerCase());
           System.out.println("toLowercase\t =" + text3.toLowerCase());
           System.out.println("concat\t\t=" + text4.concat(text3));
           }
           
           
    }

