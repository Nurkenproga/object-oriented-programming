import java.util.HashMap;

public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){

		logininfo.put("nurken", "nurken");
	}
	
	public HashMap getLoginInfo(){
		return logininfo;
	}
}
