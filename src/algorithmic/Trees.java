package algorithmic;

public class Trees {
	private static int c;
	private static int d;
	private static int[] trees = new int[2147000];
	private static boolean check;
	public static void main(String[] args) {
		d=0;
		c=0;
		setnewTree(89);
		setnewTree(1550);
		setnewTree(130);
		setnewTree(5000);
		setnewTree(67);
		setnewTree(5000);
		for(int i = 0; i<c; i++){
			for(int a = 0; a<c;a++){
				if(Math.max(trees[i], trees[a] ) == trees[i]){
					check=true;
				}
				else{
					check=false;
					break;
				}
			}
			if(check==true){
				d++;
				//System.out.println(trees[i]);
			}
		}
		System.out.println(d);
	}
	public static void setnewTree(int height){
		trees[c] = height;
		c++;
	}
}
