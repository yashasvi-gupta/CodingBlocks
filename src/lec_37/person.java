package lec_37;

public class person {
    private   String name="sardar khan singh";
   private int age=10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        System.out.println("Update kr rha hain");
        if(age<0){
     //       fekh ke marru error!
            try {
                this.age=age;
                if(age<0){
                    throw new Exception("bana hoti");
                }

            } catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                this.age=0;
                System.out.println("Exception hoi hi nahi ");
                System.out.println("last line in catch");

                System.out.println("Exception thro hu thi");
            }

            //this will  never run
        }

        this.age = age;
    }

    public person(String maze){

String name = "adfas";
       this. name="CCC";

        System.out.println(maze+" asdfsda");
    }

}
