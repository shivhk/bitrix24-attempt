create table 'user'(
	salutation VARCHAR(255),
	uuid(),
	
  firstName VARCHAR(255),

  lastName VARCHAR(255),

  secondName VARCHAR(255),

  path VARCHAR(255),
	
  DateTime dob,

  position VARCHAR(255),

  phone VARCHAR(255),

  phoneType VARCHAR(255),

  email VARCHAR(255),

  website VARCHAR(255),

  siteType VARCHAR(255),

  messengerId VARCHAR(255),

  messengerChannel VARCHAR(255),

  companyId VARCHAR(255),

  contactType VARCHAR(255),

  source VARCHAR(255),

  description VARCHAR(255),

  availableToAll tinyint(11),

  markToExport tinyint(11),

  comment VARCHAR(255)
)
