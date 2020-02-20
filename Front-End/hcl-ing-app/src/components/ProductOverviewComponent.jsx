import React from "react";
import {
  ExpansionPanel,
  ExpansionPanelSummary,
  ExpansionPanelDetails,
  Typography
} from "@material-ui/core";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import { Link } from "react-router-dom";

const ProductOverviewLayout = ({ accountsData }) => {
  if (!accountsData) {
    return "Loading! Please wait..";
  }
  return (
    <>
      <h1>Producten ING</h1>
      <hr />
      <div>
        {accountsData.map(account => (
          <ExpansionPanel key={account.name}>
            <ExpansionPanelSummary
              expandIcon={<ExpandMoreIcon />}
              aria-controls="panel1a-content"
              id="panel1a-header"
            >
              <Typography>
                {account.name} | {account.childAccount.length}
              </Typography>
            </ExpansionPanelSummary>
            <ExpansionPanelDetails style={{ flexDirection: "column" }}>
              <ChildAccount accounts={account.childAccount} />
            </ExpansionPanelDetails>
          </ExpansionPanel>
        ))}
      </div>
    </>
  );
};

const ChildAccount = ({ accounts }) => {
  return (
    <>
      {accounts.map(account => (
        <div key={account.id} style={{ alignSelf: "flex-start" }}>
          <Typography>
            - <Link to={`/ProductDetails/${account.id}`}>{account.name}</Link>
          </Typography>
        </div>
      ))}
    </>
  );
};

export default ProductOverviewLayout;
