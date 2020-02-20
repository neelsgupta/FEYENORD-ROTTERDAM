import React from 'react';
import './App.css';
import logo from './inglogo.png';
import Routes from './Routes';
import { CSSObject } from 'styled-components';
import styled from "styled-components";

const Image = styled.img`
  height: 50px;
  width: 80px;
  align-self: flex-start;
  display: flex;
`;

const appStyle: CSSObject = {
    background: '#ffffff',
    border: '1px solid rgba(0,0,0,0.1)',
    borderRadius: 3,
    boxShadow: '0 1px 2px rgba(0,0,0,.05)',
    width: 'auto',
    margin: 20,
    padding: 20,
};

function App() {
    return (
        <div style={appStyle} className="App">
            <Image src={logo} alt="logo" />
            <Routes />
        </div>
    );
}

export default App;
