package lec_37;

public class client_person {
    public static void main(String[] args) throws Exception {
        person pp = new person("maze");
        pp.setAge(-10);
        System.out.println(pp.getAge());
    }
}

