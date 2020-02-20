
import React from 'react';
import { CSSObject } from 'styled-components';

const formStyle: CSSObject = {
    background: '#ffffff',
    border: '1px solid rgba(0,0,0,0.1)',
    borderRadius: 3,
    boxShadow: '0 1px 2px rgba(0,0,0,.05)',
    width: '50%',
    margin: 20,
    padding: 20,
};

export function ProductDetailsBox() {
    return (
        <div style={formStyle}>
            <h1>Produktdetails</h1>
            <h3>Selected product group:</h3>

            <>
                <h3>Aaaaa:</h3>

            </>

            <hr></hr>
        </div>
    )
}