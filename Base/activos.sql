-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-09-2017 a las 05:41:08
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `activosfijos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `activos`
--

CREATE TABLE IF NOT EXISTS `activos` (
  `id` int(4) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `NumeroInt` int(4) NOT NULL,
  `Descripcion` varchar(1000) NOT NULL,
  `Tipo` varchar(50) NOT NULL,
  `Serial` varchar(10) NOT NULL,
  `Peso` float(3,2) NOT NULL,
  `Alto` float(3,2) NOT NULL,
  `Largo` float(3,2) NOT NULL,
  `Valor` float(3,2) NOT NULL,
  `FechaCompra` date NOT NULL,
  `FechaBaja` date NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `Color` varchar(10) NOT NULL,
  `Persona` int(4) NOT NULL,
  `Area` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `activos`
--
ALTER TABLE `activos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `activos`
--
ALTER TABLE `activos`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
