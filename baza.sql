-- MySQL dump 10.16  Distrib 10.1.36-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: safeflyeu_hib
-- ------------------------------------------------------
-- Server version	10.1.36-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `aviokompanija`
--

DROP TABLE IF EXISTS `aviokompanija`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aviokompanija` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `avion` varchar(255) DEFAULT NULL,
  `iban` varchar(255) DEFAULT NULL,
  `let` varchar(255) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `osiguranje_id` int(11) DEFAULT NULL,
  `zaposlenik_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8a0b0a5s4be4tko9dgjymf51g` (`osiguranje_id`),
  KEY `FKiykxb1ov867q5cy6xmrdiotsg` (`zaposlenik_id`),
  CONSTRAINT `FK8a0b0a5s4be4tko9dgjymf51g` FOREIGN KEY (`osiguranje_id`) REFERENCES `osiguranje` (`id`),
  CONSTRAINT `FKiykxb1ov867q5cy6xmrdiotsg` FOREIGN KEY (`zaposlenik_id`) REFERENCES `zaposlenik` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aviokompanija`
--

LOCK TABLES `aviokompanija` WRITE;
/*!40000 ALTER TABLE `aviokompanija` DISABLE KEYS */;
INSERT INTO `aviokompanija` VALUES (1,'Airbus320','TL387534346882291126254','Osijek Split','Wizair','89807856187 ',1,1),(3,'Airbus320','TL387534346882291126254','Osijek Basel','Wizair','89807856187 ',1,1),(4,'Airbus320','TL387534346882291126254','Osijek Zagreb','Wizair','89807856187 ',1,2),(5,'Airbus320','TL387534346882291126254','Osijek Zagreb','Wizair','89807856187 ',2,2),(18,'Boeing747','PL89109024024133336275737674','Osijek Zagreb','Easyjet','70435583091',NULL,NULL);
/*!40000 ALTER TABLE `aviokompanija` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `korisnik`
--

DROP TABLE IF EXISTS `korisnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `korisnik` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `osiguranje_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjmdh4xpuxegmhme6274k9bdq6` (`osiguranje_id`),
  CONSTRAINT `FKjmdh4xpuxegmhme6274k9bdq6` FOREIGN KEY (`osiguranje_id`) REFERENCES `osiguranje` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnik`
--

LOCK TABLES `korisnik` WRITE;
/*!40000 ALTER TABLE `korisnik` DISABLE KEYS */;
INSERT INTO `korisnik` VALUES (1,'peroperic@gmail.com','Pero','28155110584','Perić',1),(2,'markoperic@gmail.com','Marko','99279861488','Perić',2),(3,'josipjosipic@gmail.com','Josip','10860188399','Josipić',7),(4,'milamilić@gmail.com','Mila','21121432549','Milić',9),(6,'daviddavidovic@gmail.com','David','21567723719','Davidović',16),(7,'mariomaric@gmail.com','Mario','20453659304','Marić',13),(8,'makmakic@gmail.com','Mak','12157957303','Makić',12);
/*!40000 ALTER TABLE `korisnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `korisnik_aviokompanija`
--

DROP TABLE IF EXISTS `korisnik_aviokompanija`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `korisnik_aviokompanija` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hrana` bit(1) NOT NULL,
  `oznakaSjedala` varchar(255) DEFAULT NULL,
  `pice` bit(1) NOT NULL,
  `prtljaga` bit(1) NOT NULL,
  `avioKompanija_id` int(11) DEFAULT NULL,
  `korisnik_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdmorykxmp02xdy90rgiay66a8` (`avioKompanija_id`),
  KEY `FKskarioak8vadk5swg3nd2cqpk` (`korisnik_id`),
  CONSTRAINT `FKdmorykxmp02xdy90rgiay66a8` FOREIGN KEY (`avioKompanija_id`) REFERENCES `aviokompanija` (`id`),
  CONSTRAINT `FKskarioak8vadk5swg3nd2cqpk` FOREIGN KEY (`korisnik_id`) REFERENCES `korisnik` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnik_aviokompanija`
--

LOCK TABLES `korisnik_aviokompanija` WRITE;
/*!40000 ALTER TABLE `korisnik_aviokompanija` DISABLE KEYS */;
/*!40000 ALTER TABLE `korisnik_aviokompanija` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operater` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` char(60) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'adamlabak@gmail.com','Adam','adam','Labak');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `osiguranje`
--

DROP TABLE IF EXISTS `osiguranje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `osiguranje` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `iban` varchar(255) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `vrsta` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `osiguranje`
--

LOCK TABLES `osiguranje` WRITE;
/*!40000 ALTER TABLE `osiguranje` DISABLE KEYS */;
INSERT INTO `osiguranje` VALUES (1,'TL388525765323267643984','Grave osiguranje','28193398930','Životno osiguranje'),(2,'TL388525765323267643984','Grave osiguranje','28193398930','Putno osiguranje'),(5,'PT87003506839284935242827','Jadransko osiguranje','80763662603','Putno osiguranje'),(6,'PT87003506839284935242827','Jadransko osiguranje','80763662603','Životno osiguranje'),(7,'PT87003506839284935242827','Jadransko osiguranje','80763662603','Osiguranje prtljage'),(8,'TL388525765323267643984','Grave osiguranje','28193398930','Osiguranje prtljage'),(9,'MD6547415568441228915842','Croatia osiguranje','56928519890','Životno osiguranje'),(10,'MD6547415568441228915842','Croatia osiguranje','56928519890','Osiguranje prtljage'),(11,'MD6547415568441228915842','Croatia osiguranje','56928519890','Putno osiguranje'),(12,'MG2523534946969833383932937  ','Euroherc osiguranje','75080249948','Putno osiguranje'),(13,'MG2523534946969833383932937  ','Euroherc osiguranje','75080249948','Životno osiguranje'),(14,'MG2523534946969833383932937  ','Euroherc osiguranje','75080249948','Osiguranje prtljage'),(15,'ES3130048341204922215995  ','Merkur osiguranje','86168859541','Osiguranje prtljage'),(16,'ES3130048341204922215995  ','Merkur osiguranje','86168859541','Životno osiguranje'),(17,'ES3130048341204922215995  ','Merkur osiguranje','86168859541','Putno osiguranje');
/*!40000 ALTER TABLE `osiguranje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zaposlenik`
--

DROP TABLE IF EXISTS `zaposlenik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zaposlenik` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brojMobitela` varchar(255) DEFAULT NULL,
  `brojUgovora` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zaposlenik`
--

LOCK TABLES `zaposlenik` WRITE;
/*!40000 ALTER TABLE `zaposlenik` DISABLE KEYS */;
INSERT INTO `zaposlenik` VALUES (1,'0955263255','321456987','markoivanic@gmail.com','Marko','77060558886','Ivanić'),(2,'09154236521','78965412','ivanivanic@gmail.com','Ivan','70427903949','Ivanić'),(3,'09523145685','523641','mihaelmihic@gmail.com','Mihael','69433314446','Mihić'),(4,'0957418530','741258','josipmihaljevic@gmail.com','Josip','16422852942','Mihaljević'),(7,'0987412587','963963','markoivic@gmail.com','Marko','30846253746','Ivić'),(12,'09563256325','7474747','ivanaivanic@gmail.com','Ivana','44785631662','Ivanić'),(13,'0958741254','7452158','josipacuric@gmail.com','Josipa','83275520957','Čurić'),(14,'09741256325','3652148','marinelalukic@gmail.com','Marinela','27093103244','Lukić'),(15,'091523652145','8585888','mijomijic@gmail.com','Mijo','17425041038','Mijić');
/*!40000 ALTER TABLE `zaposlenik` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-26 14:34:58
