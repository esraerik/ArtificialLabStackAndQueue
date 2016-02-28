package AILab3;

public class Stack {
	
	static int top=-1;

	public static void main(String[] args) {
		
		int S[] = new int[100];//100 stack için verilen max boyuttur.
		System.out.println("Stack ---");
		for (int i = 0; i < 5; i++) {
			push(S,i*2);
		}
		for (int i = 0; i < S.length; i++) {
			if(!stackEmpty(S))
			System.out.println(pop(S));//burada en son eklediðimiz 8 saynýn ilk çekilmesi hedef
			else {
				System.out.println("Stack is empty");
				break;}
		}
		

	}
 public static Boolean stackEmpty(int S[]){
	 
	 if(top==0){
	 return true;
	 }
	 else
		 return false;
	 
 }
 public static void push(int S[],int x){
	 
	 top++;
	 S[top]=x;
	
 }
 public static int pop(int S[]){
	
	 if(stackEmpty(S)==true)
	 {
		 System.out.println("Stack de hiç eleman yok , silme yapýlamaz");
		 
	 }
	 else{
		 top--;}
	 
		 return S[top+1];
	 
	 
	 
 }
}
