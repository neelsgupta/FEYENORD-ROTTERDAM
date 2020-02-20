import React from 'react';
import { BrowserRouter as Router,Switch, Route } from 'react-router-dom';


const Routes = () => {
    return (<Router>
        <Switch>
            <Route path="/ProductOverview">
              <span>ProductOverview</span>
            </Route>
            <Route path="/ProductDetails">
            <span>ProductDetails</span>
            </Route>
            <Route path="/">
            <span>home</span>
            </Route>
          </Switch>
          </Router>)
}

export default Routes;
