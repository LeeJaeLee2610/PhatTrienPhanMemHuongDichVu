import express from "express";
import cors from "cors";
import bodyParser from "body-parser";
import User1 from "./model/user1.js";
import Company from "./model/company.js";
import Product from "./model/product.js";

const app = express();

app.use(cors());
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.get("/bai1/list-user", async (req, res) => {
  const list = await User1.findAll();
  console.log(list);
  res.status(200).json(list);
});

app.get("/ba1/get-user-by-id/:id", async (req, res) => {
  const user = await User1.findOne({ where: { id: req.params.id } });
  res.status(200).json(user);
});

app.post("bai1/update-so-tien/:id", async (req, res) => {
  await User1.update(
    { sotien: req.body.sotien },
    {
      where: { id: req.params.id },
    }
  );
  res.status(200).json("OK");
});

app.post("/bai1/update-thanh-toan/:id", async (req, res) => {
  await User1.update(
    {
      isthanhtoan: 1,
    },
    { where: { id: req.params.id } }
  );
  res.status(200).json("OK");
});

app.post("/bai2/check-order-status", async (req, res) => {
  const { orderNumber, companyID } = req.body;
  const company = await Company.findOne({
    where: { orderNumber: orderNumber, companyID: companyID },
  });
  res.status(200).json(company);
});

app.post("/bai3/check-product", async (req, res) => {
  const { loai, soluong } = req.body;
  const product = await Product.findAll({
    where: {
      loai: loai,
      soluong: soluong,
    },
  });
  if (product) {
    res.status(200).send({
      message: "Sản phẩm tồn tại",
      products: product,
    });
  } else {
    res.status(200).send({ message: "Sản phẩm ko tồn tại" });
  }
});

app.listen(3030);
