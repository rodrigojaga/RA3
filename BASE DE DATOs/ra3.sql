-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-05-2023 a las 15:17:39
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ra3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `nit` int(11) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `genero` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nombre`, `nit`, `correo`, `genero`) VALUES
(1, 'Martin', 18549671, 'marti@gmail.com', 'M'),
(2, 'Abramo', 100001, 'adahill0@mail.ru', 'M'),
(3, 'Paxon', 100002, 'pgambrell1@walmart.com', 'F'),
(4, 'Codi', 100003, 'cjervois2@joomla.org', 'M'),
(5, 'Margaretha', 100004, 'mfawdrey3@indiegogo.com', 'F'),
(6, 'Jamie', 100005, 'jbrosi4@redcross.org', 'F'),
(7, 'Giles', 100006, 'gcraydon5@surveymonkey.com', 'M'),
(8, 'Joye', 100007, 'jgrange6@disqus.com', 'M'),
(9, 'Amos', 100008, 'arulf7@ow.ly', 'F'),
(10, 'Karney', 100009, 'kfilyukov8@elpais.com', 'M'),
(11, 'Tasia', 100010, 'tmiklem9@seattletimes.com', 'F'),
(12, 'Adham', 100011, 'afoyea@a8.net', 'M'),
(13, 'Stephannie', 100012, 'sdrinnanb@reuters.com', 'M'),
(14, 'Steve', 100013, 'sstillyc@auda.org.au', 'F'),
(15, 'Anabel', 100014, 'ashoweringd@list-manage.com', 'F'),
(16, 'Mignon', 100015, 'mpatmoree@prnewswire.com', 'M'),
(17, 'Madelena', 100016, 'mtimmisf@stanford.edu', 'F'),
(18, 'Guillermo', 100017, 'gpondg@blogspot.com', 'F'),
(19, 'Marijo', 100018, 'mvardieh@dailymotion.com', 'M'),
(20, 'Zora', 100019, 'zbinesteadi@hhs.gov', 'M'),
(21, 'Tamra', 100020, 'tcotterellj@abc.net.au', 'F'),
(22, 'Helen', 100021, 'hsedenk@engadget.com', 'M'),
(23, 'Goldy', 100022, 'gbettlesonl@about.me', 'F'),
(24, 'Leila', 100023, 'ledworthyem@hibu.com', 'M'),
(25, 'Allx', 100024, 'abaudoun@aol.com', 'M'),
(26, 'Everett', 100025, 'ekunzeo@nba.com', 'F'),
(27, 'Ruthi', 100026, 'rsumblerp@shareasale.com', 'M'),
(28, 'Karlens', 100027, 'kdenizetq@loc.gov', 'M'),
(29, 'Rachel', 100028, 'rfurlowr@examiner.com', 'M'),
(30, 'Perez', 1000054, 'perez@yahoo.mx', 'M'),
(31, 'Juan', 10000100, 'jaun@gov.gt', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hisventa`
--

CREATE TABLE `hisventa` (
  `no_factura` int(11) NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `accion` mediumblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `hisventa`
--

INSERT INTO `hisventa` (`no_factura`, `id_cliente`, `fecha`, `total`, `accion`) VALUES
(1, 20, '2023-05-02', 10861, NULL),
(3, 30, '2023-05-02', 4655, NULL),
(4, 30, '2023-05-02', 2938, NULL),
(5, 31, '2023-05-02', 1457, NULL),
(7, 20, '2023-05-02', 2079, NULL),
(8, 1, '2023-05-02', 4850, NULL),
(9, 14, '2023-05-02', 1165, NULL),
(10, 13, '2023-05-02', 2089, NULL),
(11, 9, '2023-05-02', 2718, NULL),
(12, 12, '2023-05-02', 1396, NULL),
(13, 3, '2016', 1500, NULL),
(14, 4, '2016', 1500, 0x433a55736572730d6f6472694f6e6544726976654465736b746f700d6133464143545552415f454c454354524f4e4943415f424c55452d4d414c4c5f457665726574745f323032332d30352d30322e706466),
(15, 30, '2023-05-02', 698, 0x707275656261),
(16, 2, '2023-05-02', 698, 0x707275656261),
(17, 30, '2023-05-02', 698, 0x5b504f4f2e66616374757261504f4f4033646665303061365d0a31370a323032332d30352d30320a323032332d30352d30325432303a32373a35342e3336310a6e756c6c0a300a313030303035340a506572657a3639372e3838),
(18, 29, '2023-05-02', 698, 0x5b504f4f2e66616374757261504f4f4035313735613335625d0a31380a323032332d30352d30320a323032332d30352d30325432303a32393a30302e3836390a6e756c6c0a300a3130303032380a52616368656c0a3639372e3838),
(19, 20, '2023-05-02', 10386, 0x5b504f4f2e66616374757261504f4f4036373233326630312c20504f4f2e66616374757261504f4f4034373362323636612c20504f4f2e66616374757261504f4f4034303132653732302c20504f4f2e66616374757261504f4f4031373033636664385d0a31390a323032332d30352d30320a323032332d30352d30325432303a33373a31362e3637370a6e756c6c0a300a3130303031390a5a6f72610a31303338352e3639),
(20, 12, '2023-05-03', 2792, 0x5b504f4f2e66616374757261504f4f4031303364643365612c20504f4f2e66616374757261504f4f40643834626236615d0a32300a323032332d30352d30330a323032332d30352d30335430363a35363a34312e3032350a6e756c6c0a300a3130303031310a416468616d0a323739312e3532),
(21, 26, '2023-05-03', 693, 0x5b504f4f2e66616374757261504f4f4034373338383730345d0a32310a323032332d30352d30330a323032332d30352d30335430363a35373a32312e3239380a6e756c6c0a300a3130303032350a457665726574740a3639322e3834),
(22, 24, '2023-05-03', 906, 0x5b504f4f2e66616374757261504f4f40353234646233365d0a32320a323032332d30352d30330a323032332d30352d30335430373a30323a35392e3838380a6e756c6c0a300a3130303032330a4c65696c610a3930362e3037);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id_producto` int(11) NOT NULL,
  `nombre` varchar(60) DEFAULT NULL,
  `descripcion` varchar(150) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` double(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id_producto`, `nombre`, `descripcion`, `cantidad`, `precio`) VALUES
(1, 'Doritos', 'Fritura', 100, 3.75),
(2, 'Energy Drink', 'Cremin and Sons', 100, 100.33),
(3, 'Oil - Grapeseed Oil', 'Bednar, King and Kilback', 100, 697.88),
(4, 'Tuna - Salad Premix', 'Green and Sons', 100, 692.84),
(5, 'Pails With Lids', 'Jakubowski-Kling', 100, 906.07),
(6, 'Sparkling Wine - Rose, Freixenet', 'Schowalter-Morissette', 100, 443.28),
(7, 'Milk - Skim', 'Graham, Miller and Weissnat', 100, 259.72),
(8, 'Herb Du Provence - Primerba', 'Emard, Haag and Larkin', 100, 100.02),
(9, 'Cookies - Englishbay Wht', 'Keebler, Bogisich and Mann', 100, 621.50),
(10, 'Coffee Cup 8oz 5338cd', 'Simonis-Mohr', 100, 777.46),
(11, 'Lettuce - Boston Bib', 'Cremin-Hintz', 100, 987.36),
(12, 'Noodles - Cellophane, Thin', 'Skiles, Block and Konopelski', 100, 570.74),
(13, 'Mushroom - King Eryingii', 'Kilback, Goyette and Padberg', 64, 5.71),
(14, 'Tortillas - Flour, 8', 'Mohr and Sons', 38, 774.83),
(15, 'Chevere Logs', 'Macejkovic, Heathcote and Keeling', 35, 401.61),
(16, 'Tea - Decaf Lipton', 'Ledner-Abshire', 100, 363.67),
(17, 'Lettuce - Iceberg', 'Osinski-Runolfsdottir', 100, 83.41),
(18, 'Chips Potato Salt Vinegar 43g', 'Mueller, Moen and Kirlin', 39, 978.92),
(19, 'Mushroom - Oyster, Fresh', 'Hudson-Beahan', 42, 962.29),
(20, 'Peas - Pigeon, Dry', 'Jakubowski, Morissette and Kulas', 100, 877.97),
(21, 'Gatorade - Xfactor Berry', 'Kassulke-Hand', 76, 840.01),
(22, 'Smoked Tongue', 'Haley LLC', 22, 667.36),
(23, 'Carrots - Mini, Stem On', 'Gislason, Runolfsson and Murazik', 18, 192.86),
(24, 'Cake - Pancake', 'Barrows Inc', 38, 501.09),
(25, 'Sauce - Vodka Blush', 'Torp, Howe and Daniel', 20, 382.20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `id_sucursal` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sucursales`
--

INSERT INTO `sucursales` (`id_sucursal`, `nombre`, `direccion`, `correo`, `telefono`) VALUES
(1, 'EstrelitaLP', 'Zona 10', 'estreZ10@gmail.com', 12457810);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedores`
--

CREATE TABLE `vendedores` (
  `id_vendedor` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `caja` int(11) DEFAULT NULL,
  `ventas` int(11) DEFAULT NULL,
  `genero` varchar(2) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vendedores`
--

INSERT INTO `vendedores` (`id_vendedor`, `nombre`, `caja`, `ventas`, `genero`, `password`) VALUES
(1, 'Paco', 1, 89, 'M', 'aguacate'),
(2, 'Katrinka', 101, 0, 'M', 'af579a200b74797b3e78822bf28c2985'),
(3, 'Katleen', 102, 0, 'M', 'e3699d375ded04880e3166dc55f89fde'),
(4, 'Felizio', 103, 0, 'M', '379094cd2c69562f8b8305439b49a613'),
(5, 'Arnie', 104, 0, 'F', '808cb3e29688a78c56610d2a457e5ee4'),
(6, 'Edwin', 105, 0, 'F', '4a562ffc4813726d83d0acdd854fc87d'),
(7, 'Laurens', 106, 0, 'F', '1a7417ff18ee9bfe6f04233dd7ec6908'),
(8, 'Allianora', 107, 0, 'M', '3910f2c2fc6b5bce7ed4d739ae576928'),
(9, 'Johnnie', 108, 0, 'F', 'e1d6c5af6076cb6f1d21833b017f7acf'),
(10, 'Kala', 109, 0, 'M', '08621114b828e2910eb45cc0f1d5c11e'),
(11, 'Terrijo', 110, 0, 'M', '5713177c9d4678186b4f52fc58adfca7'),
(12, 'Broderick', 111, 0, 'F', 'f00c4e0dbd8e53f198d650fc877d51c5'),
(13, 'Junia', 112, 0, 'M', '8623116fdaf6cec4a6f34cfdf33e8875'),
(14, 'Myrah', 113, 0, 'M', 'e6ce0d8beebbcb4a35ceeb81d0fa993a'),
(15, 'Wendeline', 114, 0, 'M', 'bebbd8a4c3b2f1498bf9ccd567e9390c'),
(16, 'Malcolm', 115, 0, 'M', 'b24449675845d066d0b8b0823c8125e7'),
(17, 'Otis', 116, 0, 'M', 'cc75ca180881baa4d6fa02673e247891'),
(18, 'Sanford', 117, 0, 'M', '47a30d30bcbe2a852751dbcc6f846a48'),
(19, 'Bar', 118, 0, 'M', 'c635b159445bf65eaf68805aafbfe449');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `hisventa`
--
ALTER TABLE `hisventa`
  ADD PRIMARY KEY (`no_factura`),
  ADD KEY `facturakey` (`id_cliente`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`id_sucursal`);

--
-- Indices de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`id_vendedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `hisventa`
--
ALTER TABLE `hisventa`
  MODIFY `no_factura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `id_sucursal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `id_vendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `hisventa`
--
ALTER TABLE `hisventa`
  ADD CONSTRAINT `facturakey` FOREIGN KEY (`id_cliente`) REFERENCES `clientes` (`id_cliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
