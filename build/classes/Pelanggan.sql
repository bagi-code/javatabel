-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 11, 2013 at 08:39 AM
-- Server version: 5.5.32
-- PHP Version: 5.3.10-1ubuntu3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Pelanggan`
--

-- --------------------------------------------------------

--
-- Table structure for table `Data`
--

CREATE TABLE IF NOT EXISTS `Data` (
  `Nama` varchar(25) NOT NULL,
  `Alamat` varchar(35) NOT NULL,
  `Email` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Data`
--

INSERT INTO `Data` (`Nama`, `Alamat`, `Email`) VALUES
('Resa', 'Yogya', 'resa@gmail.com'),
('Ayu', 'Jakarta', 'ayu@gmail.com'),
('Candra', 'Yogya', 'cc@gmail.com'),
('Dian', 'Solo', 'dd@gmail.com'),
('Dita', 'Jakarta', 'dt@gmail.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
