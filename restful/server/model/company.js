import { DataTypes } from "sequelize";
import { sequelize } from "../db/database.js";

const Company = sequelize.define(
  "company",
  {
    id: {
      type: DataTypes.INTEGER,
      primaryKey: true,
      autoIncrement: true,
    },
    orderNumber: {
      type: DataTypes.STRING,
    },
    companyID: {
      type: DataTypes.STRING,
    },
  },
  { timestamps: false }
);

export default Company;
