package Practicle;

public class Trainer {

	    private int trainerId;
	    private String trainerName;
	    private String subject;
	    private String officeLocation;

	  
	    public Trainer(int trainerId, String trainerName, String subject, String officeLocation) {
	        this.trainerId = trainerId;
	        this.trainerName = trainerName;
	        this.subject = subject;
	        this.officeLocation = officeLocation;
	    }

	    public int getTrainerId() {
	        return trainerId;
	    }

	    public void setTrainerId(int trainerId) {
	        this.trainerId = trainerId;
	    }

	    public String getTrainerName() {
	        return trainerName;
	    }

	    public void setTrainerName(String trainerName) {
	        this.trainerName = trainerName;
	    }

	    public String getSubject() {
	        return subject;
	    }

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	    public String getOfficeLocation() {
	        return officeLocation;
	    }

	
	    public void setOfficeLocation(String officeLocation) {
	        this.officeLocation = officeLocation;
	    }


	    public String toString() {
	        return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", subject=" + subject
	                + ", officeLocation=" + officeLocation + "]";
	    }
	public static void main(String[] args) {
	
		        Trainer trainer = new Trainer(1, "Sujina", "Core Java", "Andheri");

		      
		        System.out.println("Trainer Details:");
		        System.out.println("Trainer ID: " + trainer.getTrainerId());
		        System.out.println("Trainer Name: " + trainer.getTrainerName());
		        System.out.println("Subject: " + trainer.getSubject());
		        System.out.println("Office Location: " + trainer.getOfficeLocation());
		    }
}
