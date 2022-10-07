package prog;

public class ProtectedConst {
	
	protected ProtectedConst(){
		
	}

}

class Test extends ProtectedConst{
	ProtectedConst s= new ProtectedConst();
	ProtectedConst obj = new Test();
}
