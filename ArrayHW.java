public class ArrayHW{
  public static void main(String[] args){
    int [][] array = new int[2][2];
    int y = 0;
    for(int i=0; i<array.length; i++){
      for(int j=0; j<array[i].length; j++){
        y+=1;
        
        array[i][j]=y;
        
        System.out.println("array["+i+"]["+j+"]=" +array[i][j]);
      }
    }
  }
}

