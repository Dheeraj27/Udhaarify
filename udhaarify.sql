-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: udhaarify
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill` (
  `BILL_ID` int(11) NOT NULL AUTO_INCREMENT,
  `bill_amt` int(11) DEFAULT NULL,
  `description` varchar(160) DEFAULT NULL,
  `notes` varchar(160) DEFAULT NULL,
  `bill_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`BILL_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,300,'Enter description','',''),(2,2000,'Bill Description 1','RamTest','03/04/2017'),(3,300,'MyBillTest','It\'s my note','04/04/2017'),(4,2000,'BillTest','Bill addtest','04/04/2017'),(5,300,'Added Bill ID','note added','05/04/2017'),(6,600,'TestDesc','note1	','05/05/2017'),(7,600,'','',''),(8,600,'','',''),(9,900,'MergeTest','merge','01/05/2015'),(10,1500,'PayerTest','NotePayer','04/04/2017'),(11,2000,'Test2Payer','Payers test number 2','04/04/2017'),(12,2000,'Test2Payer','Payers test number 2','04/04/2017'),(13,2100,'Test3Payer','Payer3Test','05/04/2017'),(14,2000,'','',''),(15,2000,'TestIntegration','integration test 1','05/04/2017'),(16,900,'Integration Merge Test 8','merge8	','05/04/2017');
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_members`
--

DROP TABLE IF EXISTS `bill_members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_members` (
  `bill_ID` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  KEY `bill_ID` (`bill_ID`),
  CONSTRAINT `bill_members_ibfk_1` FOREIGN KEY (`bill_ID`) REFERENCES `bill` (`BILL_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_members`
--

LOCK TABLES `bill_members` WRITE;
/*!40000 ALTER TABLE `bill_members` DISABLE KEYS */;
INSERT INTO `bill_members` VALUES (1,'dheeraj',100),(1,'ayushman',100),(1,'Hi_Tea',100),(2,'dheeraj',667),(2,'Hi_Tea',667),(2,'ayushman',667),(3,'coldplay',100),(3,'raghu',100),(3,'Hi_Tea',100),(4,'dheeraj',667),(4,'raju',667),(4,'coldplay',667),(5,'coldplay',60),(5,'raghu',60),(5,'Hi_Tea',60),(5,'raju',60),(5,'ayushman',60),(6,'coldplay',200),(6,'raghu',200),(6,'Hi_Tea',200),(7,'raju',300),(7,'Hi_Tea',300),(8,'Hi_Tea',600),(9,'coldplay',300),(9,'dheeraj',300),(9,'raghu',300),(10,'raghu',375),(11,'dheeraj',667),(12,'dheeraj',667),(13,'Hi_Tea',500),(13,'ayushman',600),(13,'raju',900),(13,'dheeraj',100),(14,'dheeraj',500),(14,'raju',500),(14,'raghu',500),(14,'Hi_Tea',500),(15,'ayushman',1000),(15,'dheeraj',1000),(16,'coldplay',225),(16,'ayushman',225),(16,'Hi_Tea',225),(16,'dheeraj',225);
/*!40000 ALTER TABLE `bill_members` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bill_payers`
--

DROP TABLE IF EXISTS `bill_payers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bill_payers` (
  `bill_id` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill_payers`
--

LOCK TABLES `bill_payers` WRITE;
/*!40000 ALTER TABLE `bill_payers` DISABLE KEYS */;
INSERT INTO `bill_payers` VALUES (11,'dheeraj',2000),(12,'dheeraj',2000),(13,'Hi_Tea',1100),(13,'raju',400),(13,'dheeraj',600),(14,'Hi_Tea',500),(14,'raghu',500),(14,'raju',500),(14,'dheeraj',500),(15,'ayushman',2000),(16,'Hi_Tea',200),(16,'ayushman',200),(16,'coldplay',200),(16,'dheeraj',300);
/*!40000 ALTER TABLE `bill_payers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `debt`
--

DROP TABLE IF EXISTS `debt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `debt` (
  `payer` varchar(20) DEFAULT NULL,
  `payee` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `debt`
--

LOCK TABLES `debt` WRITE;
/*!40000 ALTER TABLE `debt` DISABLE KEYS */;
/*!40000 ALTER TABLE `debt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend`
--

DROP TABLE IF EXISTS `friend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friend` (
  `username` varchar(20) DEFAULT NULL,
  `friend_username` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend`
--

LOCK TABLES `friend` WRITE;
/*!40000 ALTER TABLE `friend` DISABLE KEYS */;
INSERT INTO `friend` VALUES ('ayushman','Hi_Tea'),('coldplay','ayushman'),('raju','raghu'),('raju','ayushman'),('dheeraj','raghu'),('dheeraj','ayushman'),('dheeraj','raju'),('coldplay','Hi_Tea'),('coldplay','dheeraj'),('coldplay','raghu');
/*!40000 ALTER TABLE `friend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `transaction` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `payer` varchar(20) DEFAULT NULL,
  `payee` varchar(20) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transaction`
--

LOCK TABLES `transaction` WRITE;
/*!40000 ALTER TABLE `transaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `transaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `pass_hint` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('ayushman','Ayushman Dey',9876543211,'ayushman@gmail.com','rajugandu','raju'),('coldplay','Chris Martin',1212121212,'coldplay@gmail.com','password','coldplay'),('dheeraj','Dheeraj Lalwani',7706979285,'dlalwani95@gmail.com','dheeraj','dheeraj'),('Hi_Tea','Sarthak Kukreja',9899234567,'sarthak@gmail.com','sarthak123','sarthak123'),('raghu','Raghu Tiwari',8888804088,'raghu@gmail.com','raghu123','123raghu'),('raju','Aditya Raji',9898989898,'raju@gmail.com','rajugandu','123raju');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-04-05 16:53:21
