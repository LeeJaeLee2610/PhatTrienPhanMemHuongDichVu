import { DataTypes } from "sequelize";
import { sequelize } from "../db/database.js";

const User1 = sequelize.define(
  "user1",
  {
    id: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      autoIncrement: true,
      allowNull: false,
    },
    name: {
      type: DataTypes.STRING,
    },
    kieuthe: {
      type: DataTypes.STRING,
    },
    sothe: {
      type: DataTypes.INTEGER,
    },
    cvc: {
      type: DataTypes.STRING,
    },
    namhethan: {
      type: DataTypes.DATE,
      allowNull: true,
    },
    sotien: {
      type: DataTypes.DOUBLE,
      allowNull: true,
    },
    isthanhtoan: {
      type: DataTypes.INTEGER,
      defaultValue: 0,
    },
  },
  { timestamps: false }
);

export default User1;
