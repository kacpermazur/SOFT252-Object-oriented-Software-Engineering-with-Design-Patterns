package classification;

public class StageResults {
    private double totalMarks;
    private int totalCredits;
    private double stage2Average;
    private final int MAXCREDITS = 120;

    /*
     * Constructor. Initialises the instrance variables with zero.
     */
    public StageResults() {
        totalMarks = 0.0;
        totalCredits = 0;
        stage2Average = 0.0;
    }
    
    public void addModuleMark(int credits, double mark)
    {
        totalCredits += credits;
        totalMarks += mark * (credits/10);
    }
    
    public double calculateAverageSoFar()
    {
        double average;
        
        average = totalMarks / (totalCredits / 10.0);
        average = Math.round(average * 100) / 100.0;
        
        return average;     
    }
    
    public String predictClass()
    {
        double overllAverage = calculateAverageSoFar();
        String degree;
        
        if (totalCredits < MAXCREDITS)
            degree = "Insufficent credits";
        else if (overllAverage == 0)
            degree = "No Marks!";
        else if (overllAverage < 40)
            degree = "FAIL";
        else if (overllAverage < 50)
            degree = "3rd";
        else if (overllAverage < 60)
            degree = "Lower 2nd";
        else if (overllAverage < 70)
            degree = "Upper 2nd";
        else
            degree = "1st";

        return degree;
    }

    /*
     * Returns the stage 2 average.
     */
    public double getStage2Average() {
        return stage2Average;
    }

    /*
     * Returns the total credits added so far.
     */
    public int getTotalCredits() {
        return totalCredits;
    }

    /*
     * Returns the total mark added so far
     */
    public double getTotalMarks() {
        return totalMarks;
    }

    /*
     * takes the stage 2 average as a parameter and places it
     * in the instance variable.
     */
    public void setStage2Average(double stage2Average) {
        this.stage2Average = stage2Average;
    }
    
    /*
     * Returns TRUE of 120 credits have been entered, FALSE otherwise.
     */
    public boolean isComplete() {
        return (totalCredits == MAXCREDITS);
    }
    
    /*
     * Resets the instance variables to zero, destroying any existing
     * values.
     */
    public void resetValues() {
        totalMarks = 0.0;
        totalCredits = 0;
        stage2Average = 0.0;
    }
    
    
}
