CREATE TABLE bedrift (
  id int(11) NOT NULL AUTO_INCREMENT,
  navn varchar(500) NOT NULL,
  organisasjonsnummer varchar(15) NOT NULL,
  kontakt_person varchar(200) NOT NULL,
  mobil varchar(50) NOT NULL,
  epost varchar(100) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

