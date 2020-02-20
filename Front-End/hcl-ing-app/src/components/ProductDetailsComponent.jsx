
import React from 'react';
import styled from "styled-components";
import Grid from '@material-ui/core/Grid';
import Card from '@material-ui/core/Card';
import {
    CardContent,
    Typography
} from "@material-ui/core";

const CardForm = styled.div`
  height: auto;
  width: auto;
  text-align: left;
`;

export function ProductDetailsBox() {
    return (
        <CardForm >
            <h1>Produktdetails</h1>
            <hr></hr>
            <h3>Selected product group</h3>
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
                    <Typography>
                        Other group products
                    </Typography>
                    <Typography>
                        -Product Name 1
                    </Typography>
                </CardContent>
            </Card>
        </CardForm>
    )
}