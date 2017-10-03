-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-10-2017 a las 02:34:16
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
  `Tipo` varchar(50) NOT NULL,
  `Serial` varchar(10) NOT NULL,
  `Peso` float(3,2) NOT NULL,
  `Alto` float(3,2) NOT NULL,
  `Largo` float(3,2) NOT NULL,
  `Valor` float(15,2) NOT NULL,
  `FechaCompra` date NOT NULL,
  `FechaBaja` date NOT NULL,
  `Estado` varchar(20) NOT NULL,
  `Color` varchar(10) NOT NULL,
  `Persona` int(4) DEFAULT NULL,
  `Area` int(4) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `activos`
--

INSERT INTO `activos` (`id`, `Nombre`, `NumeroInt`, `Tipo`, `Serial`, `Peso`, `Alto`, `Largo`, `Valor`, `FechaCompra`, `FechaBaja`, `Estado`, `Color`, `Persona`, `Area`) VALUES
(1, 'Televisor', 1, 'bienes', '9090', 9.99, 0.50, 0.50, 20000.00, '2017-09-07', '2017-09-08', 'Activo', 'rojo', NULL, 1),
(2, 'computador', 20, 'computador', 'computador', 1.50, 1.50, 1.50, 1.60, '2010-01-08', '2020-01-08', 'computador', 'computador', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE IF NOT EXISTS `area` (
  `id` int(4) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `ciudad` varchar(10) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`id`, `nombre`, `ciudad`) VALUES
(0, 'dummy', 'dummy'),
(1, 'BBS', 'CALI'),
(2, 'OSS', 'PALMIRA'),
(3, 'BBS', 'Medellin');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE IF NOT EXISTS `persona` (
  `id` int(4) NOT NULL,
  `nombre` varchar(100) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `nombre`) VALUES
(0, 'dummy'),
(1, 'Sergio'),
(2, 'Vladimir'),
(3, 'Diaz'),
(4, 'Rolon'),
(5, 'Maria'),
(6, 'Andrea'),
(7, 'Kelly'),
(8, 'Mariana'),
(9, 'Paula'),
(10, 'Yesid'),
(11, 'Koraima'),
(12, 'Wendy'),
(13, 'Lorena'),
(14, 'Paula'),
(15, 'Pedro'),
(16, 'miguel'),
(17, 'William'),
(18, 'Daniel'),
(19, 'Arturo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `activos`
--
ALTER TABLE `activos`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `NumeroInt` (`NumeroInt`);

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `Ciudad` (`ciudad`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `activos`
--
ALTER TABLE `activos`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=21;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
