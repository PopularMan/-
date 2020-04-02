/**
 * 饿汉模式 借助jvm内加载机制
 */
public class huangSingleton {
    private static huangSingleton huangSingleton = new huangSingleton();
    private huangSingleton(){

    }
    public huangSingleton getHuangSingleton(){
        return  huangSingleton;
    }

    public static void main(String[] args) {

        new Thread(()->{
            System.out.println(huangSingleton.getHuangSingleton());
        }).start();
        new Thread(()->{
            System.out.println(huangSingleton.getHuangSingleton());
        }).start();

    }

}

