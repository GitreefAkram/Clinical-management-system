-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2021 at 02:43 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `admin`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `name` varchar(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `id` int(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `address` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`name`, `contact`, `id`, `password`, `address`) VALUES
('Muhammad Taha', '03058276629', 1001, 'wateR123', 'II, b-12 Karachi Sin');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `name` varchar(30) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `id` int(60) NOT NULL,
  `address` varchar(500) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`name`, `contact`, `id`, `address`, `password`) VALUES
('Babar Azam', '032145698', 101, '12th street johar karachi', 'secuRed12'),
('Musa Kamran', '02136547', 102, '4 b 13 plot 420 nazimabad karachi', '12345'),
('Raheel Afzal', '023658742139', 103, '23 4 plot a 102 machar colony karachi', '12345'),
('Abdul Bari', '0321459887', 104, 'peetal gali 2nd plot gulbahar karachi', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `name` varchar(30) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `id` int(30) NOT NULL,
  `address` varchar(500) NOT NULL,
  `disease` varchar(500) NOT NULL,
  `prescribe` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`name`, `contact`, `id`, `address`, `disease`, `prescribe`) VALUES
('musab', '03214599', 10600, 'gsd fhgfj fgnfgolui[\'oik/uvf gtf67y968-u ', 'Nazla Zukaam', 'Panadol(1+1+1)'),
('Kashif Ahmed', '03214569', 10601, 'mukka chawk karachi', '', ''),
('Shafqat Memood', '03214569', 10602, '13 b 9211 st. islamabad', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `reception`
--

CREATE TABLE `reception` (
  `name` varchar(30) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `id` int(30) NOT NULL,
  `address` varchar(500) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `reception`
--

INSERT INTO `reception` (`name`, `contact`, `id`, `address`, `password`) VALUES
('Sohail Tariq', '0321465823', 212100, '5th street karachi', 'Afzal23'),
('Shahrukh Akram', '01256983', 212101, 'patel para ya gizri karachi', '12345'),
('Yousuf Ali', '0325698742', 212102, 'DHA fase 2 karachi', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `reception`
--
ALTER TABLE `reception`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1003;

--
-- AUTO_INCREMENT for table `doctor`
--
ALTER TABLE `doctor`
  MODIFY `id` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10603;

--
-- AUTO_INCREMENT for table `reception`
--
ALTER TABLE `reception`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=212103;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
