public class User{
	private int id;
	private String name;
	private String sex;
	private User(int id,String name,String sex){
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public String toString (){
		return "User[id = "+id+";name = "+name+";sex = "+sex+"]";
	}
private int getId(){
	return id;
	
}
	
}