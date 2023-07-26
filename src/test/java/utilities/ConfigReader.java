package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
    .properties uzantılı dosyaya erişebilmemiz için Properties class'ından obje oluşturmamız gerekir.
    bu oluşturduğumuz obje ile akışa aldığımız dosya yolunu properties.load(fis) methodu ile properties dosyasındaki
    key değerini return edebiliriz
    Bunu yapmak icin parametreli bir method ollusturur girdigimiz key'in degerini bize dondurur.
     */
    static Properties properties;
    static {
        try {
            FileInputStream fis = new FileInputStream("configuration.properties");
            properties = new Properties();
            properties.load(fis);//--> fis'in okuduğu bilgileri properties'e yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getProperty(String key){

        // String value = properties.getProperty(key);
        return properties.getProperty(key);//-->getProperty(key) methodu properties dosyasındaki key'in değerini verir



        /*
        String dosyaYolu = "configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);  // fis'in okudugu bilgileri properties'e yukler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value = properties.getProperty(key); // getProperty(key) methodu propperties dosyasindaki key'in degerini verir
        return value;

         */
    }
}
