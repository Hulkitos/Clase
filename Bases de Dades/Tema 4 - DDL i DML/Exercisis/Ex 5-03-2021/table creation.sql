CREATE DATABASE IF NOT EXISTS sales;
USE sales;

CREATE TABLE IF NOT EXISTS client (
    IdCll int primary key auto_increment not null,
    dni char(11) not null,
    nameCll char(30) not null,
    sur1Cll char(30),
    sur2Cll char(30),
    phoneNum int,
    phoneType enum('landline','mobile') default('mobile'),
    idCity int not null,
    FOREIGN KEY (idCity) REFERENCES city(idCity)
);

CREATE TABLE IF NOT EXISTS product (
  IdPro int primary key auto_increment not null,
  codePro int(5) not null,
  namePro char(15) not null,
  descriptPro char(50),
  pricePro double not null default('0')
);

CREATE TABLE IF NOT EXISTS city (
    idCity int primary key auto_increment not null,
    codeCity int(5) not null,
    nameCity char(15) not null,
    sizeCity enum('small', 'medium', 'large') default('medium')
);

CREATE TABLE IF NOT EXISTS product_client (
    idPro int auto_increment not null,
    idCll int(5) not null,
    purchaseDot date not null,
    foreign Key(idPro) REFERENCES product(idPro),
    foreign key (idCll) REFERENCES client(idCll)
);