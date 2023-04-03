import { Sequelize } from "sequelize";
import mysql from "mysql2";

const connection = mysql.createConnection({
  host: "localhost",
  port: 3306,
  user: "root",
  password: "emcuong",
  database: "restful",
});

const sequelize = new Sequelize("restful", "root", "emcuong", {
  host: "localhost",
  dialect: "mysql",
});

export { connection, sequelize };
