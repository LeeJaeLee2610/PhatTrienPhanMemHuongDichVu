import axios from "axios";
import React, { useState } from "react";

export default function bai2() {
  const [company, setCompany] = useState(null);
  const handleClick = async () => {
    const orderNumber = document.querySelector(".orderNumber").value;
    const companyID = document.querySelector(".companyID").value;
    await axios
      .post("http://localhost:3030/bai2/check-order-status", {
        orderNumber: orderNumber,
        companyID: companyID,
      })
      .then(function (response) {
        // console.log(response);
        setCompany(response.data);
      })
      .catch(function (error) {
        console.log(error);
      });
  };
  return (
    <div>
      <div>
        <input
          type="text"
          placeholder="orderNumber"
          className="orderNumber"
        ></input>
        <input
          type="text"
          placeholder="companyID"
          className="companyID"
        ></input>
      </div>
      <div onClick={handleClick}>Click</div>
    </div>
  );
}
