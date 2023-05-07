package com.string;

public class StringTest {
    public static void main(String[] args) {
        //StringChar();
        //isSame("emre", "emre");
        //test();
        //stringEquals();
        //stringLength();
        //stringCharAt();
        // stringSubstring();
        //stringConcat();
        //stringIndexOf();
        //stringReplace();
        //stringToLowerCase();
        //stringToUpperCase();
    }

    public static void StringChar() {
        char[] ch = {'J', 'A', 'V', 'A'};
        String str1 = new String(ch);
        System.out.println(str1);
    }

    public static void isSame(String str, String str1) {
        String s = new String(str);
        String s1 = new String(str1);
        if (str == str1) {
            System.out.println("Aynı");
        } else {
            System.out.println("aynı değil");
        }
    }

    public static void test() {
        System.out.printf("Yunus Emre, %s", "Yunus Emre \n");
        String surname = "Çiftçi";
        System.out.printf("Yunus Emre %s \n", surname);
        /*Sadece String olarak değil:
         %d: decimal. yani long, int, short, byte
         %b: boolean
         %f: floating point numbers. yani double ve float
         %x: hexadecimal
         %c: char
         %e: scientific notification. Örneğin virgüllü sayıyı 1.22e şeklinde yazması gibi.
        */
    }

    public static void stringEquals() {
        String myFullName1 = "Yunus Emre Çiftçi";
        String myFullName2 = "Yunus Emre Çiftçi";
        String myFullName3 = new String("Yunus Emre Çiftçi");

        boolean equals = myFullName1.equals(myFullName2);
        boolean equals1 = myFullName1.equals(myFullName3);

        System.out.println(equals);
        System.out.println(equals1);


        //equals metodu büyük küçük harfe duyarlıdır.
        String apple = "APPLE";
        String apple1 = "apple";
        System.out.println("Büyük küçük harf duyarlılığı: " + apple.equals(apple1));
        //false döner


        //equals metodu kullanılırken String'lerin null gelme ihtimaline karşı hata konrolü yapmamız gerekir.
        String banana = "banana"; //Buraya null yazılırsa NullPinterException fırlatılır.
        String banana1 = "banana";
        try {
            System.out.println("Try-catch içindeki yazım: " + banana.equals(banana1));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //  "\"Null olan bir String'i başka bir String nesnesiyle karşılaştıramazsın. " +
        //   "NullPointerException fırlatır. " +
        //   "Bu gibi istenmeyen durumların önüne geçmek için equals metodunu kullanırken hata yönetimi yapmak gerekir.


        //Büyük küçük harf duyarlılığının önüne geçmek için aşağıdaki metot kullanılır.
        String orange = "ORANGE";
        String orange1 = "orange";
        try {
            System.out.println("Büyük küçük harf duyarlığı: " + orange.equalsIgnoreCase(orange1));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void stringLength() {
        //String ifadenin uzunluğunu hesaplar. Son string ifadeye gelmek için (length - 1) kullanılır.
        String myFullName = "Yunus Emre Çiftçi";
        String myFullName1 = new String("Yunus Emre Çiftçi");
        System.out.println(myFullName.length());
        System.out.println(myFullName1.length());
    }

    public static void stringCharAt() {
        //Parametre olarak verilen int değerin char'ını döner.
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = new String("Yunus Emre Çiftçi");
        System.out.println(fullName.charAt(2));
        System.out.println(fullName1.charAt(2));
        //iki String ifadenin 2. index'i n olduğu için sonuç n çıkar.
    }

    public static void stringSubstring() {
        // 2 farklı parametre alan 2 farklı metodumuz var.
        // Bir tane parametre alan metodumuz verilen int değerden başlayıp String'in length'ine kadar String ifadeyi yazdırır.
        // İki tane parametre alan metodumuz ise ilk verilen int değerden başlatıp, ikinci verilen değere kadar String ifadeyi yazdırır.
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = new String("Yunus Emre Çiftçi");
        //1 parametre alan metod
        System.out.println(fullName.substring(5));
        //2 parametre alan metod
        System.out.println(fullName1.substring(6, 9));
    }

    public static void stringConcat() {
        //Parametre olarak verilen String'i mevcut String'in (length + 1)'e ekler.
        String name = "Yunus Emre";
        String surname = " Çiftçi";
        System.out.println(name.concat(surname));

    }

    public static void stringIndexOf() {
        String fullName = "Yunus Emre Çiftçi";
        //4 farklı parametre alan indexOf metodumuz var. Bunlardan ilki verilen bir unicode'u değerin (char ya da int olabilir)
        //kaçıncı index'te olduğunu bulur. Bulunan ilk değerin index'ini integer olarak geri döndürür.
        System.out.println(fullName.indexOf(69));
        System.out.println(fullName.indexOf("Yunus", 4));

        //


    }

    public static void stringReplace() {
        String fullName = "Yunus Emre Çiftçi";
        String fullName1 = "John Doe";
        System.out.println(fullName.replace('Y', 'M'));
        System.out.println(fullName.replace("Yunus", "Mustafa"));
    }

    public static void stringToLowerCase() {
        String fullName = "Yunus Emre Çiftçi";
        System.out.println(fullName.toLowerCase());
    }

    public static void stringToUpperCase() {
        String fullName = "Yunus Emre Çiftçi";
        System.out.println(fullName.toUpperCase());
    }
}
