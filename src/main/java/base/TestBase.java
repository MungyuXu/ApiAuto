package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xumengyu
 * @date 2021-07-06 10:18
 * 这个类作为所有接口请求测试的父类，都需要继承这个父类，
 * 写一个构造方法，实现加载读取properties文件
 */
public class TestBase {
    public Properties prop;
    public  TestBase(){
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+
                    "/src/main/java/config/config.properties");
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


