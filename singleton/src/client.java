public class client {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        singleton s2 = singleton.getInstance();
        singleton s3 = singleton.getInstance();
        s1.getConnect();
        s2.getConnect();
        s1.getConnect();
        s3.getConnect();

    }
}
