
public class HW4PartB {
	public static void RightsideTriangle(){
		System.out.println("+---------+");
		for(int j = 0; j <= 3; j++){
			System.out.print("| ");
			for(int t = 2; t>= j; t--){
				System.out.print(" ");
			}
			for(int k = 1; k <= j; k++){
				System.out.print("/");
			}
			for(int a = 1; a <= 1; a++){
				System.out.print("*");
			}
			for(int t = 4; t<= j; t++){
				System.out.print(" ");
			}
			for(int l = 1; l <= j; l++){
				System.out.print("\\");
			}
			for(int i = 1; i <= 1; i++){
				for(int t = 3; t >= j; t--){
					System.out.print(" ");
				}
				System.out.print("|");
			}
			System.out.println();
		}
	}
		public static void upsidedownTriangle(){
		for(int j = 0; j <= 3; j++){
			System.out.print("| ");
			for(int l =1; l > 3; l-=2){
				System.out.print("\\\\\\");
			}
			
			/*for(int i = 1; i <= 1; i++){
				for(int t = 3; t >= j; t--){
					System.out.print(" ");
				}
				System.out.print("|");
			}*/
			System.out.println();
		}
	}
}
