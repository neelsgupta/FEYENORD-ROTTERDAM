import React from "react";
import {
  ExpansionPanel,
  ExpansionPanelSummary,
  ExpansionPanelDetails,
  Typography
} from "@material-ui/core";
import ExpandMoreIcon from "@material-ui/icons/ExpandMore";
import { Link } from "react-router-dom";

const ProductOverview = () => {
  const accountsData = [
    {
      name: "Savings",
      childAccount: [
        {
          id: 1,
          name: "Orange Savings Account"
        },
        {
          id: 2,
          name: "Bonus Interest Account"
        },
        {
          id: 3,
          name: "Savings Deposit"
        }
      ]
    },
    {
      name: "Payments",
      childAccount: [
        {
          id: 4,
          name: "Payments Account"
        },
        {
          id: 5,
          name: "Debit Card"
        },
        {
          id: 6,
          name: "Quarterly Limit"
        },
        {
          id: 7,
          name: "Continiously Limit"
        }
      ]
    },
    {
      name: "Mortgage",
      childAccount: [
        {
          id: 4,
          name: "Banking Saving Mortgage"
        },
        {
          id: 5,
          name: "Interest Only"
        }
      ]
    }
  ];

  return (
    <>
      <h1>Producten ING</h1>
      <hr />
      <div>
        {accountsData.map(account => (
          <ExpansionPanel>
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
        <div style={{ alignSelf: "flex-start" }}>
          <Typography>
            - <Link to={`/ProductDetails/${account.id}`}>{account.name}</Link>
          </Typography>
        </div>
      ))}
    </>
  );
};

export default ProductOverview;
