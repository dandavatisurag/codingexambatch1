package codingexam;

class animal{
	
	public void shout()
	{
		System.out.println("animals shout");
		
	}
}

class dog extends animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("dog barks");
	}


	
	
}

class horse extends animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		
		System.out.println("horse neigh");
		
	}
	
}
	class cat extends animal{

		@Override
		public void shout() {
			// TODO Auto-generated method stub
			super.shout();
			
			System.out.println("cat meow");
			
		}
		
		
		
		
		
	}
	
	
	
	
	


public class dandavatisuragbatch1 {

	public static void main(String[] args) {
		
		animal a=new animal();
		animal d=new dog();
		animal b=new cat();
		animal h=new horse();
		b.shout();
		d.shout();
		h.shout();
		
		

	}

}
