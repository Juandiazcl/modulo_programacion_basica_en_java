-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bdrymas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bdrymas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bdrymas` DEFAULT CHARACTER SET utf8 ;
USE `bdrymas` ;

-- -----------------------------------------------------
-- Table `bdrymas`.`Canal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Canal` (
  `idCanal` INT NOT NULL AUTO_INCREMENT,
  `idCliente` INT NULL,
  `nomTienda` VARCHAR(45) NOT NULL,
  `numTrabajadores` INT NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`idCanal`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdrymas`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `rut` VARCHAR(12) NOT NULL,
  `direccion` VARCHAR(30) NOT NULL,
  `comuna` VARCHAR(30) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `canal` VARCHAR(1) NOT NULL,
  `fono` VARCHAR(11) NOT NULL,
  `numPedido` INT NOT NULL,
  `idTienda` INT NULL,
  PRIMARY KEY (`idCliente`),
  INDEX `fk_cliente_tienda_idx` (`idTienda` ASC),
  CONSTRAINT `fk_cliente_tienda`
    FOREIGN KEY (`idTienda`)
    REFERENCES `bdrymas`.`Canal` (`idCanal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdrymas`.`Proveedores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Proveedores` (
  `idProveedor` INT NOT NULL AUTO_INCREMENT,
  `idProducto` INT NOT NULL,
  `preCosto` INT NOT NULL,
  `cantidad` INT NOT NULL,
  `idBodega` INT NOT NULL,
  `totalCompra` INT NOT NULL,
  PRIMARY KEY (`idProveedor`),
  INDEX `fk_proveedores_bodega_idx` (`idBodega` ASC),
  INDEX `fkproveedores_producto_idx` (`idProducto` ASC),
  CONSTRAINT `fk_proveedores_bodega`
    FOREIGN KEY (`idBodega`)
    REFERENCES `bdrymas`.`Bodega` (`idMovimiento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fkproveedores_producto`
    FOREIGN KEY (`idProducto`)
    REFERENCES `bdrymas`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdrymas`.`Producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Producto` (
  `idProducto` INT NOT NULL AUTO_INCREMENT,
  `nombrePro` VARCHAR(25) NOT NULL,
  `descripcion` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(15) NOT NULL,
  `preCompra` INT NOT NULL,
  `preVenta` INT NOT NULL,
  `stockCritico` INT NOT NULL,
  `stockActual` INT NOT NULL,
  `idProveedor` INT NULL,
  PRIMARY KEY (`idProducto`),
  INDEX `fk_producto_proveedores_idx` (`idProveedor` ASC),
  CONSTRAINT `fk_producto_proveedores`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `bdrymas`.`Proveedores` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdrymas`.`Pedidos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Pedidos` (
  `idPedido` INT NOT NULL AUTO_INCREMENT,
  `idCliente` INT NOT NULL,
  `idproducto` INT NOT NULL,
  `producto` VARCHAR(25) NOT NULL,
  `cantidad` INT NOT NULL,
  `preVta` INT NOT NULL,
  `totalVta` INT NOT NULL,
  `fechaPed` DATE NOT NULL,
  PRIMARY KEY (`idPedido`),
  INDEX `fk_pedidos_cliente_idx` (`idCliente` ASC),
  INDEX `fk_pedidos_productos_idx` (`idproducto` ASC),
  CONSTRAINT `fk_pedidos_cliente`
    FOREIGN KEY (`idCliente`)
    REFERENCES `bdrymas`.`Cliente` (`idCliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_productos`
    FOREIGN KEY (`idproducto`)
    REFERENCES `bdrymas`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bdrymas`.`Bodega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bdrymas`.`Bodega` (
  `idMovimiento` INT NOT NULL AUTO_INCREMENT,
  `idProducto` INT NOT NULL,
  `stock` INT NOT NULL,
  `preCosto` INT NOT NULL,
  `totMovimeinto` INT NOT NULL,
  `idProveedor` INT NOT NULL,
  `tipoMov` VARCHAR(1) NOT NULL,
  `idPedido` INT NOT NULL,
  `fecMovimeinto` INT NOT NULL,
  PRIMARY KEY (`idMovimiento`),
  INDEX `fk_bodega_productos_idx` (`idProducto` ASC),
  INDEX `fk_bodega_pedido_idx` (`idPedido` ASC),
  INDEX `fk_bodega_proveedores_idx` (`idProveedor` ASC),
  CONSTRAINT `fk_bodega_productos`
    FOREIGN KEY (`idProducto`)
    REFERENCES `bdrymas`.`Producto` (`idProducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bodega_pedido`
    FOREIGN KEY (`idPedido`)
    REFERENCES `bdrymas`.`Pedidos` (`idPedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bodega_proveedores`
    FOREIGN KEY (`idProveedor`)
    REFERENCES `bdrymas`.`Proveedores` (`idProveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
