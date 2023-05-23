-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 09, 2022 at 05:41 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mycafe`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbadmin`
--

CREATE TABLE `tbadmin` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbadmin`
--

INSERT INTO `tbadmin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tbitem`
--

CREATE TABLE `tbitem` (
  `id` varchar(30) NOT NULL,
  `item` varchar(30) NOT NULL,
  `price` varchar(30) NOT NULL,
  `type` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbitem`
--

INSERT INTO `tbitem` (`id`, `item`, `price`, `type`) VALUES
('mkn01', 'Sosis Bakar', '5000', 'Food'),
('mkn02', 'Roti Bakar', '10000', 'Food'),
('mkn03', 'Kentang ', '15000', 'Food'),
('mkn04', 'Nasi Goreng', '20000', 'Food'),
('mnm01', 'Es Teh', '5000', 'Drink'),
('mnm02', 'Capucino', '10000', 'Drink'),
('mnm03', 'Jus', '15000', 'Drink'),
('mnm04', 'Capucino Spesial', '20000', 'Drink');

-- --------------------------------------------------------

--
-- Table structure for table `tbtransaction`
--

CREATE TABLE `tbtransaction` (
  `transactioncode` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `item` varchar(30) NOT NULL,
  `price` varchar(30) NOT NULL,
  `qty` varchar(30) NOT NULL,
  `total` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbtransaction`
--

INSERT INTO `tbtransaction` (`transactioncode`, `username`, `item`, `price`, `qty`, `total`) VALUES
('TC001', 'Alif', 'jus', '15000', '1', '15000'),
('-1268063149', 'Alif', 'Nasi Goreng', '20000', '4', '80000'),
('-1268063149', 'Alif', 'Capucino Spesial', '20000', '4', '80000'),
('684277229', 'Pito', 'Jus', '15000', '3', '45000'),
('684277229', 'Pito', 'Kentang ', '15000', '3', '45000'),
('-1435484027', 'Ika', 'Roti Bakar', '10000', '4', '40000'),
('-1435484027', 'Ika', 'Capucino', '10000', '4', '40000');

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE `tbuser` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`username`, `password`, `name`) VALUES
('Alif', '1', 'Alif'),
('Ika', '1', 'Ika'),
('Pito', '1', 'Pito');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbadmin`
--
ALTER TABLE `tbadmin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tbitem`
--
ALTER TABLE `tbitem`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbuser`
--
ALTER TABLE `tbuser`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
