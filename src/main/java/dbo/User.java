package dbo;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	
	private int salutation;
	
	private String firstName;
	
	private String lastName;
	
	private String secondName;
	
	private String path;
	
	private Date dob;
	
	private String position;
	
	private long phone;
	
	private int phoneType;
	
	private String email;
	
	private String website;
	
	private int siteType;
	
	private String messengerId;
	
	private int messengerChannel;
	
	private Company company;
	
	private int contactType;
	
	private int source;
	
	private String description;
	
	private boolean availableToAll;
	
	private boolean markToExport;
	
	private String comment;

}
