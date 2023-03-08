package No;

public class mainNo {
	
  public static void main(String[]args){
	  //ENCADEAMENTO DE NÓ: NO1-> NO2-> NO3-> NO4-> NULL
	  
	  No <String> no1 = new No<>("nó 1", null);
	  
	  No <String> no2 = new No<>("nó 2", null);
	  no1.setProximoNo(no2);

	  No <String> no3 = new No<>("nó 3", null);
	  no2.setProximoNo(no3);
	  
	  No <String> no4 = new No<>("nó 4", null);
	  no3.setProximoNo(no4);
	  
	  System.out.println(no1);
	  System.out.println(no1.getProximoNo());
	  System.out.println(no2);
	  
	  System.out.println("********************");
	  
	  System.out.println(no1);
	  System.out.println(no1.getProximoNo());
	  System.out.println(no1.getProximoNo().getProximoNo());
	  System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
	  System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
	  
  }
  
}
