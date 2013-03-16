
public class Grades {

	/**
	 * @param args
	 */
	private int [] studentgrades;
    private int i =0;
    public Grades(int students){
        studentgrades = new int [students];
        for( i = 0; i <students; i++){
            studentgrades[i]= (int)(Math.random()*100);
        }
    }
    
    
    
    public double averageGrade(int[]studentgrades){
        double sum = 0;
        for( i =0; i < studentgrades.length;i++){
            sum += studentgrades[i];
        }
        return sum/studentgrades.length;
    }
    


    public boolean equals(int[]student1, int[]student2){
        
    for(int i =0; i < student1.length; i++){
        if((student1[i]-student2[i]>.01)){
            return false;
        }
        else{ 
            return true;
        }
    }
    return true;
}
    
    public int[] getTestGrades(int[]sgrades){
        int[] grades = null;
        for(int i =0; i<sgrades.length;i++){
        grades[i]= sgrades[i];
            }
         return grades;
    }
    
    public int maxGrade(int student[]){
        double maxgrade = student[0];
        for(i =0; i <student.length; i ++){
            if(student[i] > maxgrade){
                maxgrade = student[i];
            }
        }
        return (int) maxgrade;
    }
    
    public int [] sortGrades(){
    	//sort using bubblesort
    	for(int i=0; i<studentgrades.length; i++){
            for(int j=1; j<studentgrades.length; j++){
                if(studentgrades[j]< studentgrades[j-1] ){
                    int temp = studentgrades[j];
                    studentgrades[j] = studentgrades[j-1];
                    studentgrades[j-1] = temp;            
                }
            }
         }
     
         for(int i=0; i<studentgrades.length; i++)
         {
             System.out.print(studentgrades[i] + " ");
         }
         
      	return studentgrades;
    }
    	
    	
   
    
    
   // public double median(){
        
    //}
    
    public String toString(){
        String data = "", sorting = "";
        for(i=0; i <studentgrades.length;i++){
        data+= studentgrades[i]+"\t";
       
        }
        return data;
   }
	
	

}
