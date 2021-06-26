package classesandobj;

public class dynamicarrayclassuse {

	public static void main(String[] args) {
		dynamicarrayclass d = new dynamicarrayclass();
		for(int i=0; i<100;i++) {
			d.add(i + 10);
			
		}
		System.out.println(d.size());
		
		d.set(4, 10);
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		while (!d.isEmpty()) {
			System.out.println(d.removelast());
			System.out.println("size = " + d.size());
		}
		
		  
        
	}

}
  