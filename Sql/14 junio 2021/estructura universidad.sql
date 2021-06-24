-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Universidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Universidad` (
  `idUniversidad` INT NULL AUTO_INCREMENT,
  `nomUniversidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUniversidad`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Carrera`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Carrera` (
  `idCarrera` INT NULL AUTO_INCREMENT,
  `nomCarrera` VARCHAR(45) NOT NULL,
  `idUniversidad` INT NOT NULL,
  `numSemestres` INT NOT NULL,
  `numAsignaturas` INT NOT NULL,
  `numProfesores` INT NOT NULL,
  PRIMARY KEY (`idCarrera`),
  INDEX `fk_carrera_univ_idx` (`idUniversidad` ASC),
  CONSTRAINT `fk_carrera_univ`
    FOREIGN KEY (`idUniversidad`)
    REFERENCES `mydb`.`Universidad` (`idUniversidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Semestre`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Semestre` (
  `idSemestre` INT NULL AUTO_INCREMENT,
  `idcarrera` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSemestre`),
  INDEX `fk_semestre_carrera_idx` (`idcarrera` ASC),
  CONSTRAINT `fk_semestre_carrera`
    FOREIGN KEY (`idcarrera`)
    REFERENCES `mydb`.`Carrera` (`idCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Profesor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Profesor` (
  `idProfesor` INT NULL AUTO_INCREMENT,
  `rutProfesor` VARCHAR(12) NOT NULL,
  `nomProfesor` VARCHAR(25) NOT NULL,
  `apeProfesor` VARCHAR(25) NOT NULL,
  `carreraProf` VARCHAR(20) NOT NULL,
  `fichaProf` VARCHAR(45) NOT NULL,
  `direccionProf` VARCHAR(23) NOT NULL,
  `celularProf` INT NOT NULL,
  `fecNacimiento` DATE NOT NULL,
  `fecIngreso` DATE NULL,
  PRIMARY KEY (`idProfesor`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Asignatura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Asignatura` (
  `idAsignatura` INT NULL AUTO_INCREMENT,
  `idSemestre` INT NULL,
  `nomAsigna` VARCHAR(25) NOT NULL,
  `idprofesor` INT NULL,
  `numSemestre` INT NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAsignatura`),
  INDEX `fk_asignatura_semestre_idx` (`idSemestre` ASC),
  INDEX `fk_asignatura_profesor_idx` (`idprofesor` ASC),
  CONSTRAINT `fk_asignatura_semestre`
    FOREIGN KEY (`idSemestre`)
    REFERENCES `mydb`.`Semestre` (`idSemestre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asignatura_profesor`
    FOREIGN KEY (`idprofesor`)
    REFERENCES `mydb`.`Profesor` (`idProfesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Alumnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Alumnos` (
  `idAlumno` INT NULL AUTO_INCREMENT,
  `idCarrera` INT NOT NULL,
  `rutAlumno` VARCHAR(12) NOT NULL,
  `nomAlumno` VARCHAR(25) NOT NULL,
  `ApeAlumno` VARCHAR(25) NOT NULL,
  `direccionAlum` VARCHAR(23) NOT NULL,
  `celularAlum` INT NOT NULL,
  `fecNacimiento` DATE NOT NULL,
  `fecIngreso` DATE NULL,
  `idProfesor` INT NULL,
  PRIMARY KEY (`idAlumno`),
  INDEX `fk_alumno_carrera_idx` (`idCarrera` ASC),
  INDEX `fk_alumno_profesor_idx` (`idProfesor` ASC),
  CONSTRAINT `fk_alumno_carrera`
    FOREIGN KEY (`idCarrera`)
    REFERENCES `mydb`.`Carrera` (`idCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_alumno_profesor`
    FOREIGN KEY (`idProfesor`)
    REFERENCES `mydb`.`Profesor` (`idProfesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Notas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Notas` (
  `idNota` INT NULL AUTO_INCREMENT,
  `idAlumno` INT NOT NULL,
  `nota` FLOAT NOT NULL,
  `idProfesor` INT NOT NULL,
  `idAsignatura` INT NOT NULL,
  `IdSemestre` INT NOT NULL,
  `fecNota` DATE NOT NULL,
  `idCarrera` INT NOT NULL,
  PRIMARY KEY (`idNota`),
  INDEX `fk_notas_alumno_idx` (`idAlumno` ASC),
  INDEX `fk_notas_profesor_idx` (`idProfesor` ASC),
  INDEX `fk_notas_asignatura_idx` (`idAsignatura` ASC),
  INDEX `fk_notas_semestre_idx` (`IdSemestre` ASC),
  INDEX `fk_notas_carrera_idx` (`idCarrera` ASC),
  CONSTRAINT `fk_notas_alumno`
    FOREIGN KEY (`idAlumno`)
    REFERENCES `mydb`.`Alumnos` (`idAlumno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notas_profesor`
    FOREIGN KEY (`idProfesor`)
    REFERENCES `mydb`.`Profesor` (`idProfesor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notas_asignatura`
    FOREIGN KEY (`idAsignatura`)
    REFERENCES `mydb`.`Asignatura` (`idAsignatura`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notas_semestre`
    FOREIGN KEY (`IdSemestre`)
    REFERENCES `mydb`.`Semestre` (`idSemestre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_notas_carrera`
    FOREIGN KEY (`idCarrera`)
    REFERENCES `mydb`.`Carrera` (`idCarrera`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
