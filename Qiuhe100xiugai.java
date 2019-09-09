public class Qiuhe100xiugai {
    public static void main (String[] args){
		qiuhe100x();
	}
	public static void qiuhe100x(){
		int sum=0;
		for(int i=1;i<=100;i++){
		    sum=i+sum;
		}
		System.out.println("sum="+sum);
	}
}