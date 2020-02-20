import React, { useEffect } from "react";
import ProductOverviewLayout from "../components/ProductOverviewComponent";
import { useState } from "react";

const ProductOverview = () => {
  const [accountData, setAccountData] = useState();
  useEffect(() => {
    fetch("http://www.mocky.io/v2/5e4eb0af2f000095ee16aa71")
      .then(response => {
        return response.json();
      })
      .then(data => {
        setAccountData(data);
      });
  }, []);

  return <ProductOverviewLayout accountsData={accountData} />;
};

export default ProductOverview;
