-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: board_project
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
-- Table structure for table `elogin_info`
--

DROP TABLE IF EXISTS `elogin_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `elogin_info` (
  `username` char(20) DEFAULT NULL,
  `password` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `elogin_info`
--

LOCK TABLES `elogin_info` WRITE;
/*!40000 ALTER TABLE `elogin_info` DISABLE KEYS */;
INSERT INTO `elogin_info` VALUES ('28k','2020'),('98k','2050');
/*!40000 ALTER TABLE `elogin_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp` (
  `emp_code` char(30) NOT NULL,
  `name` char(30) DEFAULT NULL,
  `address` char(40) DEFAULT NULL,
  `contact_no` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`emp_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES ('A9950','Rajiv sharma','983/9 shivgardh','8097577761'),('D1234','MAMU','NAYA GAO','9765976543');
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lib`
--

DROP TABLE IF EXISTS `lib`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lib` (
  `acc_no` int(4) NOT NULL,
  `acq_no` int(4) DEFAULT NULL,
  `btitle` varchar(30) NOT NULL,
  `author1` varchar(30) DEFAULT NULL,
  `author2` varchar(30) DEFAULT NULL,
  `pub_id` int(4) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `pdate` date DEFAULT NULL,
  `edition` int(4) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`acc_no`),
  KEY `pub_id` (`pub_id`),
  CONSTRAINT `lib_ibfk_1` FOREIGN KEY (`pub_id`) REFERENCES `publisher` (`pub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lib`
--

LOCK TABLES `lib` WRITE;
/*!40000 ALTER TABLE `lib` DISABLE KEYS */;
INSERT INTO `lib` VALUES (1,NULL,'movie - DON2','FARHAN AKHTAR',NULL,1,1000,'2010-12-01',2,'N'),(2,NULL,'movie - M.I.4','DANY BOYL',NULL,3,1500,'2011-12-26',4,'Y'),(3,NULL,'ALBUM - BEWAFA ','FARHA KHAN',NULL,1,500,'2011-12-26',1,'Y'),(4,NULL,'ALBUM - HAJI ALI ','JAGJIT SINGH',NULL,3,500,'2011-12-06',1,'Y');
/*!40000 ALTER TABLE `lib` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_info`
--

DROP TABLE IF EXISTS `login_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_info` (
  `userid` char(20) DEFAULT NULL,
  `passwrd` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_info`
--

LOCK TABLES `login_info` WRITE;
/*!40000 ALTER TABLE `login_info` DISABLE KEYS */;
INSERT INTO `login_info` VALUES ('raj','rajesh');
/*!40000 ALTER TABLE `login_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `memb_no` int(4) NOT NULL,
  `memb_name` varchar(30) DEFAULT NULL,
  `memb_add` varchar(40) DEFAULT NULL,
  `mdate` date DEFAULT NULL,
  `medate` date DEFAULT NULL,
  `mfee` double(8,2) DEFAULT NULL,
  `mem_status` char(1) DEFAULT NULL,
  `mem_issue` char(1) DEFAULT NULL,
  `memb_phone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`memb_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Rajesh Mishra','Sohabatia Bagh','2010-10-10','2010-10-10',500.00,'Y','N','9928722216'),(2,'Amar Nath','Allahpur','2010-11-10','2010-11-10',500.00,'Y','N','99123456'),(3,'Raghav Garg','Tagore Town','2011-01-01','2011-01-01',500.00,'Y','Y',''),(4,'Shailesh Srivsatava','Civil Lines Allahabad','2011-01-01','2011-01-01',500.00,'Y','N','');
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
INSERT INTO `missue` VALUES (1,NULL,1,'2011-01-10','2011-01-10'),(1,NULL,1,'2010-01-01','2010-01-01'),(1,NULL,3,'2011-01-20','2011-01-20');
/*!40000 ALTER TABLE `missue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `publisher` (
  `pub_id` int(4) NOT NULL,
  `Pub_name` varchar(30) NOT NULL,
  `Pub_address` varchar(40) DEFAULT NULL,
  `pub_phone1` varchar(12) DEFAULT NULL,
  `pub_phone2` varchar(12) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  PRIMARY KEY (`pub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (1,'RED CHILLI pro.','MUMBAI','23247736','23247737','Y'),(2,'WORNER BROTHERS','NEW YORK','43585858','','Y'),(3,'KHAN BROTHERS pro.','MUMBAI','','','Y'),(4,'T SERIES','MUMBAI','','','Y');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tissue`
--

DROP TABLE IF EXISTS `tissue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tissue` (
  `acc_no` int(4) DEFAULT NULL,
  `memb_no` int(4) DEFAULT NULL,
  `idate` date DEFAULT NULL,
  `rdate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tissue`
--

LOCK TABLES `tissue` WRITE;
/*!40000 ALTER TABLE `tissue` DISABLE KEYS */;
INSERT INTO `tissue` VALUES (1,3,'2011-01-20','2011-01-20'),(1,1,'2011-01-20','2011-01-20'),(1,1,'2011-01-02','2011-01-02');
/*!40000 ALTER TABLE `tissue` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-01-28 11:16:48
