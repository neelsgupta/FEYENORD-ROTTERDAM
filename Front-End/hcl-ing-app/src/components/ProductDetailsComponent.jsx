import React from "react";
import styled from "styled-components";
import Grid from "@material-ui/core/Grid";
import Card from "@material-ui/core/Card";
import { CardContent, Typography } from "@material-ui/core";

const CardForm = styled.div`
  height: auto;
  width: auto;
  text-align: left;
`;

const ViewData = ({ data }) => {
  const gridList = [];
  for (let prop in data) {
    gridList.push(
      <>
        <Grid item xs={4}>
          <h3>{prop}:</h3>
        </Grid>
        <Grid item xs={8}>
          <h3>data[prop]</h3>
        </Grid>
        <hr></hr>
      </>
    );
  }

  return <Grid container>{gridList.map(grid => grid)}</Grid>;
};

export function ProductDetailsBox({ productDetails }) {
  if (!productDetails) {
    return "Loading! Please wait ...";
  }
  return (
    <CardForm>
      <h1>Produktdetails</h1>
      <hr></hr>
      <h3>{productDetails.selectedProductGroup}</h3>
      <h4>{productDetails.slectedProductName}</h4>
      <hr></hr>
      <Grid container>
        <Grid item xs={4}>
          <h3>Aaaaa:</h3>
        </Grid>
        <Grid item xs={8}>
          <h3>xxxxxx</h3>
        </Grid>
        <hr></hr>
      </Grid>
      <Card>
        <CardContent>
          <Typography variant="h5">Other group products</Typography>
          {productDetails.otherGroupProducts.map(product => (
            <Typography key={product.id}>- {product.name}</Typography>
          ))}
        </CardContent>
      </Card>
    </CardForm>
  );
}
