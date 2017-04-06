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
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,300,'Enter description','',''),(2,2000,'Bill Description 1','RamTest','03/04/2017'),(3,300,'MyBillTest','It\'s my note','04/04/2017'),(4,2000,'BillTest','Bill addtest','04/04/2017'),(5,300,'Added Bill ID','note added','05/04/2017'),(6,600,'TestDesc','note1	','05/05/2017'),(7,600,'','',''),(8,600,'','',''),(9,900,'MergeTest','merge','01/05/2015'),(10,1500,'PayerTest','NotePayer','04/04/2017'),(11,2000,'Test2Payer','Payers test number 2','04/04/2017'),(12,2000,'Test2Payer','Payers test number 2','04/04/2017'),(13,2100,'Test3Payer','Payer3Test','05/04/2017'),(14,2000,'','',''),(15,2000,'TestIntegration','integration test 1','05/04/2017'),(16,900,'Integration Merge Test 8','merge8	','05/04/2017'),(17,4000,'RaghuIntegrationTest','RaghuTest	','5/4/17'),(18,6000,'DescriptionDebtTest','TestDebt','5/4/17'),(19,600,'Debt Check','Test for debt','5/4/17'),(20,1500,'Debt2','d2','5/4/17'),(21,2100,'Debt3','note3	','5/4/17'),(22,2000,'Debt3','testdebt3','5/4/17'),(23,3000,'test4','	','5/4/17'),(24,6000,'debtcheck','','5/4/17'),(25,3000,'','','5/4/17'),(26,5000,'debt','','5/4/17'),(27,3000,'d1','','5/4/17'),(28,1500,'','','5/4/17'),(29,1000,'','','5/4/17'),(30,2000,'','',''),(31,300,'','',''),(32,400,'test ','','6/4/17'),(33,800,'test1','test','6/4/17');
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
INSERT INTO `bill_members` VALUES (1,'dheeraj',100),(1,'ayushman',100),(1,'Hi_Tea',100),(2,'dheeraj',667),(2,'Hi_Tea',667),(2,'ayushman',667),(3,'coldplay',100),(3,'raghu',100),(3,'Hi_Tea',100),(4,'dheeraj',667),(4,'raju',667),(4,'coldplay',667),(5,'coldplay',60),(5,'raghu',60),(5,'Hi_Tea',60),(5,'raju',60),(5,'ayushman',60),(6,'coldplay',200),(6,'raghu',200),(6,'Hi_Tea',200),(7,'raju',300),(7,'Hi_Tea',300),(8,'Hi_Tea',600),(9,'coldplay',300),(9,'dheeraj',300),(9,'raghu',300),(10,'raghu',375),(11,'dheeraj',667),(12,'dheeraj',667),(13,'Hi_Tea',500),(13,'ayushman',600),(13,'raju',900),(13,'dheeraj',100),(14,'dheeraj',500),(14,'raju',500),(14,'raghu',500),(14,'Hi_Tea',500),(15,'ayushman',1000),(15,'dheeraj',1000),(16,'coldplay',225),(16,'ayushman',225),(16,'Hi_Tea',225),(16,'dheeraj',225),(17,'dheeraj',1000),(17,'tanmay',1000),(17,'Hi_Tea',1000),(17,'coldplay',1000),(18,'dheeraj',1500),(18,'raju',1500),(18,'tanmay',1500),(18,'coldplay',1500),(19,'dheeraj',120),(19,'raju',120),(19,'Hi_Tea',120),(19,'tanmay',120),(19,'coldplay',120),(20,'dheeraj',300),(20,'raju',300),(20,'Hi_Tea',300),(20,'tanmay',300),(20,'coldplay',300),(21,'dheeraj',420),(21,'raju',420),(21,'Hi_Tea',420),(21,'tanmay',420),(21,'coldplay',420),(22,'dheeraj',400),(22,'raju',400),(22,'Hi_Tea',400),(22,'tanmay',400),(22,'coldplay',400),(23,'dheeraj',600),(23,'raju',600),(23,'Hi_Tea',600),(23,'tanmay',600),(23,'coldplay',600),(24,'dheeraj',1200),(24,'raju',1200),(24,'Hi_Tea',1200),(24,'tanmay',1200),(24,'coldplay',1200),(25,'dheeraj',600),(25,'raju',600),(25,'Hi_Tea',600),(25,'tanmay',600),(25,'coldplay',600),(26,'dheeraj',1000),(26,'raju',1000),(26,'Hi_Tea',1000),(26,'tanmay',1000),(26,'coldplay',1000),(27,'dheeraj',600),(27,'raju',600),(27,'Hi_Tea',600),(27,'tanmay',600),(27,'coldplay',600),(28,'dheeraj',300),(28,'raju',300),(28,'tanmay',300),(28,'Hi_Tea',300),(28,'coldplay',300),(29,'dheeraj',500),(29,'Hi_Tea',500),(30,'dheeraj',1000),(30,'Hi_Tea',1000),(31,'dheeraj',300),(32,'dheeraj',400),(33,'Hi_Tea',800);
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
INSERT INTO `bill_payers` VALUES (11,'dheeraj',2000),(12,'dheeraj',2000),(13,'Hi_Tea',1100),(13,'raju',400),(13,'dheeraj',600),(14,'Hi_Tea',500),(14,'raghu',500),(14,'raju',500),(14,'dheeraj',500),(15,'ayushman',2000),(16,'Hi_Tea',200),(16,'ayushman',200),(16,'coldplay',200),(16,'dheeraj',300),(17,'dheeraj',4000),(18,'dheeraj',6000),(19,'dheeraj',300),(19,'raju',300),(20,'dheeraj',750),(20,'raju',750),(21,'Hi_Tea',1050),(21,'tanmay',1050),(22,'dheeraj',1000),(22,'raju',1000),(23,'dheeraj',1500),(23,'raju',1500),(24,'tanmay',6000),(25,'dheeraj',1500),(25,'raju',1500),(26,'tanmay',1667),(26,'Hi_Tea',1667),(26,'raju',1667),(27,'dheeraj',1500),(27,'tanmay',1500),(28,'Hi_Tea',1500),(29,'Hi_Tea',1000),(30,'dheeraj',2000),(31,'Hi_Tea',300),(32,'Hi_Tea',400),(33,'dheeraj',800);
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
INSERT INTO `debt` VALUES ('coldplay','tanmay',600),('Hi_Tea','dheeraj',100),('raju','tanmay',300),('raju','dheeraj',300),('coldplay','Hi_Tea',300),('tanmay','Hi_Tea',300),('raju','Hi_Tea',-500);
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
INSERT INTO `friend` VALUES ('ayushman','Hi_Tea'),('coldplay','ayushman'),('raju','raghu'),('raju','ayushman'),('coldplay','Hi_Tea'),('coldplay','raghu'),('tanmay','ayushman'),('tanmay','raghu'),('tanmay','raju'),('okhan','ayushman'),('okhan','coldplay'),('dheeraj','tanmay'),('dheeraj','coldplay'),('dheeraj','okhan'),('dheeraj','Hi_Tea');
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
INSERT INTO `user` VALUES ('ayushman','Ayushman Dey',9876543211,'ayushman@gmail.com','rajugandu','raju'),('coldplay','Chris Martin',1212121212,'coldplay@gmail.com','password','coldplay'),('dheeraj','Dheeraj Lalwani',7706979285,'dlalwani95@gmail.com','dheeraj','dheeraj'),('Hi_Tea','Sarthak Kukreja',9899234567,'sarthak@gmail.com','sarthak123','sarthak123'),('okhan','Owais Khan',7474569874,'okhan@gmail.com','owaiskhan','owaiskhan'),('raghu','Raghu Tiwari',8888804088,'raghu@gmail.com','raghu123','123raghu'),('raju','Aditya Raji',9898989898,'raju@gmail.com','rajugandu','123raju'),('tanmay','Tanmay Agrawal',7418529630,'tanmay@gmail.com','projectmanas','manas');
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

-- Dump completed on 2017-04-06 15:20:58
