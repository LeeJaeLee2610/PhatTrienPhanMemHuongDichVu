import Company from "../model/company.js";
import Product from "../model/product.js";
// import User1 from "../model/user1.js";
import { sequelize } from "./database.js";

try {
  await sequelize.authenticate();
  // await User1.sync({ alter: true });
  // await User1.create({
  //   name: "Phung Cuong",
  //   kieuthe: "vjp",
  //   sothe: 1,
  //   cvc: "123",
  //   namhethan: "2023-04-30",
  // });
  // await User1.create({
  //   name: "Duc Bui",
  //   kieuthe: "vjp1",
  //   sothe: 2,
  //   cvc: "124",
  //   namhethan: "2023-04-30",
  // });
  // await User1.create({
  //   name: "Hung Dinh",
  //   kieuthe: "vjp2",
  //   sothe: 3,
  //   cvc: "125",
  //   namhethan: "2023-04-30",
  // });
  // await Company.sync({ alter: true });
  // await Company.create({
  //   orderNumber: "ZRA56782C",
  //   companyID: "Mega Electronics Ltd.",
  // });
  await Product.sync({ alter: true });
  await Product.create({ pname: "San pham 1", loai: 1, soluong: 4 });
  await Product.create({ pname: "San pham 2", loai: 2, soluong: 5 });
  await Product.create({ pname: "San pham 3", loai: 3, soluong: 6 });
  console.log("Connection has been established successfully.");
  sequelize.close();
} catch (error) {
  console.log(error);
}
