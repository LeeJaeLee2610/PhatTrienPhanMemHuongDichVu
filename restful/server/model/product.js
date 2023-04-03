import { DataTypes } from "sequelize";
import { sequelize } from "../db/database.js";

const Product = sequelize.define("product", {
  id: {
    type: DataTypes.INTEGER,
    autoIncrement: true,
    primaryKey: true,
  },
  pname: {
    type: DataTypes.STRING,
  },
  loai: {
    type: DataTypes.INTEGER,
  },
  soluong: {
    type: DataTypes.INTEGER,
  },
});

export default Product;
