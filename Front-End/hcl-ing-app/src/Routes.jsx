import React from "react";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import ProductOverview from "./pages/ProductOverview";
import { ProductDetails } from "./pages/ProductDetails";

const Routes = () => {
  return (
    <Router>
      <Switch>
        <Route path="/ProductOverview">
          <ProductOverview />
        </Route>
        <Route path="/ProductDetails">
          <ProductDetails />
        </Route>
        <Route path="/">
          <span>home</span>
        </Route>
      </Switch>
    </Router>
  );
};

export default Routes;
