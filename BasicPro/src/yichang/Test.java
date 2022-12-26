package yichang;

public class Test {
       public static void main(String[] args) {
	
    	   String playerType = "monkey";
    	   try {
			if(!playerType.equals("human")) {
				throw new MyException("有非人类选手："+playerType);
			   }
			System.out.println("开始比赛");
		} catch (MyException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			System.out.println("出现异常！");
		}
    	   
}

}
