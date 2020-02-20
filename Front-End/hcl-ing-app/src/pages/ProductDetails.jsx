import React, { useState, useEffect } from "react";
import { ProductDetailsBox } from "../components/ProductDetailsComponent";

export const ProductDetails = () => {
  const [productDetails, setProductDetails] = useState();
  useEffect(() => {
    fetch("http://www.mocky.io/v2/5e4eba8c2f00004ffc16aad2")
      .then(response => {
        return response.json();
      })
      .then(data => {
        setProductDetails(data);
      });
  }, []);
  return <ProductDetailsBox productDetails={productDetails} />;
};
