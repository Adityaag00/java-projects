-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: travelagency
-- ------------------------------------------------------
-- Server version	5.1.33-community

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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `MEMB_NO` int(10) NOT NULL,
  `MEMB_NAME` varchar(50) NOT NULL,
  `MEMB_ADD` varchar(100) NOT NULL,
  `MDATE` date NOT NULL,
  `MEDATE` date NOT NULL,
  `MFEE` double(10,2) DEFAULT NULL,
  `MEM_STATUS` int(10) NOT NULL,
  `MEM_ISSUE` char(3) DEFAULT NULL,
  `MEM_PHONE` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`MEMB_NO`),
  UNIQUE KEY `MEMB_STATUS` (`MEM_STATUS`),
  UNIQUE KEY `MEM_STATUS` (`MEM_STATUS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1001,'ARJUN SINGH','K.V UPPER CAMP','2012-01-17','2012-01-17',500.00,1101,'NON','7848758475'),(1002,'SHIV SINGH','K.V UPPER CAMP','2012-01-17','2012-01-17',500.00,1102,'NON','7848758475'),(1003,'SUMEET SINGH','K.V UPPER CAMPDEHRADUN U.K','2012-01-16','2012-01-16',500.00,1103,'NON','8748474512'),(1004,'suraj singh gusain','k.v upper camp dehradun u.k','2012-01-16','2012-01-16',500.00,1104,'NON','7848475845'),(1005,'rahul','k.v. upper camp dehradun','2012-01-20','2012-01-20',500.00,1105,'YES','9945784578'),(1006,'RAHUL','K.V UPPER CAMP DEHRADUN','2012-01-25','2012-01-25',500.00,1106,'NON','9874548774'),(1007,'alpana','army school','2012-01-27','2012-01-27',542525.00,1107,'NON','8449221804'),(1008,'ABHISHREK','K.V UPPER CAMP','2012-01-28','2012-01-28',500.00,1108,'NON','9455614554');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `missue`
--

DROP TABLE IF EXISTS `missue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `missue` (
  `acc_no` int(4) DEFAULT NULL,
  `acq_no` int(4) DEFAULT NULL,
  `memb_no` int(4) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `missue`
--

LOCK TABLES `missue` WRITE;
/*!40000 ALTER TABLE `missue` DISABLE KEYS */;
INSERT INTO `missue` VALUES (9002,NULL,1002,'2012-01-16','2012-01-16'),(9005,NULL,1005,'2012-01-28','2012-01-28');
/*!40000 ALTER TABLE `missue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mmember`
--

DROP TABLE IF EXISTS `mmember`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mmember` (
  `MEMB_NO` int(10) NOT NULL,
  `MEMB_NAME` varchar(50) NOT NULL,
  `MEMB_ADD` varchar(100) NOT NULL,
  `MDATE` date NOT NULL,
  `MEDATE` date NOT NULL,
  `MFEE` double(10,2) DEFAULT NULL,
  `MEM_STATUS` varchar(10) DEFAULT NULL,
  `MEM_ISSUE` char(3) DEFAULT NULL,
  `MEMB_PHONE` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`MEMB_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mmember`
--

LOCK TABLES `mmember` WRITE;
/*!40000 ALTER TABLE `mmember` DISABLE KEYS */;
INSERT INTO `mmember` VALUES (7001,'ARJUN SINGH','K.V UPPER CAMP DEHRADUNU.K','2012-10-16','2012-10-16',0.00,'7101','NON','9545484574'),(7002,'SHIV SINGH','K.V UPPER CAMP DEHRADUN','2012-01-20','2012-01-20',500.00,'7102','NON','9142154215'),(7003,'SUMEET','K.V UPPER CAMP','2012-01-25','2012-01-25',500.00,'7103','NON','9142151475');
/*!40000 ALTER TABLE `mmember` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tissue`
--

DROP TABLE IF EXISTS `tissue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tissue` (
  `ACC_NO` int(4) DEFAULT NULL,
  `MEMB_NO` int(4) DEFAULT NULL,
  `IDATE` date DEFAULT NULL,
  `RDATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissue`
--

LOCK TABLES `tissue` WRITE;
/*!40000 ALTER TABLE `tissue` DISABLE KEYS */;
INSERT INTO `tissue` VALUES (9004,7001,'2012-01-20','2012-01-20'),(9005,1005,'2012-01-28','2012-01-28');
/*!40000 ALTER TABLE `tissue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veh`
--

DROP TABLE IF EXISTS `veh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veh` (
  `V_NO` int(10) NOT NULL,
  `V_NAME` varchar(30) NOT NULL,
  `OTR_DISC` varchar(50) DEFAULT NULL,
  `type` varchar(15) DEFAULT NULL,
  `PRICE` float DEFAULT NULL,
  `V_CAP` varchar(10) DEFAULT NULL,
  `BATCHNO` varchar(10) DEFAULT NULL,
  `PDATE` date DEFAULT NULL,
  `RS_BOOK` int(4) DEFAULT NULL,
  `STATUS` int(4) DEFAULT NULL,
  `issue_status` char(3) DEFAULT NULL,
  PRIMARY KEY (`V_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veh`
--

LOCK TABLES `veh` WRITE;
/*!40000 ALTER TABLE `veh` DISABLE KEYS */;
INSERT INTO `veh` VALUES (9001,'MARUTI 600','GOOD QUALITY FUEL-CNG  WITH A.C GOOD STATUS','1   - MARUTI',20000,'60','101  ','2012-01-16',2000,9102,'NON'),(9002,'MARUTI 600','GOOD QUALITY FUEL-CNG  WITH A.C GOOD STATUS','1   - MARUTI',20000,'50','101','2012-01-16',2000,9102,'NON'),(9003,'INDIGO','A.C GOOD HIGH AVERAGE','101 - MARUTI',450000,'100','102 ','2012-01-20',3000,9103,'NON'),(9004,'WAGON-R','GOOD QUALITY CNG AVERAGE 30  ','101 - MARUTI',600000,'70','102 ','2012-01-20',4000,9104,'NON'),(9005,'BMW','GOOD STATUS HIGH AVERAGE WIYT ALL  FACILITIES','102 - TATA',8.5e+006,'50','102 ','2012-01-22',9000,9105,'YES');
/*!40000 ALTER TABLE `veh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `veh_type`
--

DROP TABLE IF EXISTS `veh_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `veh_type` (
  `TYPE_NO` int(8) DEFAULT NULL,
  `TYPE_NAME` varchar(50) DEFAULT NULL,
  `TYPE_DISC` varchar(50) DEFAULT NULL,
  `V_DATE` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `veh_type`
--

LOCK TABLES `veh_type` WRITE;
/*!40000 ALTER TABLE `veh_type` DISABLE KEYS */;
INSERT INTO `veh_type` VALUES (101,'MARUTI','GOOD','2012-01-16'),(102,'TATA','GOOD QUALITY ALL A.C','2012-01-16');
/*!40000 ALTER TABLE `veh_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2006-01-31 21:53:00
