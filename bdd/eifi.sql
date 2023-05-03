-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 03 mai 2023 à 14:30
-- Version du serveur : 10.4.25-MariaDB
-- Version de PHP : 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `eifi`
--

-- --------------------------------------------------------

--
-- Structure de la table `gestap`
--

CREATE TABLE `gestap` (
  `Matricule` int(10) NOT NULL,
  `Nom` varchar(30) NOT NULL,
  `PostNom` varchar(30) NOT NULL,
  `Prenom` varchar(30) NOT NULL,
  `Facultes` varchar(50) NOT NULL,
  `Promotion` varchar(5) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `Numero` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `gestap`
--

INSERT INTO `gestap` (`Matricule`, `Nom`, `PostNom`, `Prenom`, `Facultes`, `Promotion`, `Adresse`, `Numero`) VALUES
(1, 'ABUMBA', 'OTUNDU', 'Jean', 'Analyse et Programmation', 'AP1', 'Avenue Lumumba, Kinshasa', 812345678),
(2, 'ALUTA', 'MAMBELE', 'Yvette', 'Ingénierie et conception', 'AP2', 'Rue Colonel Ebeya, Kinshasa', 823456789),
(3, 'AMAVIE', 'MONGAMBO', 'Pierre', 'Analyse et Programmation', 'IC1', 'Rue des Coopérants, Kinshasa', 834567890),
(4, 'ASENTE', 'KONGOLO', 'Marie', 'Ingénierie et conception', 'IC2', 'Avenue des Huileries, Kinshasa', 845678901),
(5, 'AWASSO', 'MAKAYA', 'François', 'Analyse et Programmation', 'AP3', 'Rue du Fleuve, Kinshasa', 856789012),
(6, 'BAMANYA', 'JULES', 'Adeline', 'Ingénierie et conception', 'IC3', 'Avenue Tombalbaye, Kinshasa', 867890123),
(7, 'BASHALA', 'TSHIPAMA', 'David', 'Analyse et Programmation', 'AP1', 'Rue Mputu, Kinshasa', 878901234),
(8, 'BELE', 'NGUMA', 'Aline', 'Ingénierie et conception', 'IC2', 'Rue Lopori, Kinshasa', 889012345),
(9, 'BINGO', 'YANGALO', 'Gérard', 'Analyse et Programmation', 'AP3', 'Avenue des Brasseries, Kinshasa', 890123456),
(10, 'BINONGA', 'PEMBELE', 'Sophie', 'Ingénierie et conception', 'IC1', 'Rue Bokundo, Kinshasa', 901234567),
(11, 'BUAKA', 'NOLLEYELO', 'Jules', 'Analyse et Programmation', 'AP1', 'Avenue Lusinga, Commune de Kasa-Vubu, Kinshasa', 812345678),
(12, 'BUNGU', 'LIABO', 'Dorcas', 'Ingénierie et Conception', 'IC1', 'Avenue Basoko, Commune de Lingwala, Kinshasa', 976543210),
(13, 'BWALEGA', 'KISEGE', 'Audrey', 'Analyse et Programmation', 'AP2', 'Avenue Colonel Mondjiba, Commune de Bandalungwa, K', 898765432),
(14, 'BWEMA', 'ISSAC', 'Kévin', 'Ingénierie et Conception', 'IC2', 'Avenue Mwepu Ilunga, Commune de Matete, Kinshasa', 965432178),
(15, 'CIMBALANGA', 'MBUYI', 'Marie', 'Analyse et Programmation', 'AP3', 'Avenue Mama Yemo, Commune de Ngaliema, Kinshasa', 812345678),
(16, 'DJONGALEDI', 'MUDIBU', 'Alexis', 'Ingénierie et Conception', 'IC3', 'Avenue Lobo, Commune de Kalamu, Kinshasa', 976543210),
(17, 'EFUTO', 'WANYENGA', 'Aurélie', 'Analyse et Programmation', 'AP1', 'Avenue Mwenze Kongolo, Commune de Limete, Kinshasa', 898765432),
(18, 'ELEKA', 'NZUZI', 'Nathan', 'Ingénierie et Conception', 'IC2', 'Avenue Boyambi, Commune de Ngiri-Ngiri, Kinshasa', 965432178),
(19, 'GINENGA', 'MWAMBA', 'Diana', 'Analyse et Programmation', 'AP3', 'Avenue Munyororo, Commune de Kasa-Vubu, Kinshasa', 812345678),
(20, 'GINGUA', 'NDONGALA', 'Serge', 'Ingénierie et Conception', 'IC1', 'Avenue Ngafani, Commune de Bandalungwa, Kinshasa', 976543210),
(21, 'KABEYA', 'NKULU', 'MUNENE', 'Analyse et Programmation', 'AP1', 'Avenue Lukusa', 89754321),
(22, 'KATSHINGA', 'LUWAWU', 'PASCAL', 'Ingénierie et Conception', 'IC2', 'Rue Kambove', 97512345),
(23, 'KILOLO', 'MUTOMBO', 'DANIEL', 'Analyse et Programmation', 'AP3', 'Avenue Nguma', 84563219),
(24, 'KOMBE', 'NSOMBO', 'GÉRARD', 'Ingénierie et Conception', 'IC1', 'Rue Kitambo', 97840123),
(25, 'LUMUKU', 'TSHITE', 'ANSELME', 'Analyse et Programmation', 'AP2', 'Avenue Lumumba', 87654321),
(26, 'NSAKI', 'BETSA', 'Betsa', 'Analyse et Programmation', 'AP2', 'Mwamba', 9088708),
(27, 'MAMPWO', 'KALALA', 'Grace', 'Analyse et Programmation', 'AP2', 'Mba', 976664789),
(28, 'KABONGO', 'KILOLA', 'Gerteude', 'Analyse et Programmation', 'AP1', 'selkf', 98757);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `gestap`
--
ALTER TABLE `gestap`
  ADD PRIMARY KEY (`Matricule`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `gestap`
--
ALTER TABLE `gestap`
  MODIFY `Matricule` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
