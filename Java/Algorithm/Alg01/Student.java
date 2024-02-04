public class Student {

  private String name;
  private String id;

  public Student(String name, String id){
    super();
    this.name = name;
    this.id = id;
  }

  public String getName(){
    return name;
  }
  public void setName(String newName){
    this.name = newName;
  }

  public String getid(){
    return id;
  }
  public void setid(String newId){
    this.id = newId;
  }
}