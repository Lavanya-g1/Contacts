class Person{
    String Name;
    int Age;
    String Ssn;


public Person(String Name,int Age,String Ssn){
this.Age = Age;
this.Name = Name;
this.Ssn = Ssn;
}
    

    public static void main(String[] args) {
        Person p = new Person("Lavanya",11,"XXXXX0000");
        System.out.println(p.Name);
        System.out.println(p.Age);  
        System.out.println(p.Ssn);
      
        
       

    }


   

}

