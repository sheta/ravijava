// Ravi used bubble sort algothrim from the text book chap9 and from the notes
// This project is a group work
public class Grades {

    /**
     * @param args
     */
    private int [] studentgrades;
    private int MIN_GRADE, MAX_GRADE;
    private int i =0;


    public Grades(int students){
        studentgrades = new int [students];
        for( i = 0; i <students; i++){
            studentgrades[i]= (int)(Math.random()*100);
        }
    }


    public double averageGrade(){
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

    //Ravi Tadi
    public double maxGrade(){
        double maxgrade = studentgrades[0];
        for(i =0; i <studentgrades.length; i ++){
            if(studentgrades[i] > maxgrade){
                maxgrade = studentgrades[i];
            }
        }
        return maxgrade;
    }

    //sort using bubblesort
    //Ravi Tadi
    public int [] sortGrades(){       
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
            System.out.print(studentgrades[i] + " ");

        return  studentgrades;
    }





    public double median(){  
        sortGrades();
        if(studentgrades.length%2 == 0){
            return (studentgrades[studentgrades.length/2]+ studentgrades[(studentgrades.length/2)-1])/2;
        }else{ 
            return studentgrades[(studentgrades.length)/2];
        }
    }

    @Override
    public String toString(){
        String data = "";
        for(i=0; i <studentgrades.length;i++){
            data+= studentgrades[i]+" ";

        }
        return data + "\nMaxGrade of the Students grades:"+ maxGrade()
        +"\nAverage student Grades:"+averageGrade()+"\nMedian:"
        + median();
    }



}