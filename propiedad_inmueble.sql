-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-06-2022 a las 22:05:13
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmobiliaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad_inmueble`
--

CREATE TABLE `propiedad_inmueble` (
  `idPropiedad` int(11) NOT NULL,
  `accesibilidad` varchar(50) NOT NULL,
  `caracteristicas` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `zona` varchar(50) NOT NULL,
  `estadoLocal` varchar(50) NOT NULL,
  `tipoDeLocal` varchar(50) NOT NULL,
  `superficie` int(11) NOT NULL,
  `forma` varchar(50) NOT NULL,
  `precioTazado` double NOT NULL,
  `idInquilino` int(11) NOT NULL,
  `idPropietario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD PRIMARY KEY (`idPropiedad`),
  ADD KEY `idPropietario` (`idPropietario`),
  ADD KEY `idInquilino` (`idInquilino`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  MODIFY `idPropiedad` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD CONSTRAINT `propiedad_inmueble_ibfk_1` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`),
  ADD CONSTRAINT `propiedad_inmueble_ibfk_2` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
